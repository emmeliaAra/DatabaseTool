import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.util.Callback;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

public class GraphicalUserInterface extends Application {

    private static Main myMain;
    private TreeParser myTreeParser;
    private static final int COLUMN_NUM= 8 ;
    private static final int ROWS_NUM = 20 ;
    private static final int CANONICAL_TREE_STATUS = 0;
    private static final int OPTIMIZED_TREE_STATUS = 1;
    private static final int BUTTON_PREFERRED_SIZE = 100;
    private final int DROP_STATUS = 0;
    private final int SELECT_STATUS = 1;
    private TreeView<Button> buttonCanonicalTree, buttonOptimizedTree;
    private HashMap<Button,Integer> canonicalButtonsInOrder = new HashMap<>();
    private HashMap<Button,Integer> optimalButtonsInOrder = new HashMap<>();
    private String thisIsTheInput = null, path;
    private static MySQLite mySQLite = null;
    private TableView<Object> tableView;
    private Label messageArea;
    private LinkedList<Stage> newStages = new LinkedList<>();
    private GridPane leftGrid,rightGrid;
    private MyFileChooser fileChooser;
    private int gridRows=0,gridColumns=0;
    private TextField statementField;
    private LinkedList<Integer> rowItemCount;

    public static void main(String[]args) {

        myMain = new Main();
        //this method internally calls the start() method of the Application class
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        rowItemCount = new LinkedList<>();
        //Create a boarderPane to build on
        BorderPane borderPane = new BorderPane();

        //Create an HBox to hold the menu Bar, one for TextLabel, TextField, SubmitButton, CloseButton and one(VBOX) to hold those 2
        HBox menuHBox = new HBox(); //menuBar
        HBox statementBox = new HBox(); // TextLabel1, TextField, SubmitButton, CloseButton
        VBox finalHBox = new VBox(); // menuBox, statementBox


        //Create the menuBar and menu Items -- Not Finished
        MenuBar menuBar = new MenuBar();
        Menu file = new Menu("File");
        Menu options = new Menu("Options");
        menuBar.getMenus().addAll(file,options);

        MenuItem loadDataBase = new MenuItem("Load Database");
        MenuItem exit = new MenuItem("exit");
        file.getItems().addAll(loadDataBase,exit);
        MenuItem resetDatabase  = new MenuItem("Reset Database");
        MenuItem saveDatabase = new MenuItem("Save Database");
        options.getItems().addAll(resetDatabase,saveDatabase);


        //ADD ALL ITEMS TO THE topHBox
        menuHBox.getChildren().addAll(menuBar);

        //Create a label to indicate the use of the textBox
        Label statementLabel = new Label("SQLite Statement");

        //Create a textField for to enter the statement
        statementField = new TextField();
        statementField.setPrefColumnCount(85);

        //Create buttons to submit and clear the statement
        Button submitButton = new Button("Submit");
        Button clearButton = new Button("Clear");
        submitButton.setPrefWidth(80);
        clearButton.setPrefWidth(80);

        statementBox.setSpacing(10);
        statementBox.getChildren().addAll(statementLabel,statementField,submitButton,clearButton);
        finalHBox.getChildren().addAll(menuHBox,statementBox);

        //Create GridPanes for the trees.
        leftGrid = new GridPane();
        setGridConstraints(leftGrid,COLUMN_NUM,ROWS_NUM);
        rightGrid = new GridPane();
        setGridConstraints(rightGrid,COLUMN_NUM,ROWS_NUM);

        Screen myScreen = Screen.getPrimary();
        Rectangle2D bounds = myScreen.getVisualBounds();


        ScrollPane leftScrollPane = new ScrollPane(leftGrid);
        ScrollPane rightScrollPane = new ScrollPane(rightGrid);

        leftScrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        leftScrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        rightScrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        rightScrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
    //    leftScrollPane.setPrefSize((bounds.getWidth()/2), bounds.getHeight() - 100);
      //  rightScrollPane.setPrefSize((bounds.getWidth()/2), bounds.getHeight() - 100);
        leftGrid.setPrefSize((bounds.getWidth()/2), bounds.getHeight() - 100);
        rightGrid.setPrefSize((bounds.getWidth()/2), bounds.getHeight() - 100);

        borderPane.setMinSize(bounds.getWidth() - 100, bounds.getHeight() - 100);
        borderPane.setTop(finalHBox);

        borderPane.setLeft(leftScrollPane);
        borderPane.setRight(rightScrollPane);

        Scene myScene = new Scene(borderPane);
        myScene.setFill(Color.BLUE);
        primaryStage.setTitle("Database Tool");
        primaryStage.setScene(myScene);
        primaryStage.show();

        fileChooser = new MyFileChooser();

        messageArea = new Label();
        messageArea.setPrefHeight(bounds.getHeight()/4);
        messageArea.setPrefWidth(bounds.getWidth());
        messageArea.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
        messageArea.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        messageArea.setAlignment(Pos.TOP_LEFT);
        messageArea.setFont(Font.font(15));
        leftGrid.setStyle("-fx-background-color: #336699;");

        Label canonicalLabel  = new Label("Canonical Tree");
        Label optimizedLabel  = new Label("Optimized Tree");
        canonicalLabel.setFont(Font.font(15));
        optimizedLabel.setFont(Font.font(15));

        //Add action to button
        submitButton.setOnMouseClicked(e -> {
            if(path == null) {
                messageArea.setText("Please Choose a DataBase First");
                borderPane.setBottom(messageArea);
            }
            else{
                String charStream = statementField.getText();
                //If enter is pressed but the textField is empty
                if (charStream.isEmpty()) {
                    clearStage(false);
                    safeCloseConnection(mySQLite);
                    messageArea.setText("Please give a statement");
                    borderPane.setBottom(null);
                    borderPane.setBottom(messageArea);
                }
                else {
                    //Checks if the input is the same as the last one added. If yes then do nothing if no then present the new trees.
                    if (!charStream.equalsIgnoreCase(thisIsTheInput)){
                        //If is not the first statement then delete the previously created tables and close the connection
                        if(thisIsTheInput != null) {
                            clearStage(true);
                            safeCloseConnection(mySQLite);
                        }

                        gridColumns = 0; gridRows = 0;
                        myTreeParser = myMain.main(charStream,path);
                        if(myTreeParser.getParserStatus() == SELECT_STATUS){
                            TreeStructure<String> canonicalTree = myTreeParser.getCanonicalTree();
                            canonicalTree =  myTreeParser.setNodeID(canonicalTree);
                            mySQLite = myTreeParser.getMySQLite();

                            LinkedList<String> canonicalInOrder = myTreeParser.getNodeIdInOrderCanonical();

                            createTreeView(canonicalTree.getRootNode(), null, CANONICAL_TREE_STATUS,0);
                            checkMinGridContraints();
                            setGridConstraints(leftGrid,gridColumns,gridRows);
                            makeTReeVertical(buttonCanonicalTree.getRoot(),1,gridColumns/2,leftGrid);gridRows = 0; gridColumns = 0;
                            addActionToTree(buttonCanonicalTree.getRoot(),canonicalInOrder,mySQLite,canonicalButtonsInOrder);

                            leftGrid.add(canonicalLabel,4,0,6,1);

                            TreeStructure<String> optimizesTree = myTreeParser.getOptimizedTree();
                            if(optimizesTree!= null) {
                                optimizesTree = myTreeParser.setNodeID(optimizesTree);
                                LinkedList<String> optimalInOrder = myTreeParser.getNodeIdInOrderOptimal();
                                createTreeView(optimizesTree.getRootNode(), null, OPTIMIZED_TREE_STATUS, 0);
                                addActionToTree(buttonOptimizedTree.getRoot(), optimalInOrder, mySQLite, optimalButtonsInOrder);
                                checkMinGridContraints();
                                setGridConstraints(rightGrid, gridColumns, gridRows);
                                makeTReeVertical(buttonOptimizedTree.getRoot(), 1, gridColumns / 2, rightGrid);
                                rightGrid.add(optimizedLabel,4,0,6,1);
                            }else{
                                Label label = new Label("There is no Optimal Tree to display when the Statement contains the operator 'OR'");
                                label.setFont(Font.font(15));
                                setGridConstraints(rightGrid,COLUMN_NUM,ROWS_NUM);
                                rightGrid.add(label,1,2,10,5);
                            }
                            thisIsTheInput = charStream;
                            tableView = displayResults(mySQLite,myTreeParser.getFinalTable());
                            mySQLite.getSchema();
                            borderPane.setBottom(tableView);
                        }
                        else if(myTreeParser.getParserStatus() == DROP_STATUS){
                            messageArea.setText("Table " + myTreeParser.getDropTableName() + " is dropped successfully ");
                            borderPane.setBottom(null);
                            borderPane.setBottom(messageArea);
                            safeCloseConnection(myTreeParser.getMySQLite());
                        }else{
                            VBox messageBox = new VBox();
                            ScrollPane messageScrollPane = new ScrollPane(messageBox);
                            messageScrollPane.setPrefHeight(bounds.getHeight()/4);
                            Vector<String> errorMessages = myTreeParser.getMessages();

                            for (int i=0; i<errorMessages.size(); i++){
                                Label newLabel  = new Label(i+1 + "." +errorMessages.get(i));
                                newLabel.setFont(Font.font(15));
                                messageBox.getChildren().add(newLabel);
                            }

                            borderPane.setBottom(messageScrollPane);
                            safeCloseConnection(myTreeParser.getMySQLite());
                        }
                    }
                }
            }
        });

        clearButton.setOnMouseClicked(event -> {

            clearStage(false);
            borderPane.setBottom(null);
            safeCloseConnection(mySQLite);
            thisIsTheInput =null;
        });

        loadDataBase.setOnAction(event -> {
            clearStage(false);
            borderPane.setBottom(null);
            safeCloseConnection(mySQLite);
            fileChooser.replaceFile();
            path = fileChooser.setFileChooser(primaryStage) ;
            messageArea.setText("Database loaded");
            borderPane.setBottom(messageArea);
        });

        exit.setOnAction(event -> {
            event.consume();
            safeCloseConnection(mySQLite);
            clearStage(false);
            borderPane.setBottom(null);
            askToCommit(event);
        });

        resetDatabase.setOnAction(event -> {
            safeCloseConnection(mySQLite);
            clearStage(false);
            fileChooser.replaceFile();
            fileChooser.copyFile(path);
        });

        saveDatabase.setOnAction(event -> {
            safeCloseConnection(mySQLite);
            clearStage(false);
            borderPane.setBottom(null);
            fileChooser.saveWithoutExit();
        });

        //Close window when close window
        primaryStage.setOnCloseRequest(e -> {
            e.consume();
            askToCommit(e);
        });
    }

    public void setGridConstraints(GridPane gridPane,int gridColumns,int gridRows) {

        gridPane.getColumnConstraints().clear();
        gridPane.getRowConstraints().clear();
        for (int i = 0; i < gridColumns; i++) {
            ColumnConstraints colConst = new ColumnConstraints();
            colConst.setPercentWidth(100.0 / gridColumns);
            gridPane.getColumnConstraints().add(colConst);
        }
        for (int i = 0; i < gridRows; i++) {
            RowConstraints rowConst = new RowConstraints();
            rowConst.setPercentHeight(100.0 / gridRows);
            gridPane.getRowConstraints().add(rowConst);
        }
        gridPane.setGridLinesVisible(true);
    }

    public void createTreeView(TreeStructure.Node<String> node,TreeItem<Button> treeItem,int treeType, int rowPos){

        TreeItem<Button> newItem;
        Button newButton = new Button(node.getData());
        newButton.setPrefWidth(BUTTON_PREFERRED_SIZE);
        newItem = new TreeItem<>(newButton);
        Tooltip tooltip = new Tooltip(node.getData());
        newButton.setTooltip(tooltip);

        //If the rootNode is passed initialise the treeView using the rootNode. If not add the new node to the treeItem and call this method for every node's child
        if(treeItem == null && node.getParentNode() == null ) {
            gridColumns++;
            gridRows++;
            rowItemCount.add(1);
            if(treeType == CANONICAL_TREE_STATUS) {
                buttonCanonicalTree = new TreeView<>(newItem);
                canonicalButtonsInOrder.put(newButton,node.getNodeID());
            }else {
                buttonOptimizedTree = new TreeView<>(newItem);
                optimalButtonsInOrder.put(newButton,node.getNodeID());
            }
        }else {
            treeItem.getChildren().add(newItem);
            if(treeType == CANONICAL_TREE_STATUS)
                canonicalButtonsInOrder.put(newButton,node.getNodeID());
            else
                optimalButtonsInOrder.put(newButton,node.getNodeID());

            if(node.getParentNode().getChildren().size()==1) {
                gridRows++;
                rowItemCount.add(1);
            }else
                if(node.getParentNode().getChildren().get(0) == node) {
                    gridRows++;
                    gridColumns+=2;
                    if(rowItemCount.size()> rowPos)
                        rowItemCount.set(rowPos, rowItemCount.get(rowPos) + 1);
                    else
                        rowItemCount.add(1);
                }else
                    rowItemCount.set(rowPos,rowItemCount.get(rowPos)+1);
        }
        rowPos++;
        int finalRowPos = rowPos;
        node.getChildren().forEach(each -> createTreeView(each,newItem,treeType, finalRowPos));
    }

    public void makeTReeVertical(TreeItem<Button> item,int x, int y,GridPane grid)
    {
        if( item.getParent()== null)
            grid.add(item.getValue(), y,x);

        else if(item.getParent().getChildren().size() == 1) {
            //create the line to point to the next one and place it at the center.
            Line line = new Line(0,0,0,25);
            grid.add(line,y,x+1);
            grid.setHalignment(line, HPos.CENTER);
            x+=2;
            grid.add(item.getValue(),y,x);

        }else if(item.getParent().getChildren().size() == 2)
        {
            int startX =0, startY=0, endX, endY;
            HPos pos;
            if(item == item.getParent().getChildren().get(0)) {
                x = x+2;
                y = y-1;
                endX = -30;
                endY = 25;
                pos = HPos.RIGHT;
            }else {
                x = x +2;
                y = y +1;

                endX = 30;
                endY = 25;
                pos = HPos.LEFT;
            }
            Line line = new Line(startX,startY,endX,endY);
            grid.add(line,y,x-1);
            grid.setHalignment(line,pos);
            grid.add(item.getValue(),y,x);
        }
        int finalX = x;
        int finalY = y;
        //place the item in the center.
        grid.setHalignment(item.getValue(),HPos.CENTER);
        item.getChildren().forEach(each -> makeTReeVertical(each, finalX, finalY,grid));
    }


    //Add action to The button Trees
    public void addActionToTree(TreeItem<Button> treeItem, LinkedList<String> myList, MySQLite mySQLite,HashMap<Button,Integer> buttonsInOrder)
    {
        treeItem.getValue().setOnMouseClicked(e -> {
            int pos = buttonsInOrder.get(treeItem.getValue());

            //Create the table , the new stage. keep track of all new stages to close them when a new statement is added
            TableView tempTable = displayResults(mySQLite,myList.get(pos));
            Stage stage = new Stage();
            newStages.add(stage);

            BorderPane pane = new BorderPane();
            pane.setMinSize(800, 100);
            Scene myScene = new Scene(pane);
            stage.setTitle("RESULTS OF NODE: " + myList.get(pos));
            stage.setScene(myScene);
            pane.setCenter(tempTable);
            stage.show();

        });
        treeItem.getChildren().forEach(each -> addActionToTree(each,myList,mySQLite,buttonsInOrder));
    }

    public TableView displayResults(MySQLite mySQLite, String relation)
    {
        TableView results = new TableView<>();
        LinkedList<String> columnNames = mySQLite.getColumnNames(relation);

        int i=0;
        for (String columnName :columnNames) {
            final int j = i;
            TableColumn tableColumn = new TableColumn(columnName);
            tableColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>() {
                public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {
                    if(param.getValue().get(j) == null) // when there are null values in the table!!
                        return new SimpleStringProperty(null);
                    else
                        return new SimpleStringProperty(param.getValue().get(j).toString());
                }
            });
            i++;
            results.getColumns().add(tableColumn);
        }

        results = mySQLite.getRows(results,relation);
        results.setMaxHeight(250);
        results.onScrollToProperty();
        return results;
    }

    public void clearStage(boolean comingFromSubmit)
    {
        for (Stage stage: newStages) {
            stage.close();
        }

        if(tableView != null) {
            tableView.getItems().clear();
            tableView.getColumns().clear();
        }

        rightGrid.getChildren().clear();
        leftGrid.getChildren().clear();

        if(!comingFromSubmit){
            statementField.clear();
            thisIsTheInput = null;
        }

        rowItemCount = new LinkedList<>();


    }

    public void safeCloseConnection(MySQLite mySQLite)
    {
        try {
            if(mySQLite!= null && !mySQLite.connection.isClosed())
            {
                Vector<String> tempNewCreated = mySQLite.getNewTablesCreated();
                mySQLite.close();
                mySQLite = new MySQLite(path);
                mySQLite.undoTables(tempNewCreated);
                mySQLite.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void askToCommit(Event e) {
        BorderPane pane = new BorderPane();
        Scene myScene = new Scene(pane);
        Stage stage = new Stage();
        newStages.add(stage);
        pane.setMinSize(50, 50);
        stage.setTitle("Database Tool");
        stage.setScene(myScene);

        Label label = new Label("Want to save any changes to the Database?");
        pane.setTop(label);

        Button save = new Button("Save");
        Button dontSave = new Button("Don't save");
        Button cancel = new Button("Cancel");
        HBox box = new HBox();
        box.setAlignment(Pos.CENTER);
        box.setSpacing(15);
        box.getChildren().addAll(save,dontSave,cancel);
        pane.setBottom(box);

        save.setOnMouseClicked(event ->{
            stage.close();
            safeCloseConnection(mySQLite);
            clearStage(false);
            if(fileChooser != null)
                fileChooser.deleteCopy();
            Platform.exit();
            System.exit(0);
        } );

        dontSave.setOnMouseClicked(event -> {
            stage.close();
            safeCloseConnection(mySQLite);
            clearStage(false);
            if(fileChooser!= null)
                fileChooser.replaceFile();
            Platform.exit();
            System.exit(0);

        });
        cancel.setOnMouseClicked(event -> {
            stage.close();
            e.consume();
        });
        stage.show();
    }

    public void checkMinGridContraints(){
        if(gridColumns <COLUMN_NUM)
            gridColumns = COLUMN_NUM;
        if(gridRows <ROWS_NUM)
            gridRows = ROWS_NUM;
    }
}

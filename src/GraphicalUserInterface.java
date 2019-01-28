import com.sun.xml.internal.ws.api.model.MEP;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.util.Callback;
import org.omg.PortableServer.POA;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

public class GraphicalUserInterface extends Application {

    private static Main myMain;
    private TreeParser myTreeParser;
    private static final int COLUMN_NUM= 8 ;
    private static final int ROWS_NUM = 20 ;
    private static final int CANONICAL_TREE_STATUS = 0;
    private static final int OPTIMIZED_TREE_STATUS = 1;
    private static final int BUTTON_PREFERRED_SIZE = 100;
    private final int DROP_STATUS = 0;
    private final int CREATE_STATUS = 1;
    private final int SELECT_STATUS = 2;
    private TreeView<Button> buttonCanonicalTree, buttonOptimizedTree;
    private HashMap<Button,Integer> canonicalButtonsInOrder = new HashMap<>();
    private HashMap<Button,Integer> optimalButtonsInOrder = new HashMap<>();
    private String thisIsTheInput = null, path;
    private static MySQLite mySQLite = null;
    private TableView<Object> tableView;
    private Label messageArea;
    private LinkedList<Stage> newStages = new LinkedList<>();
    private GridPane leftGrid,rightGrid;
    private int status;
    private MyFileChooser fileChooser;

    public static void main(String[]args) {

        myMain = new Main();
        //this method internally calls the start() method of the Application class
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

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
        TextField statementField = new TextField();
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
        setGridConstraints(leftGrid);

        rightGrid = new GridPane();
        setGridConstraints(rightGrid);

        Screen myScreen = Screen.getPrimary();
        Rectangle2D bounds = myScreen.getVisualBounds();

        leftGrid.setMaxSize((bounds.getWidth()/2), bounds.getHeight() - 100);
        rightGrid.setMaxSize((bounds.getWidth()/2), bounds.getHeight() - 100);

        borderPane.setMinSize(bounds.getWidth() - 100, bounds.getHeight() - 100);
        borderPane.setTop(finalHBox);

        borderPane.setLeft(leftGrid);
        borderPane.setRight(rightGrid);

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


        //Add action to button
        submitButton.setOnMouseClicked(e -> {
            if(path == null) {
                messageArea.setText("Please Choose a DataBase First");
                borderPane.setBottom(messageArea);
            }
            else{
                borderPane.setBottom(null);
                String charStream = statementField.getText();
                //If enter is pressed but the textField is empty
                if (charStream.isEmpty()) {
                    clearStage();
                    messageArea.setText("Please give a statement");
                    borderPane.setBottom(null);
                    borderPane.setBottom(messageArea);
                }
                else {
                    //Checks if the input is the same as the last one added. If yes then do nothing if no then present the new trees.
                    if (!charStream.equalsIgnoreCase(thisIsTheInput)){
                        //If is not the first statement then delete the previously created tables and close the connection
                        if(thisIsTheInput != null) {
                            clearStage();
                            safeCloseConnection(mySQLite);
                        }
                        myTreeParser = myMain.main(charStream,path);

                        if(myTreeParser.getParserStatus() == SELECT_STATUS){
                            TreeStructure<String> canonicalTree = myTreeParser.getCanonicalTree();
                            TreeStructure<String> optimizesTree = myTreeParser.getOptimizedTree();

                            canonicalTree =  myTreeParser.setNodeID(canonicalTree);
                            optimizesTree =  myTreeParser.setNodeID(optimizesTree);

                            mySQLite = myTreeParser.getMySQLite();

                            LinkedList<String> canonicalInOrder = myTreeParser.getNodeIdInOrderCanonical();
                            LinkedList<String> optimalInOrder  = myTreeParser.getNodeIdInOrderOptimal();

                            displayTree(canonicalTree.getRootNode(), null, CANONICAL_TREE_STATUS);
                            makeTReeVertical(buttonCanonicalTree.getRoot(),0,4,leftGrid);
                            addActionToTree(buttonCanonicalTree.getRoot(),canonicalInOrder,mySQLite,canonicalButtonsInOrder);

                            displayTree(optimizesTree.getRootNode(), null, OPTIMIZED_TREE_STATUS);
                            makeTReeVertical(buttonOptimizedTree.getRoot(),0,4,rightGrid);
                            addActionToTree(buttonOptimizedTree.getRoot(),optimalInOrder,mySQLite,optimalButtonsInOrder);
                            thisIsTheInput = charStream;
                            tableView = displayResults(mySQLite,myTreeParser.getFinalTable());
                            borderPane.setBottom(tableView);
                        }
                        else if(myTreeParser.getParserStatus() == DROP_STATUS){
                            messageArea.setText("Table " + myTreeParser.getDropTableName() + " is dropped successfully ");
                            borderPane.setBottom(null);
                            borderPane.setBottom(messageArea);
                            safeCloseConnection(myTreeParser.getMySQLite());
                        }
                    }
                }
            }
        });

        clearButton.setOnMouseClicked(event -> {
            statementField.clear();
            clearStage();
            safeCloseConnection(mySQLite);
            thisIsTheInput =null;
        });

        loadDataBase.setOnAction(event -> {
            path = fileChooser.setFileChooser(primaryStage) ;
            if(path != null) {
                messageArea.setText("Database loaded");
                borderPane.setBottom(messageArea);
                safeCloseConnection(mySQLite);
            }
        });

        exit.setOnAction(event -> {
            askToCommit(event);
        });

        resetDatabase.setOnAction(event -> {
            safeCloseConnection(mySQLite);
            clearStage();
            statementField.clear();
            thisIsTheInput = null;
            fileChooser.replaceFile();
            fileChooser.copyFile(path);
        });

        saveDatabase.setOnAction(event -> {
            safeCloseConnection(mySQLite);
            clearStage();
            statementField.clear();
            thisIsTheInput = null;
            fileChooser.saveWithoutExit();
        });

        //Close window when close window
        primaryStage.setOnCloseRequest(e -> {
            e.consume();
            safeCloseConnection(mySQLite);
            clearStage();
            askToCommit(e);
        });
    }

    public void setGridConstraints(GridPane gridPane) {
        for (int i = 0; i < COLUMN_NUM; i++) {
            ColumnConstraints colConst = new ColumnConstraints();
            colConst.setPercentWidth(100.0 / COLUMN_NUM);
            gridPane.getColumnConstraints().add(colConst);
        }
        for (int i = 0; i < ROWS_NUM; i++) {
            RowConstraints rowConst = new RowConstraints();
            rowConst.setPercentHeight(100.0 / ROWS_NUM);
            gridPane.getRowConstraints().add(rowConst);
        }
    }

    public void displayTree(TreeStructure.Node<String> node,TreeItem<Button> treeItem,int treeType){

        TreeItem<Button> newItem;

        //If the rootNode is passed initialise the treeView using the rootNode. If not add the new node to the treeItem and call this method for every node's child
        if(treeItem == null && node.getParentNode() == null )
        {
            Button rootButton = new Button(node.getData());
            rootButton.setPrefWidth(BUTTON_PREFERRED_SIZE);
            newItem = new TreeItem<>(rootButton);

            if(treeType == CANONICAL_TREE_STATUS) {
                buttonCanonicalTree = new TreeView<>(newItem);
                canonicalButtonsInOrder.put(rootButton,node.getNodeID());
            }
            else {
                buttonOptimizedTree = new TreeView<>(newItem);
                optimalButtonsInOrder.put(rootButton,node.getNodeID());
            }
        }else
        {
            Button newButton = new Button(node.getData());
            newButton.setPrefWidth(BUTTON_PREFERRED_SIZE);
            newItem = new TreeItem<>(newButton);
            treeItem.getChildren().add(newItem);

            if(treeType == CANONICAL_TREE_STATUS)
                canonicalButtonsInOrder.put(newButton,node.getNodeID());
            else
                optimalButtonsInOrder.put(newButton,node.getNodeID());
        }
        node.getChildren().forEach(each -> displayTree(each,newItem,treeType));
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
            int startX =0, startY=0, endX=0, endY=0;
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

    public void clearStage()
    {
        for (Stage stage: newStages) {
            stage.close();
        }

        if(tableView != null) {
            tableView.getItems().clear();
            tableView.getColumns().clear();
        }

        leftGrid.getChildren().clear();
        rightGrid.getChildren().clear();
    }

    public void safeCloseConnection(MySQLite mySQLite)
    {
        try {
            if(mySQLite!= null && !mySQLite.connection.isClosed())
            {
                Vector<String> tempNewcreated = mySQLite.getNewTablesCreated();
                mySQLite.close();
                mySQLite = new MySQLite(path);
                mySQLite.undoTables(tempNewcreated);
                mySQLite.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void askToCommit(Event e)
    {
        status = -1;
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
            if(fileChooser != null)
                fileChooser.deleteCopy();
            Platform.exit();
            System.exit(0);
        } );

        dontSave.setOnMouseClicked(event -> {
            stage.close();
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
}

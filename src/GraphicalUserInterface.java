import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.application.Application;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.application.Platform;
import javafx.event.EventHandler;
import static java.lang.Math.abs;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.control.*;
import java.sql.SQLException;
import javafx.scene.layout.*;
import javafx.util.Callback;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.geometry.*;
import java.util.*;

/**
 * This class is used to present the
 * Graphical user interface for the system
 * @author Emmeleia Arakleitou
 */
public class GraphicalUserInterface extends Application {

    private static Main myMain;
    private static MySQLite mySQLite = null;
    private TreeParser myTreeParser;
    private static final int COLUMN_NUM= 8 ;
    private static final int ROWS_NUM = 20 ;
    private static final int CANONICAL_TREE_STATUS = 0;
    private static final int OPTIMIZED_TREE_STATUS = 1;
    private static final int BUTTON_PREFERRED_SIZE = 100;
    private final int DROP_STATUS = 0;
    private final int DROP_ERROR_STATUS = 1;
    private final int SELECT_STATUS = 2;
    private final int STATEMENT_ERROR_STATUS = 3;
    private final int ANTLR_ERROR_STATUS =4;
    private TreeView<Button> buttonCanonicalTree, buttonOptimizedTree;
    private TableView<Object> tableView;
    private String thisIsTheInput = null, path;
    private GridPane leftGrid,rightGrid;
    private TextField statementField;
    private MyFileChooser fileChooser;
    private Label messageArea;
    private HashMap<Integer,LinkedList<Button>> buttonsInLevel;
    private HashMap<Button,Integer> canonicalButtonsInOrder ,optimalButtonsInOrder;
    private LinkedList<Integer> conditionalNodesNum = new LinkedList<>();
    private LinkedList<Stage> newStages = new LinkedList<>();
    private ArrayList<String> queries;
    private boolean specialCase = false;



    /**
     * this is the main method that calls  the launch method
     * of the Application class to call the start() method.
     * @param args
     */
    public static void main(String[]args) {

        myMain = new Main();
        //this method internally calls the start() method of the Application class
        launch(args);
    }

    /**
     * This method is contains all the elements of the GUI.
     * @param primaryStage
     */
    @Override
    public void start(Stage primaryStage) {

        buttonsInLevel = new LinkedHashMap<>();
        canonicalButtonsInOrder = new HashMap<>();
        optimalButtonsInOrder = new HashMap<>();
        queries = new ArrayList<>();
        Screen myScreen = Screen.getPrimary();
        Rectangle2D bounds = myScreen.getVisualBounds();

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

        //Create the items of the menu bar.
        MenuItem loadDataBase = new MenuItem("Load Database");
        MenuItem exit = new MenuItem("exit");
        file.getItems().addAll(loadDataBase,exit);
        MenuItem resetDatabase  = new MenuItem("Reset Database");
        MenuItem saveDatabase = new MenuItem("Save Database");
        MenuItem viewQueries = new MenuItem("View Queries");
        MenuItem hideQueries = new MenuItem("Hide Queries");
        options.getItems().addAll(resetDatabase,saveDatabase,viewQueries,hideQueries);
        viewQueries.setDisable(true); //Set it to disable at the beginning as if there is no database loaded yet, thus not a file to upload the queries from.
        hideQueries.setDisable(true);

        //ADD ALL ITEMS TO THE topHBox
        menuHBox.getChildren().addAll(menuBar);

        //Create a label to indicate the use of the textBox
        Label statementLabel = new Label("SQLite Statement");

        //Create a textField for to enter the statement
        statementField = new TextField();
        statementField.setPrefColumnCount(95);

        //Create buttons to submit and clear the statement
        Button submitButton = new Button("Submit");
        Button clearButton = new Button("Clear");
        submitButton.setPrefWidth(80);
        clearButton.setPrefWidth(80);

        statementBox.setSpacing(10);
        statementBox.getChildren().addAll(statementLabel,statementField,submitButton,clearButton);
        statementBox.setAlignment(Pos.CENTER);
        finalHBox.getChildren().addAll(menuHBox,statementBox);

        //Create GridPanes for the trees.
        leftGrid = new GridPane();
        rightGrid = new GridPane();
        leftGrid.setStyle("-fx-background-color: #454646;");
        rightGrid.setStyle("-fx-background-color: #454646;");
        leftGrid.setPrefSize((bounds.getWidth()/2), bounds.getHeight() - 100);
        rightGrid.setPrefSize((bounds.getWidth()/2), bounds.getHeight() - 100);

        /* Set the scrollPane to hold the left and right grid and set there policy to AS_NEEDED to present the scrollbar
           when the items get off the screen */
        ScrollPane leftScrollPane = new ScrollPane(leftGrid);
        ScrollPane rightScrollPane = new ScrollPane(rightGrid);

        leftScrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        leftScrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        leftScrollPane.setPrefSize((bounds.getWidth()/2), bounds.getHeight() - 100);

        rightScrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        rightScrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        rightScrollPane.setPrefSize((bounds.getWidth()/2), bounds.getHeight() - 100);

        borderPane.setTop(finalHBox);
        borderPane.setLeft(leftScrollPane);
        borderPane.setRight(rightScrollPane);

        Scene myScene = new Scene(borderPane);
        myScene.setFill(Color.BLUE);
        primaryStage.setTitle("YourSQL: A relational Database Tool");
        primaryStage.setScene(myScene);
        primaryStage.show();

        //Create the file chooser and teh label to dipaly the error messages and the notifications
        fileChooser = new MyFileChooser();
        messageArea = new Label();
        messageArea.setPrefHeight(bounds.getHeight()/4);
        messageArea.setPrefWidth(bounds.getWidth());
        messageArea.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
        messageArea.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        messageArea.setAlignment(Pos.CENTER);
        messageArea.setFont(Font.font(25));
        messageArea.setText("Welcome to YourSQL!!");
        messageArea.setStyle("-fx-background-color: #454646;");
        messageArea.setTextFill(Color.web("#FFFFFF"));
        borderPane.setBottom(messageArea);

        //Create the labels of the canonical and the optimizes trees
        Label canonicalLabel  = new Label("Canonical Tree");
        Label optimizedLabel  = new Label("Optimized Tree");
        canonicalLabel.setTextFill(Color.web("#FFFFFF"));
        optimizedLabel.setTextFill(Color.web("#FFFFFF"));
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

                        //If this is a select statement
                        myTreeParser = myMain.main(charStream,path);
                        specialCase = false;
                        if(myTreeParser.getParserStatus() == SELECT_STATUS){

                            //Build the tree and add action to the buttons.
                            TreeStructure<String> canonicalTree = myTreeParser.getCanonicalTree();
                            canonicalTree =  myTreeParser.setNodeID(canonicalTree);
                            mySQLite = myTreeParser.getMySQLite();

                            LinkedList<String> canonicalInOrder = myTreeParser.getNodeIdInOrderCanonical();
                            createTreeView(canonicalTree.getRootNode(), null, CANONICAL_TREE_STATUS);
                            buildMyTree(leftGrid,canonicalLabel);
                            addActionToTree(buttonCanonicalTree.getRoot(),canonicalInOrder,mySQLite,canonicalButtonsInOrder);

                            //If their is an optimized tree for this statement build the tree
                            TreeStructure<String> optimizesTree = myTreeParser.getOptimizedTree();
                            if(optimizesTree!= null) {
                                LinkedList<String> optimalInOrder = myTreeParser.getNodeIdInOrderOptimal();
                                optimizesTree = myTreeParser.setNodeID(optimizesTree);
                                buttonsInLevel = new HashMap<>(); //clear the contexts because the same hashMap was used for the canonical tree.
                                createTreeView(optimizesTree.getRootNode(), null, OPTIMIZED_TREE_STATUS);
                                addActionToTree(buttonOptimizedTree.getRoot(), optimalInOrder, mySQLite, optimalButtonsInOrder);
                                buildMyTree(rightGrid,optimizedLabel);

                            }else{
                                Label label = new Label("There is no Optimal Tree to display \n when the Statement contains the operator 'OR'");
                                label.setFont(Font.font(15));
                                label.setTextFill(Color.web("#FFFFFF"));
                                setGridConstraints(rightGrid,COLUMN_NUM,ROWS_NUM);
                                rightGrid.add(label,1,2,15,5);
                            }
                            //Present the result in a table.
                            thisIsTheInput = charStream;
                            tableView = displayResults(mySQLite,myTreeParser.getFinalTable());
                            mySQLite.getSchema();
                            borderPane.setBottom(tableView);
                        }
                        //If the is a drop table statement
                        else if(myTreeParser.getParserStatus() == DROP_STATUS){
                            messageArea.setText("Table " + myTreeParser.getDropTableName() + " is dropped successfully ");
                            borderPane.setBottom(null);
                            borderPane.setBottom(messageArea);
                            safeCloseConnection(myTreeParser.getMySQLite());
                        //else if there is an error in the statement present the error.
                        }else if(myTreeParser.getParserStatus() == DROP_ERROR_STATUS || myTreeParser.getParserStatus() == STATEMENT_ERROR_STATUS ||myTreeParser.getParserStatus()== ANTLR_ERROR_STATUS)
                            displayErrorMessages(bounds.getHeight()/4,borderPane,myTreeParser);
                    }
                }
            }
        });

        //when the clear button is pressed present the error message close the connection and clear the text field
        clearButton.setOnMouseClicked(event -> {

            clearStage(false);
            messageArea.setText("Stage cleared...");
            borderPane.setBottom(messageArea);
            safeCloseConnection(mySQLite);
            thisIsTheInput =null;
        });

        //when the user press the load database button call the file chooser and based on the user input present the correct message
        loadDataBase.setOnAction(event -> {

          //  fileChooser.replaceFile();
            String temp = fileChooser.setFileChooser(primaryStage,this,mySQLite);
            //if this is the first time the user loads a database and the database loaded is not the same as the other then load the new database
            if((temp!=null && path!=null && !path.equals(temp))|| path == null){
                path =temp;
                clearStage(false);
                borderPane.setBottom(null);
                resetScene(leftScrollPane,rightScrollPane,bounds,borderPane);
                hideQueries.setDisable(true);
                if(fileChooser.getFileName() != null) {
                    messageArea.setText(fileChooser.getFileName() + " Database is loaded");
                    //call the file chooser to load the query file if there is any. If there is not any queries then disable the viewQueries buttons
                    queries = fileChooser.readQueryFile(fileChooser.getFileName(),path);
                    if(queries!=null)
                        viewQueries.setDisable(false);
                }
                else
                    messageArea.setText("No database was loaded");
                borderPane.setBottom(messageArea);

            }
        });

        //when the exit button is called then call the askToCommit method to open the new stage
        exit.setOnAction(event -> {
            event.consume();
            askToCommit(event);
        });

        /* when the chooses the reset database the fileChooser
           is called to replace the used database file copied before.*/
        resetDatabase.setOnAction(event -> {
            if(fileChooser.getFileName() != null) {
                //close the connection, clear the stage, replace the file and inform the user
                safeCloseConnection(mySQLite);
                clearStage(false);
                fileChooser.replaceFile();
                fileChooser.copyFile(path);
                messageArea.setText("Database " + fileChooser.getFileName() + " was reset successfully!");
            }else
                messageArea.setText("Please load a database first");
            borderPane.setBottom(messageArea);
        });

        /* when the user chooses to save the database the if there is a database loaded clear the stage, close the connection
           and call the fileChooser to save the state of the database file */
        saveDatabase.setOnAction(event -> {
            if(fileChooser.getFileName() != null) {
                safeCloseConnection(mySQLite);
                clearStage(false);
                fileChooser.saveWithoutExit();
                messageArea.setText("Changes on database  " + fileChooser.getFileName() + " are saved! You cannot retrieve the original file anymore..");
            }else
                messageArea.setText("Please load a database first");
            borderPane.setBottom(messageArea);
        });

        /*When the user wished to view the queries enable the hide queries option, and disable the view queries
         add the new grid to present the queries */
        viewQueries.setOnAction(event -> {
            hideQueries.setDisable(false);
            viewQueries.setDisable(true);
            leftGrid.setPrefSize((bounds.getWidth()/2)-125, bounds.getHeight() - 100);
            leftScrollPane.setPrefSize((bounds.getWidth()/2)-125, bounds.getHeight() - 100);
            rightScrollPane.setPrefSize((bounds.getWidth()/2)-125, bounds.getHeight() - 100);
            rightGrid.setPrefSize((bounds.getWidth()/2)-125, bounds.getHeight() - 100);
            borderPane.setRight(null);
            borderPane.setCenter(rightScrollPane);

            VBox queryBox = new VBox();
            Label queryLabel = new Label("Your Queries");
            queryLabel.setFont(Font.font(15));
            ListView listView = listQueries(queries);
            ScrollPane queryScroll = new ScrollPane(listView);
            queryScroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
            queryScroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);

            queryBox.getChildren().addAll(queryLabel,queryScroll);
            borderPane.setRight(queryBox);

        });

        /* When the user hides the queries eneble the view query button and disable the hide queries. Also reset the
         * stage to its original state */
        hideQueries.setOnAction(event -> {
            hideQueries.setDisable(true);
            viewQueries.setDisable(false);
          resetScene(leftScrollPane,rightScrollPane,bounds,borderPane);
        });

        //When the user clic the "X" button then ask the user to commit the changes and close the application
        primaryStage.setOnCloseRequest(e -> {
            e.consume();
            askToCommit(e);
        });
    }

    /**
     * This method is used to set the gridConstraints of the GridPanes
     * @param gridPane the gridpane to set the constains for
     * @param gridColumns the number of columns
     * @param gridRows the number of rows
     */
    public void setGridConstraints(GridPane gridPane,int gridColumns,int gridRows) {

        //clear previous constraints if any
        gridPane.getColumnConstraints().clear();
        gridPane.getRowConstraints().clear();
        //if the grid columns/rows are not grader than the column_num then set the columns/rows equal to COLUMN_NUM/ROWS_NUM
        if(gridColumns < COLUMN_NUM)
            gridColumns = COLUMN_NUM;
        if(gridRows < ROWS_NUM)
            gridRows = ROWS_NUM;

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
    }

    //Creates the tree view that will be used later to add action to the tree and divides the nodes based on their level

    /**
     * This method creates a tree view that it will be used later to add action to the tree
     * It also divides teh nodes based on their level
     * @param node *************
     * @param treeItem
     * @param treeType
     */
    public void createTreeView(TreeStructure.Node<String> node,TreeItem<Button> treeItem,int treeType){

        //Creates the new treeItem and the button
        TreeItem<Button> newItem;
        Button newButton = new Button(node.getData());
        newButton.setPrefWidth(BUTTON_PREFERRED_SIZE);
        newItem = new TreeItem<>(newButton);
        Tooltip tooltip = new Tooltip(node.getData());
        newButton.setTooltip(tooltip);

        //If a list for that level is already created then add the item to that list if not create a new entry
        int level = node.getNodeLevel();
        if(buttonsInLevel.containsKey(level))
            buttonsInLevel.get(level).add(newButton);
        else {
            LinkedList temp = new LinkedList();
            temp.add(newButton);
            buttonsInLevel.put(level, temp);
        }

        //Keep track of the position of the optional_condition node so that the relations can be added later below.
        if(node.getNodeStatus() == 4){
            int posOfOptimal = buttonsInLevel.get(level).size()-1;
            conditionalNodesNum.add(posOfOptimal);
            //When the condition is applied to only one relation in the statement
        }else if(node.getNodeStatus() == 2 && node.getChildren().get(0).getNodeStatus() != 1)
            specialCase = true;


        //If the rootNode is passed initialise the treeView using the rootNode. If not add the new node to the treeItem and call this method for every node's child
        if(treeItem == null && node.getParentNode() == null ) {
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
        }
        node.getChildren().forEach(each -> createTreeView(each,newItem,treeType));
    }

    public void buildMyTree(GridPane gridPane,Label label) {

        TreeMap<Integer, LinkedList<Button>> treeMap = new TreeMap<>(buttonsInLevel);
        LinkedList<Integer> positions = new LinkedList<>();
        LinkedHashMap<Integer,Integer> holdPos = new LinkedHashMap<>();
        LinkedList<Button> line;
        int gridColumns, gridRows;
        boolean hasCondition = false;
        int column =1 ,i=0 , addX = 30, addY = 25;

        //If there is no optimized condition and the number of relation nodes is even then the relation nodes are all in the last list.
        if(conditionalNodesNum.size()!= 0 ) {
            hasCondition = true;
            gridColumns = treeMap.get(0).size() *2 +1;
            gridRows= treeMap.size() * 2 -2 ;
        }else{
            //mean that all the relations are in the last element of the list
            gridColumns = treeMap.firstEntry().getValue().size() *2 +1;
            gridRows= treeMap.size() * 2  ;
        }

        //add the label and set the columns and rows of the trees.
        gridPane.add(label,gridColumns/2, 1,6,1);
        setGridConstraints(gridPane,gridColumns,ROWS_NUM);

        /*Add the relation nodes/ opt_cond nodes first and then add the other nodes to them
          If k is an even number then hold the position of the current button
          If k i odd then use the last item added in the holdPos list and calculate the position of their parent*/
        line = treeMap.get(i);
        for(int k=0;  k<line.size(); k++) {
            gridPane.add(line.get(k),column,gridRows);
            //If this is a condition node then add the relation below
            if(conditionalNodesNum.size() != 0 && conditionalNodesNum.contains(k)) {
                gridPane.add(treeMap.get(-1).getFirst(), column, gridRows + 2);
                treeMap.get(-1).removeFirst();
                conditionalNodesNum.remove(conditionalNodesNum.indexOf(k));

                Line l = new Line(0,0,0,25);
                gridPane.setHalignment(l,HPos.CENTER);
                gridPane.add(l,column,gridRows+1, 1,1);
            }
            if((k%2)==0) holdPos.put(column,gridRows);
            else {
                int thisHoldPos = new LinkedList<>(holdPos.keySet()).getLast();
                int temp = abs( column - thisHoldPos)/2;
                int row = holdPos.get(thisHoldPos)  - (gridRows -2) -1;
                temp = thisHoldPos + temp;
                drawLine(30,0,0,30,temp-thisHoldPos, row,gridPane,HPos.RIGHT,thisHoldPos,holdPos.get(thisHoldPos)-1);
                drawLine(0,0,30,30,column-temp,1,gridPane,HPos.LEFT,temp+1,gridRows-1);
                positions.add(temp);
                holdPos.remove(thisHoldPos);
            }
            column = column +2;
        }

        i++;
        gridRows = gridRows-2;
        int max = treeMap.size();
        if(hasCondition ) max --;  // if there is a condition then there is one additional list but is already added above.

        while (i<max) {
            //If this is the special case where there is no "X" node then their is no value "1" in the tree map and it will result to an exception...
            if(specialCase && i==1) {
                i++;
                max++;
                continue;
            }
            line = treeMap.get(i);
            //for every item in the list of level i
            for(int k=0; k<line.size(); k++) {
                //if there is one item stored then add it to the grid
                if (!positions.isEmpty()) {
                    gridPane.add(line.get(k), positions.getFirst(), gridRows);

                    //if k is even and is not the last item of the list and the holdPos is empty. then add the column num to the list
                    if ((k % 2) == 0 && !(k == line.size() - 1 && holdPos.size() == 1)) {
                        holdPos.put(positions.getFirst(),gridRows);
                        positions.removeFirst();
                        /*if k is not ever or is even and is the last item in the list and there is one item in the holdPos(from if above)
                          then calculate a new position*/
                    } else if ((k % 2) != 0 || ((k % 2) == 0 && k == line.size() - 1)) {
                        int temp, newPos;
                        int thisHoldPos = new LinkedList<>(holdPos.keySet()).getLast();
                        temp = abs(positions.getFirst() - thisHoldPos) / 2;

                        if (positions.getFirst() > thisHoldPos) {
                            newPos = thisHoldPos + temp;
                            int columnSpan = newPos - thisHoldPos ;
                            int row = holdPos.get(thisHoldPos)  - (gridRows -2) -1;
                            drawLine(40+addX*(columnSpan-1),0,0,30+(row-1)*addY,columnSpan, row,gridPane,HPos.RIGHT,thisHoldPos,holdPos.get(thisHoldPos)-1);
                            columnSpan = positions.getFirst()-newPos;

                            drawLine(0,0,40+addX*(columnSpan-1),30,columnSpan,row,gridPane,HPos.LEFT,newPos+1,gridRows-1 );
                        }
                        else {

                            newPos = positions.getFirst() + temp;
                            int columnSpan = newPos - positions.getFirst(); int row =1;
                            drawLine(40+addX*(columnSpan-1),0,0,30,columnSpan, row,gridPane,HPos.RIGHT,positions.getFirst(),gridRows-1);

                            if(holdPos.get(thisHoldPos) == gridRows)
                                row = 1;
                            else
                                row = (holdPos.get(thisHoldPos))  - gridRows +1;

                            columnSpan = thisHoldPos - newPos;
                            drawLine(0,0,40+addX*(columnSpan-1),30+(row-1)*addY,columnSpan,row,gridPane,HPos.LEFT,newPos+1,gridRows-1 );
                        }

                        positions.removeFirst();
                        positions.add(newPos);
                        holdPos.remove(thisHoldPos);
                        //holdPos.removeLast();
                    }
                } else { // if there is no element in the position list then add the item above the last one.
                    int thisHoldPos = new LinkedList<>(holdPos.keySet()).getFirst();
                    gridPane.add(line.get(k), thisHoldPos, gridRows);
                    Line l = new Line(0,0,0,25);
                    gridPane.setHalignment(l,HPos.CENTER);
                    gridPane.add(l,thisHoldPos,gridRows+1);
                }
            }
            gridRows =gridRows-2;
            i++;
        }
    }

    //Add action to The button Trees
    public void addActionToTree(TreeItem<Button> treeItem, LinkedList<String> myList, MySQLite mySQLite,HashMap<Button,Integer> buttonsInOrder) {
        treeItem.getValue().setOnMouseClicked(e -> {
            //get the position of the table that this button represents so that the results can be displayed
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
            tableColumn.setCellValueFactory((Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>) param -> {
                if(param.getValue().get(j) == null) // when there are null values in the table!!
                    return new SimpleStringProperty(null);
                else
                    return new SimpleStringProperty(param.getValue().get(j).toString());
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
        //clear the contents of the stage.
        for (Stage stage: newStages) {
            stage.close();
        }
        if(tableView != null) {
            tableView.getItems().clear();
            tableView.getColumns().clear();
        }
        if(!comingFromSubmit){
            statementField.clear();
            thisIsTheInput = null;
        }
        conditionalNodesNum  = new LinkedList<>();
        buttonsInLevel = new HashMap<>();
        leftGrid.getChildren().clear();
        rightGrid.getChildren().clear();
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
    public LinkedList<Object> buildCommitStage()
    {
        //Create a new stage to ask "save" "dont save" "cancel".
        BorderPane pane = new BorderPane();
        Scene myScene = new Scene(pane);
        Stage stage = new Stage();
        stage.setResizable(false);
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

        LinkedList<Object> stageContents = new LinkedList<>();
        stageContents.add(stage);
        stageContents.add(save);
        stageContents.add(dontSave);
        stageContents.add(cancel);
        return stageContents;
    }

    public void askToCommit(Event e) {

        LinkedList<Object>   stageObjects = buildCommitStage();

        Stage stage = (Stage) stageObjects.get(0);
        Button save = (Button) stageObjects.get(1);
        Button dontSave = (Button) stageObjects.get(2);
        Button cancel = (Button) stageObjects.get(3);

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


    public void drawLine(int startX, int startY, int endX, int endY, int columnSpan, int rowSpan, GridPane gridPane, HPos hPos,int gridC, int gridX)
    {
        Line line1 = new Line(startX,startY,endX,endY);
        GridPane.setHalignment(line1,hPos);
        gridPane.add(line1, gridC,gridX,columnSpan,rowSpan);
    }

    public void displayErrorMessages(Double height, BorderPane borderPane, TreeParser myTreeParser)
    {
        // If the statement is not correct print the error messages.
        VBox messageBox = new VBox();
        ScrollPane messageScrollPane = new ScrollPane(messageBox);
        messageScrollPane.setPrefHeight(height);
        messageScrollPane.setStyle("-fx-background: rgb(80,80,80);");
        Vector<String> errorMessages = myTreeParser.getMessages();
        Label newLabel = new Label("Errors Found in the statement:");
        newLabel.setFont(Font.font(20));
        newLabel.setTextFill(Color.web("#FFFFFF"));
        messageBox.getChildren().add(newLabel);

        for (int i=0; i<errorMessages.size(); i++){
            newLabel  = new Label(i+1 + "." +errorMessages.get(i));
            newLabel.setFont(Font.font(20));
            newLabel.setTextFill(Color.web("#FFFFFF"));
            messageBox.getChildren().add(newLabel);
        }
        borderPane.setBottom(messageScrollPane);
        safeCloseConnection(myTreeParser.getMySQLite());
    }

    public ListView listQueries(ArrayList<String> queries)
    {
        ListView listView = new ListView();
        listView.getItems().addAll(queries);

        listView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if(mouseEvent.getButton().equals(MouseButton.PRIMARY)){
                    if(mouseEvent.getClickCount() == 2){
                        statementField.clear();
                        statementField.setText(listView.getSelectionModel().getSelectedItem().toString());
                    }
                }
            }
        });

        return listView;
    }

    public void resetScene(ScrollPane leftScrollPane, ScrollPane rightScrollPane, Rectangle2D bounds, BorderPane borderPane)
    {
        leftGrid.setPrefSize((bounds.getWidth()/2), bounds.getHeight() - 100);
        leftScrollPane.setPrefSize((bounds.getWidth()/2), bounds.getHeight() - 100);
        rightScrollPane.setPrefSize((bounds.getWidth()/2), bounds.getHeight() - 100);
        rightGrid.setPrefSize((bounds.getWidth()/2), bounds.getHeight() - 100);
        borderPane.setCenter(null);
        borderPane.setRight(null);
        borderPane.setRight(rightScrollPane);
    }
}

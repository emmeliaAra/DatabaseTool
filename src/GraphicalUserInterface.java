import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.util.Callback;
import java.util.HashMap;
import java.util.LinkedList;

public class GraphicalUserInterface extends Application {

    private static Main myMain;
    private TreeParser myTreeParser;
    private static final int COLUMN_NUM= 8 ;
    private static final int ROWS_NUM = 20 ;
    private static final int TREE_ROW_START = 3;
    private static final int CANONICAL_TREE_COLUMN_START = COLUMN_NUM/4 ;
    private static final int CANONICAL_TREE_STATUS = 0;
    private static final int OPTIMIZED_TREE_STATUS = 1;
    private static final int BUTTON_PREFERRED_SIZE = 100;
    private TreeView<Button> buttonCanonicalTree, buttonOptimizedTree;
    private HashMap<Button,Integer> canonicalButtonsInOrder = new HashMap<>();
    private HashMap<Button,Integer> optimalButtonsInOrder = new HashMap<>();
    private String thisIsTheInput = null;
    private MySQLite mySQLite = null;
    TableView<Object> tableView;

    public static void main(String[]args)
    {
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
        Menu options = new Menu("Options");
        menuBar.getMenus().addAll(options);

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
        GridPane leftGrid = new GridPane();
        setGridConstraints(leftGrid);

        GridPane rightGrid = new GridPane();
        setGridConstraints(rightGrid);

        Screen myScreen = Screen.getPrimary();
        Rectangle2D bounds = myScreen.getVisualBounds();

        leftGrid.setMaxSize((bounds.getWidth()/2), bounds.getHeight() - 100);
        rightGrid.setMaxSize((bounds.getWidth()/2), bounds.getHeight() - 100);

        borderPane.setMinSize(bounds.getWidth() - 100, bounds.getHeight() - 100);
        borderPane.setTop(finalHBox);

        borderPane.setLeft(leftGrid);
        borderPane.setRight(rightGrid);

        //Add action to button
        submitButton.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent e) {
                String charStream = statementField.getText();
                //If enter is pressed but the textField is empty
                if (charStream.isEmpty())
                    System.out.println("Please give a statement");
                else {
                    //Checks if the input is the same as the last one added. If yes then do nothing if no then present the new trees.
                    if (!charStream.equalsIgnoreCase(thisIsTheInput)){

                        //If is not the first statement then delete the previously created tables and close the connection
                        if(thisIsTheInput != null) {
                            tableView = new TableView<>();
                            mySQLite.undoTables();
                            mySQLite.close();
                        }

                        myTreeParser = myMain.main(charStream);
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
                }
            }
        });

        clearButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                statementField.clear();
                tableView.getItems().clear();
                leftGrid.getChildren().clear();
                rightGrid.getChildren().clear();
            }
        });

        Scene myScene = new Scene(borderPane);
        myScene.setFill(Color.BLUE);
        primaryStage.setTitle("Database Tool");
        primaryStage.setScene(myScene);
        primaryStage.show();

        //Close window when close window
        primaryStage.setOnCloseRequest(e -> {
            if(mySQLite!=null)
                mySQLite.undoTables();
            
            Platform.exit();
            System.exit(0);
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
        treeItem.getValue().setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent e) {
                int pos = buttonsInOrder.get(treeItem.getValue());
                mySQLite.getResultsOnTable(myList.get(pos));
            }
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
}

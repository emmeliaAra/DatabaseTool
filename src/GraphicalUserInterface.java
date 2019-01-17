import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;

public class GraphicalUserInterface extends Application {

    private static Main myMain;
    private TreeParser myTreeParser;
    private static final int COLUMN_NUM= 20 ;
    private static final int ROWS_NUM = 20 ;
    private static final int TREE_ROW_START = 3;
    private static final int CANONICAL_TREE_COLUMN_START = COLUMN_NUM/4;
    private static final int CANONICAL_TREE_STATUS = 0;
    private static final int OPTIMIZED_TREE_STATUS = 1;
    private GridPane gridPane;
    private TreeView<Button> buttonCanonicalTree, buttonOptimizedTree;

    public static void main(String[]args)
    {
        myMain = new Main();
        //this method internally calls the start() method of the Application class
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        int numberOfNodesCanonical = 0;
        Screen myScreen = Screen.getPrimary();
        Rectangle2D bounds = myScreen.getVisualBounds();

        //Create a label to indicate the use of the textBox
        Text statementLabel = new Text("SQLite Statement");

        //Create a textField for to enter the statement
        TextField statementField = new TextField();

        //Create buttons to submit and clear the statement
        Button submitButton = new Button("Submit");
        Button clearButton = new Button("Clear");

        //Create the GridPane
        gridPane = new GridPane();
        setGridConstraints(gridPane);
        gridPane.setMinSize(bounds.getWidth() - 100, bounds.getHeight() - 100);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setAlignment(Pos.BASELINE_LEFT);
        gridPane.setGridLinesVisible(true
        );
        //set Gaps between the columns
        //gridPane.setVgap(10);
        // gridPane.setHgap(10);

        gridPane.add(statementLabel, 1, 1);
        gridPane.add(statementField, 2, 1);
        gridPane.add(submitButton, 3, 1);
        gridPane.add(clearButton, 4, 1);

        //Create a scene object and add it to primaryStage
        Scene myScene = new Scene(gridPane);
        myScene.setFill(Color.BLUE);
        primaryStage.setTitle("Database Tool");
        primaryStage.setScene(myScene);
        primaryStage.show();

            //Add action to button
            submitButton.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(javafx.scene.input.MouseEvent e) {
                    String charStream = statementField.getText();
                    if (charStream.isEmpty())
                        System.out.println("Please give a statement");
                    else {
                        myTreeParser = myMain.main(charStream);
                        TreeStructure<String> canonicalTree = myTreeParser.getCanonicalTree();
                        TreeStructure<String> optimizesTree = myTreeParser.getOptimizedTree();

                        displayTree(canonicalTree.getRootNode(), null, CANONICAL_TREE_STATUS);
                        gridPane.add(buttonCanonicalTree, 0, 3, 10, 10);
                        addActionToTree(buttonCanonicalTree.getRoot());

                        displayTree(optimizesTree.getRootNode(), null, OPTIMIZED_TREE_STATUS);
                        gridPane.add(buttonOptimizedTree, 10, 3, 10, 10);
                        addActionToTree(buttonOptimizedTree.getRoot());
                    }
                }
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
            newItem = new TreeItem<>(rootButton);
            if(treeType == CANONICAL_TREE_STATUS)
                buttonCanonicalTree = new TreeView<>(newItem);
            else
                buttonOptimizedTree = new TreeView<>(newItem);
        }else
        {
            Button newButton = new Button(node.getData());
            newItem = new TreeItem<>(newButton);
            treeItem.getChildren().add(newItem);
        }
      node.getChildren().forEach(each -> displayTree(each,newItem,treeType));
   }

   //Add action to The button Trees
   public void addActionToTree(TreeItem<Button> treeItem)
   {
       treeItem.getValue().setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
           @Override
           public void handle(javafx.scene.input.MouseEvent e) {
               System.out.println("emmelia is here ho ho ho ");
           }
       });
       treeItem.getChildren().forEach(each -> addActionToTree(each));
   }
}

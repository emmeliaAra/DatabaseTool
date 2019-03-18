import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.CharStream;

import java.util.*;

public class TreeParser {

    private CharStream charStream;
    private Map<Integer, String> statement;
    private Vector<String> selectFieldName, fromRelationNames, whereClause,messages;
    private MySQLite mySQLite;
    private LinkedList<String> nodeIdInOrderCanonical = new LinkedList<>();
    private LinkedList<String> nodeIdInOrderOptimal = new LinkedList<>();
    private HashMap<String, LinkedList<String>> newTablesCreated, optimizedWhere;
    private String finalTable,dropTableName;
    private final int DROP_STATUS = 0;
    private final int DROP_ERROR_STATUS = 1;
    private final int SELECT_STATUS = 2;
    private final int STATEMENT_ERROR_STATUS = 3;
    private final int ANTLR_ERROR_STATUS =4;
    private int parserStatus;


    public TreeParser(CharStream charStream,String path)
    {
        this.charStream = charStream;
        mySQLite = new MySQLite(path);
    }

    public void getStatementTokens() throws IllegalAccessException {

        messages = new Vector<>();
        parserStatus = -1 ;
        sqliteLexer lexer = new sqliteLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        sqliteParser parser = new sqliteParser(tokenStream);

        SyntaxErrorListener.InnerErrorListener errorListener = new SyntaxErrorListener.InnerErrorListener();
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        ParseTree myTree = parser.parse();
        ParseTreeWalker walker = new ParseTreeWalker();
        messages = errorListener.getMsg();

        //create an instance of the inner class to call the methods.
        MyListener.MyInnerListener myListener = new MyListener.MyInnerListener(parser);
        walker.walk(myListener,myTree);
        statement = myListener.getMyStatement();

        if(messages== null)
            messages = new Vector<>();


        SemanticErrorChecker semanticErrorChecker = new SemanticErrorChecker(mySQLite);
        messages = semanticErrorChecker.checkSelect(charStream.toString(),messages);
        //Check if there is a message from ANTLR4 it means that there is an error so do not built the tree...
        if(messages.isEmpty()){
            //Check if this is a drop, create or select statement
            if(charStream.toString().toLowerCase().contains( "drop")){
                messages = semanticErrorChecker.handleSQLDropTableErrors(charStream.toString());
                if(!messages.isEmpty())
                    parserStatus = DROP_ERROR_STATUS;
                else {
                    parserStatus = DROP_STATUS;
                    dropTableOperation();
                }
            }
            else if (charStream.toString().toLowerCase().contains("select")) {
                getParts();
                if(charStream.toString().toLowerCase().contains("from"))
                    messages = semanticErrorChecker.handleSQlExceptions(selectFieldName,fromRelationNames,whereClause);
                else
                    messages = semanticErrorChecker.checkFromClause(charStream.toString(),messages);

                    if(!messages.isEmpty())
                        parserStatus = STATEMENT_ERROR_STATUS;
                    else{
                        parserStatus = SELECT_STATUS;
                        operations();
                    }
            }
        }else {
            parserStatus = ANTLR_ERROR_STATUS;
            //To check if the from claus is empty...
            if(errorListener.getCheck())
                messages = semanticErrorChecker.checkFromClause(charStream.toString(),messages);
        }


    }

    public void operations()throws IllegalAccessException {

        SelectStatement selectStatementToTree = new SelectStatement(selectFieldName, fromRelationNames, whereClause);
        //creates and executes the trees to present the results.
        TreeStructure<String> canonicalTree = selectStatementToTree.buildSelectTree();
        ExecuteTree executeCanonicalTree = new ExecuteTree(canonicalTree,selectFieldName,whereClause,mySQLite);
        canonicalTree.createStack(canonicalTree.getRootNode());
        executeCanonicalTree.execute(canonicalTree.getStack());

        boolean hasOr = containsOr(charStream.toString());
        //keep a copy of the original tree so that can be optimised.
        SelectStatement selectStatementForOpt = new SelectStatement(selectFieldName, fromRelationNames, whereClause);
        TreeStructure<String> canonicalTreeForOpt = selectStatementForOpt.buildSelectTree();

        if(!hasOr) {
            newTablesCreated = executeCanonicalTree.getNewTablesCreated();
            //if there is no where condition or only one relation in the statement the tree will be the same as the canonical.
            OptimizeTree optimizeTree = new OptimizeTree(canonicalTreeForOpt, mySQLite.getSchema(), whereClause, newTablesCreated, optimizedWhere);
            optimizedWhere = optimizeTree.splitWhere();

            if (!optimizeTree.splitWhere().isEmpty() && fromRelationNames.size() > 1)
                canonicalTreeForOpt = optimizeTree.optimiseTree();

            ExecuteTree executeOptimizedTree = new ExecuteTree(canonicalTreeForOpt, selectFieldName, whereClause, mySQLite);
            canonicalTreeForOpt.createStack(canonicalTreeForOpt.getRootNode());
            executeOptimizedTree.execute(canonicalTreeForOpt.getStack());

            nodeIdInOrderOptimal = executeOptimizedTree.getNodeIdInOrder();
        }
        //Get the relations in the order they are executed.
        nodeIdInOrderCanonical = executeCanonicalTree.getNodeIdInOrder();
        finalTable = executeCanonicalTree.getFinalTable();
    }

    public void dropTableOperation()
    {
        Object[] values = statement.values().toArray();
        //Get the penultimate(protelefteo) element of the list which is always the table name ex-> Drop table name ;
        dropTableName = values[values.length-2].toString();
        mySQLite.dropTable(dropTableName);
    }

    public void getParts()
    {
        selectFieldName  = new Vector<>();
        fromRelationNames = new Vector<>();
        whereClause = new Vector<>();

        int selectKey =0;
        int fromKey =0;
        int whereKey =0;

        //If there is no where part set whereKey to -1
        if (!statement.containsValue("where"))
            whereKey = -1;

        //Get the stating point of each keyWord
        for(Map.Entry<Integer,String> myPair : statement.entrySet()) {
            if(myPair.getValue().equalsIgnoreCase("select"))
                selectKey = myPair.getKey();
            else if(myPair.getValue().equalsIgnoreCase("from"))
                fromKey = myPair.getKey();
            else if(myPair.getValue().equalsIgnoreCase("where"))
                whereKey = myPair.getKey();
        }

        //if the value is not "," or ";" then distribute the values to the correct vector according to the key ranges!
        for(Map.Entry<Integer,String> myPair : statement.entrySet()) {
            if(!myPair.getValue().equals(",") && !myPair.getValue().equals(";") ){

                if(myPair.getKey()> selectKey && myPair.getKey() < fromKey && selectKey!= -1 )
                    selectFieldName.add(myPair.getValue());
                else if(myPair.getKey() > fromKey && myPair.getKey() < whereKey )
                    fromRelationNames.add(myPair.getValue());
                else if(myPair.getKey()> whereKey && myPair.getKey() > fromKey  && whereKey != -1)
                    whereClause.add(myPair.getValue());
                else if(myPair.getKey() >fromKey && whereKey == -1 )
                    fromRelationNames.add(myPair.getValue());
            }
        }
    }

    public TreeStructure<String> getCanonicalTree()
    {
        SelectStatement selectStatement = new SelectStatement(selectFieldName, fromRelationNames, whereClause);
        String temp = charStream.toString().toLowerCase();
        //Assemble the data of the condition node and the project  node.
        String condition  = temp.toLowerCase().substring(temp.indexOf("where")+5,temp.indexOf(";"));
        String project = temp.toLowerCase().substring(temp.indexOf("select") +6,temp.indexOf("from"));
        TreeStructure<String> canonicalTree = null;
        try {
            canonicalTree = selectStatement.buildSelectTree();
            if(statement.toString().toLowerCase().contains("where")) {
                canonicalTree.getRootNode().setNodeData("π[" + project + "]");
                canonicalTree.getRootNode().getChildren().get(0).setNodeData("σ[" + condition + "]");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return canonicalTree;
    }

    public TreeStructure<String> getOptimizedTree()
    {
        boolean hasOr = containsOr(charStream.toString());
        if(!hasOr)
        {
            TreeStructure<String> optimizedTree = getCanonicalTree();
            OptimizeTree optimizeTree = new OptimizeTree(optimizedTree, mySQLite.getSchema(),whereClause,newTablesCreated,optimizedWhere);

            try {
                if(!optimizedWhere.isEmpty() && fromRelationNames.size()>1)
                    optimizedTree = optimizeTree.optimiseTree();
                else
                    optimizedTree = getCanonicalTree();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            return optimizedTree;
        }
        else return null;
    }

    public Boolean containsOr(String charStream)
    {
         /*index cannot be 0  and or cannot be the last word in the statement  because it means that it will start/end with or
        and this is not a valid statement so it will break before, thus only check if the next char is space. if not then set to true*/

        boolean hasOr = false;

        String stream = charStream.toLowerCase();
        int index = 0;
        while ((index = charStream.indexOf("or",index))!= -1) {
            char c = stream.charAt(index+2);
            if(c == ' ') {
                hasOr = true;
                break;
            }
            //because or has 2 characters
            index = index + 2;
        }
        return hasOr;
    }

    //Set node id. The first one  popped has nodeId = 0 etc.
    public TreeStructure<String> setNodeID(TreeStructure<String> tree)
    {
        Stack<TreeStructure.Node<String>> stack;
        tree.createStack(tree.getRootNode());
        stack = tree.getStack();
        TreeStructure.Node popNode;
        int i =0;

        while(!stack.empty()) {
            popNode = stack.pop();
            popNode.setNodeID(i);
            i++;
        }
        return tree;
    }

    public LinkedList<String> getNodeIdInOrderCanonical() {
        return nodeIdInOrderCanonical;
    }

    public LinkedList<String> getNodeIdInOrderOptimal()
    {
        return nodeIdInOrderOptimal;
    }
    public MySQLite getMySQLite()
    {
        return mySQLite;
    }
    public String getFinalTable(){
        return finalTable;
    }
    public int getParserStatus(){ return parserStatus;}
    public String getDropTableName(){
        return dropTableName;
    }

    public Vector<String> getMessages() {
        return messages;
    }
}

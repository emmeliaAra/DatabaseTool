import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.*;

public class TreeParser {

    private CharStream charStream;
    private Map<Integer, String> statement;
    private Vector<String> selectFieldName, fromRelationNames, whereClause;

    public TreeParser(CharStream charStream){
        this.charStream = charStream;
    }

    public void getStatementTokens() throws IllegalAccessException {


        sqliteLexer lexer = new sqliteLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream( lexer);
        sqliteParser parser = new sqliteParser(tokenStream);

        ParseTree myTree = parser.parse();
        ParseTreeWalker walker = new ParseTreeWalker();

        //create an instance of the inner class to call the methods.
        MyListener.MyInnerListener myListener = new MyListener.MyInnerListener(parser);
        walker.walk(myListener,myTree);
        statement = myListener.getMyStatement();

        getParts();
        TreeStructure<String> canonicalTree;
        System.out.println("--------------------------------------");
        SelectStatement selectStatementToTree = new SelectStatement(selectFieldName, fromRelationNames, whereClause);
       canonicalTree = selectStatementToTree.buildSelectTree();

      //  ExecuteCanonicalTree executeCanonicalTree = new ExecuteCanonicalTree(canonicalTree);
        //executeCanonicalTree.execute();

        //test();
    }

    public void getParts()
    {
        selectFieldName  = new Vector<>();
        fromRelationNames = new Vector<>();
        whereClause = new Vector<>();

        int selectKey =0;
        int fromKey =0;
        int whereKey =0;

        if (!statement.containsValue("where"))
            whereKey = -1;

        for(Map.Entry<Integer,String> myPair : statement.entrySet()) {
            if(myPair.getValue().equalsIgnoreCase("select"))
                selectKey = myPair.getKey();
            else if(myPair.getValue().equalsIgnoreCase("from"))
                fromKey = myPair.getKey();
            else if(myPair.getValue().equalsIgnoreCase("where"))
                whereKey = myPair.getKey();
        }

        for(Map.Entry<Integer,String> myPair : statement.entrySet()) {
            if(!myPair.getValue().equals(",") && !myPair.getValue().equals(".") && !myPair.getValue().equals(";") ){

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
        System.out.println("select fields: " + selectFieldName);
        System.out.println("from Relation: " + fromRelationNames);
        System.out.println("whereClause: " + whereClause);
    }


    public void test() throws IllegalAccessException {
        TreeStructure<Integer> myTest = new TreeStructure<>();
        myTest.addRootNode(19);
        TreeStructure.Node<Integer> rootNode19 = myTest.getRootNode();
        TreeStructure.Node<Integer> node18 = myTest.addChildNode(rootNode19,18);
        TreeStructure.Node<Integer> node17 = myTest.addChildNode(rootNode19,17);

        TreeStructure.Node<Integer> node16 = myTest.addChildNode(node18,16);
        TreeStructure.Node<Integer> node14 = myTest.addChildNode(node18,14);


        TreeStructure.Node<Integer> node15 = myTest.addChildNode(node17,15);
        TreeStructure.Node<Integer> node13 = myTest.addChildNode(node17,13);

        TreeStructure.Node<Integer> node12 = myTest.addChildNode(node16,12);
        TreeStructure.Node<Integer> node10= myTest.addChildNode(node16,10);

        TreeStructure.Node<Integer> node8= myTest.addChildNode(node14,8);
        TreeStructure.Node<Integer> node6= myTest.addChildNode(node14,6);

        TreeStructure.Node<Integer> node11= myTest.addChildNode(node15,11);
        TreeStructure.Node<Integer> node9= myTest.addChildNode(node15,9);

        TreeStructure.Node<Integer> node7= myTest.addChildNode(node13,7);
        TreeStructure.Node<Integer> node5= myTest.addChildNode(node13,5);

        TreeStructure.Node<Integer> node4= myTest.addChildNode(node12,4);
        TreeStructure.Node<Integer> node2= myTest.addChildNode(node12,2);

        TreeStructure.Node<Integer> node3= myTest.addChildNode(node11,3);
        TreeStructure.Node<Integer> node1= myTest.addChildNode(node11,1);


        myTest.printTree(rootNode19," ");

        System.out.println(node1.getParentNode().getData() + "emme");

        System.out.println("----------------------------------------" );
     //   System.out.println(myTest.getStack());
        //System.out.println(myTest.stack.pop() );

    }

}

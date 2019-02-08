import java.util.LinkedList;
import java.util.Stack;

public class TreeStructure<T> {

    private Node<T> rootNode = null;
    private Stack<Node<T>> stack = new Stack<>();

    public static class Node<T>
    {
        private T data;
        private LinkedList<Node<T>> children;
        private TreeStructure<T> hostingTree;
        private Node<T> parentNode;
        private int nodeStatus, nodeID,nodeLevel;

        public Node(LinkedList<Node<T>> children, TreeStructure<T> hostingTree, Node<T> parentNode, T data, int nodeStatus, int nodeID, int nodeLevel)
        {
            this.children = children;
            this.hostingTree = hostingTree;
            this.parentNode = parentNode;
            this.data = data;
            this.nodeStatus = nodeStatus;
            this.nodeID = nodeID;
            this.nodeLevel = nodeLevel;
        }

        public T getData()
        {
            return data;
        }

        public LinkedList<Node<T>> getChildren() {
            return children;
        }

        public TreeStructure<T> getHostingTree() {
            return hostingTree;
        }

        public Node<T> getParentNode() {
            return parentNode;
        }

        public int getNodeStatus()
        {
            return nodeStatus;
        }

        public int getNodeID(){return nodeID;}

        public int getNodeLevel() {
            return nodeLevel;
        }
        public void setNodeData(T newData)
        {
            data = newData;
        }

        public void setNodeStatus(int status)
        {
            nodeStatus = status;
        }

        public void setNodeID(int nID){ nodeID = nID; }

        public void setNodeLevel(int nodeLevel) {
            this.nodeLevel = nodeLevel;
        }

        public void setParentNode(Node<T> parentNode)
        {
            this.parentNode = parentNode;
            parentNode.children.addLast(this);
        }
    }

    public void addRootNode(T data,int nodeStatus, int nodeID,int nodeL) throws IllegalAccessException {
        if(rootNode == null )
            rootNode = new Node<>(new LinkedList<>(), this, null,data, nodeStatus, nodeID,nodeL);
        else
            throw new IllegalAccessException("A tree can not have more than one root node");
    }

    public Node<T> addChildNode(Node<T> parentNode, T data, int nodeStatus, int nodeID,int nodeL) throws IllegalAccessException {


        if(parentNode != null && parentNode.hostingTree == this)
        {
            Node<T> newNode = new Node<>(new LinkedList<>(),this,parentNode,data,nodeStatus, nodeID,nodeL);
            parentNode.getChildren().addLast(newNode);
            return newNode;
        }
        else if(parentNode == null)
            throw new NullPointerException("Cannot add a child to a null parent");
        else
            throw new IllegalAccessException("The parent node provided is not part of this tree.");
    }

    public Node<T> addChildNode1(Node<T> parentNode, T data, int nodeStatus, int nodeID,int index,int nodeL) throws IllegalAccessException {


        if(parentNode != null && parentNode.hostingTree == this)
        {
            Node<T> newNode = new Node<>(new LinkedList<>(),this,parentNode,data,nodeStatus, nodeID,nodeL);
            parentNode.getChildren().add(index,newNode);
            return newNode;
        }
        else if(parentNode == null)
            throw new NullPointerException("Cannot add a child to a null parent");
        else
            throw new IllegalAccessException("The parent node provided is not part of this tree.");
    }



    public void deleteNode(Node<T> node) throws IllegalAccessException
    {
        if(node != null)
        {
            if(node.parentNode == null)
                rootNode = null;
            else{
                int index = node.parentNode.children.indexOf(node);
                node.parentNode.children.remove(index);
            }

        }
        else if(node == null)
            throw  new NullPointerException("Cannot delete an empty node!!");
        else
            throw  new IllegalAccessException("The node is not part of the Tree!! ");
    }

    public void printTree(Node<T> node, String appender){
        System.out.println(appender + node.getData());
        node.getChildren().forEach(each -> printTree(each, appender +appender));
    }
    public void createStack(Node<T> node){
        stack.push(node);
        node.getChildren().forEach(each -> createStack(each));
    }

    public Node<T> getRootNode() {
        return rootNode;
    }

    public Stack<Node<T>> getStack()
    {
        return stack;
    }

}

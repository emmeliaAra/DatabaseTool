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
        private int nodeStatus;

        public Node(LinkedList<Node<T>> children, TreeStructure<T> hostingTree, Node<T> parentNode, T data, int nodeStatus)
        {
            this.children = children;
            this.hostingTree = hostingTree;
            this.parentNode = parentNode;
            this.data = data;
            this.nodeStatus = nodeStatus;
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

        public void setNodeData(T newData)
        {
            data = newData;
        }

        public void setNodeStatus(int status)
        {
            nodeStatus = status;
        }

        public void setParentNode(Node<T> parentNode)
        {
            this.parentNode = parentNode;
            System.out.println(this.data + " emmelia id \n");
            parentNode.children.addLast(this);
        }
    }

    public void addRootNode(T data,int nodeStatus) throws IllegalAccessException {
        if(rootNode == null )
            rootNode = new Node<>(new LinkedList<>(), this, null,data, nodeStatus);
        else
            throw new IllegalAccessException("A tree can not have more than one root node");
    }

    public Node<T> addChildNode(Node<T> parentNode, T data, int nodeStatus) throws IllegalAccessException {


        if(parentNode != null && parentNode.hostingTree == this)
        {
            Node<T> newNode = new Node<>(new LinkedList<>(),this,parentNode,data,nodeStatus);
            parentNode.getChildren().addLast(newNode);
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
       // stack.push(node);
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

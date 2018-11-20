import java.util.LinkedList;

public class TreeStructure<T> {

    private Node<T> rootNode = null;

    public static class Node<T>
    {
        private T data;
        private LinkedList<Node<T>> children;
        private TreeStructure<T> hostingTree;
        private Node<T> parentNode;

        public Node(LinkedList<Node<T>> children, TreeStructure<T> hostingTree, Node<T> parentNode, T data)
        {
            this.children = children;
            this.hostingTree = hostingTree;
            this.parentNode = parentNode;
            this.data = data;
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
    }

    public void addRootNode(T data) throws IllegalAccessException {
        if(rootNode == null )
            rootNode = new Node<>(new LinkedList<>(), this, null,data);
        else
            throw new IllegalAccessException("A tree can not have more than one root node");
    }

    public Node<T> addChildNode(Node<T> parentNode, T data) throws IllegalAccessException {

        if(parentNode != null && parentNode.hostingTree == this)
        {
            Node<T> newNode = new Node<>(new LinkedList<>(),this,rootNode,data);
            parentNode.getChildren().addLast(newNode);
            return newNode;
        }
        else if(parentNode == null)
            throw new NullPointerException("Cannot add a child to a null parent");
        else
            throw new IllegalAccessException("The parent node provided is not part of this tree.");
    }

    public void printTree(Node<T> node, String appender){
        System.out.println(appender + node.getData());
        //System.out.println(node.getChildren().size() + "d"  + node.getData());
        node.getChildren().forEach(each -> printTree(each, appender +appender));
       // System.out.println("emmelia ");
    }

    public Node<T> getRootNode() {
        return rootNode;
    }
}

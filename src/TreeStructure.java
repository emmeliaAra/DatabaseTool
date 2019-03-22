import java.util.LinkedList;
import java.util.Stack;

/**
 * This class represents the data Structure used to built the tree
 * @param <T> A generic type for the data that will be stored in the tree
 * @author Emmeleia Arakleitou
 */
public class TreeStructure<T> {

    private Node<T> rootNode = null;
    private Stack<Node<T>> stack = new Stack<>();

    /**
     * This is an inner class of the treeStructure that represents the nodes of the trees
     * @param <T>
     */
    public static class Node<T>
    {
        private T data;
        private LinkedList<Node<T>> children;
        private TreeStructure<T> hostingTree;
        private Node<T> parentNode;
        private int nodeStatus, nodeID,nodeLevel;

        /**
         * A constructor of the node class
         * @param children the children of the node
         * @param hostingTree the tree that this node belongs to
         * @param parentNode the parent node of the tree
         * @param data the data to be stored in the node
         * @param nodeStatus the status of the node
         * @param nodeID the id of he node
         * @param nodeLevel the level in the tree that this node is placed
         */
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

        /**
         * Accessor for the data stored in the node
         * @return
         */
        public T getData()
        {
            return data;
        }

        /**
         * Accessor the the node's children
         * @return
         */
        public LinkedList<Node<T>> getChildren() {
            return children;
        }

        /**
         * Accessor for the tree instance of the node's hosting tree
         * @return
         */
        public TreeStructure<T> getHostingTree() {
            return hostingTree;
        }

        /**
         * Accessor the the parent of the node
         * @return
         */
        public Node<T> getParentNode() {
            return parentNode;
        }

        /**
         * Accessor the the node's status
         * @return
         */
        public int getNodeStatus()
        {
            return nodeStatus;
        }

        /**
         * Accessor the the node's id
         * @return
         */
        public int getNodeID(){return nodeID;}

        /**
         * Accessor the the node's Level
         * @return
         */
        public int getNodeLevel() {
            return nodeLevel;
        }

        /**
         * Mutator for the node's data
         * @return
         */
        public void setNodeData(T newData)
        {
            data = newData;
        }

        /**
         * Mutator for the node's status
         * @return
         */
        public void setNodeStatus(int status)
        {
            nodeStatus = status;
        }

        /**
         * Mutator for the node's id
         * @return
         */
        public void setNodeID(int nID){ nodeID = nID; }

        /**
         * Mutator for the node's level
         * @return
         */
        public void setNodeLevel(int nodeLevel) {
            this.nodeLevel = nodeLevel;
        }

        /**
         * Mutator for the node's parent
         * @return
         */
        public void setParentNode(Node<T> parentNode)
        {
            this.parentNode = parentNode;
            parentNode.children.addLast(this);
        }
    }

    /**
     * This method adds the root node to the tree
     * @param data  the data to be stored in the node
     * @param nodeStatus the status of the node
     * @param nodeID  the id of he node
     * @param nodeL the level in the tree that this node is placed
     * @throws IllegalAccessException
     */
    public void addRootNode(T data,int nodeStatus, int nodeID,int nodeL) throws IllegalAccessException {
        if(rootNode == null )
            rootNode = new Node<>(new LinkedList<>(), this, null,data, nodeStatus, nodeID,nodeL);
        else
            throw new IllegalAccessException("A tree can not have more than one root node");
    }

    /**
     * This method is used to add a child node to another node
     * @param parentNode the node to add the children to
     * @param data the data to be added to the new node
     * @param nodeStatus the new node's status
     * @param nodeID the new node's id
     * @param nodeL the new node's level
     * @return
     * @throws IllegalAccessException
     */
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

    /**
     * Add a node to a specif place in the children list
     * This method is used to add a child node to another node
     * @param parentNode the node to add the children to
     * @param data the data to be added to the new node
     * @param nodeStatus the new node's status
     * @param nodeID the new node's id
     * @param index the place to add the node.
     * @param nodeL the new node's level
     * @return
     * @throws IllegalAccessException
     */
    public Node<T> addChildNodeWithIndex(Node<T> parentNode, T data, int nodeStatus, int nodeID,int index,int nodeL) throws IllegalAccessException {
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

    /**
     * Method to delete a node from the tree
     * @param node the node to be deleted
     * @throws IllegalAccessException
     */
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

    /**
     * Method to print the tree
     * @param node the root node
     * @param appender a character to separate the nodes
     */
    public void printTree(Node<T> node, String appender){
        System.out.println(appender + node.getData());
        node.getChildren().forEach(each -> printTree(each, appender +appender));
    }

    /**
     * A method used to create the stack while iterating through the nodes of the tree
     * @param node
     */
    public void createStack(Node<T> node){
        stack.push(node);
        node.getChildren().forEach(each -> createStack(each));
    }

    /**
     * Accessor for the root node
     * @return
     */
    public Node<T> getRootNode() {
        return rootNode;
    }

    /**
     * Accessor for the stack
     * @return
     */
    public Stack<Node<T>> getStack()
    {
        return stack;
    }

}

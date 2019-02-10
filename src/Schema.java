import java.util.LinkedList;

/**
 * This class represents the schema of a database
 * Stores the name of the database and the relations withing that database.
 * @author Emmeleia Arakleitou
 */
public class Schema{

    private String databaseName;
    private LinkedList<MyRelation> relations;

    /**
     * Constructor of class Schema
     * @param databaseName the name of the database
     */
    public Schema(String databaseName)
    {
        this.databaseName = databaseName;
        relations = new LinkedList<>();
    }

    /**
     * Adds a MyRelation Object to the linkedList
     * @param relation A MyRelation Object
     */
    public void addRelation(MyRelation relation)
    {
        this.relations.add(relation);
    }

    /**
     * Constructor for the LinkedList holding all the relations of this database
     * @return the linkedList with the relations
     */
    public LinkedList<MyRelation> getRelations() {
        return relations;
    }

    /**
     * Accessor for the database name
     * @return the database name
     */
    public String getDatabaseName()
    {
        return databaseName;
    }

    /**
     * This method returns a MyRelation Object based on a String name passed as argument
     * Or returns null if the database does not have this relation
     * @param relationName the name of the relation to look for
     * @return a MyRelation Object or null
     */
    public MyRelation getRelationOnName(String relationName)
    {
        for (MyRelation temp : relations) {
            if(temp.getRelationName().equalsIgnoreCase(relationName))
                return temp;
        }
        return null;
    }
}

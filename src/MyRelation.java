import java.util.LinkedList;
import java.util.HashMap;

/**
 * This class represents the Relations of the database
 * @author Emmeleia Arakleitou
 */
public class MyRelation {

    private Schema mySchema;
    private String relationName;
    private LinkedList<MyField> fields,primaryKeys;
    private HashMap<MyField,HashMap<String,MyField>> foreignKeys;

    /**
     * Constructor that takes as parameters the name of the relation and the schema it belongs to
     * @param mySchema the schema that the relation belongs to
     * @param relationName the relation name
     */
    public MyRelation(Schema mySchema, String relationName) {
        this.mySchema = mySchema;
        this.relationName = relationName;

        fields = new LinkedList<>();
        primaryKeys = new LinkedList<>();
        foreignKeys = new HashMap<>();
    }

    /**
     * This method is used to add a field to the relation
     * @param field the field to add
     */
    public void addField(MyField field){
        this.fields.add(field);
    }

    /**
     * Accessor for the relation name
     * @return
     */
    public String getRelationName() {
        return relationName;
    }

    /**
     * Accessor for the primary keys
     * @return a list with all the primary keys
     */
    public LinkedList<MyField> getPrimaryKey() {
        return primaryKeys;
    }

    /**
     *  Accessor for the foreign keys
     * @return a hashMap containing the foreign keys , the table it references to and the field
     */
    public HashMap getForeignKey() {
        return foreignKeys;
    }

    /**
     * adds a primary key to the relations
     * @param key the key to add
     */
    public void addPrimaryKey(MyField key)
    {
        this.primaryKeys.add(key);
    }

    /**
     * Adds a foreign key
     * @param foreignKey  the foreign key
     * @param referencingKey the referencing key
     */
    public void addForeignKey(MyField foreignKey, HashMap referencingKey)
    {
        this.foreignKeys.put(foreignKey,referencingKey);
    }

    /**
     * Accessor for the relation fields
     * @return a list with all the fields
     */
    public LinkedList<MyField> getFields()
    {
        return fields;
    }

    /**
     * Returns the MyField instance based on the field name
     * @param fieldName the name to look for
     * @return the MyField instance
     */
    public MyField getFieldOnName (String fieldName)
    {
        for (MyField temp : fields) {
            if(temp.getFieldName().equalsIgnoreCase(fieldName))
                return temp;
        }
        return null;
    }
}


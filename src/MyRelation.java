import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;

public class MyRelation {

    private Schema mySchema;
    private String relationName;
    private LinkedList<MyField> fields,primaryKeys;
    private HashMap<MyField,HashMap<String,Field>> foreignKeys;

    public MyRelation(Schema mySchema, String relationName) // en ksero an tha kamo class foreing key j primayr key gia na ta krata touta.
    {
        this.mySchema = mySchema;
        this.relationName = relationName;
        fields = new LinkedList<>();
        primaryKeys = new LinkedList<>();
        foreignKeys = new HashMap<>();
    }

    public void addField(MyField field)
    {
        this.fields.add(field);
    }

    public Schema getMySchema() {
        return mySchema;
    }

    public String getRelationName() {
        return relationName;
    }

    public LinkedList<MyField> getPrimaryKey() {
        return primaryKeys;
    }

    public HashMap getForeignKey() {
        return foreignKeys;
    }

    public void addPrimaryKey(MyField key)
    {
        this.primaryKeys.add(key);
    }

    public void addForeignKey(MyField foreignKey, HashMap referencingKey)
    {
        this.foreignKeys.put(foreignKey,referencingKey);
    }

    public LinkedList<MyField> getFields()
    {
        return fields;
    }

    public MyField getFieldOnName (String fieldName)
    {
        for (MyField temp : fields) {
            if(temp.getFieldName().equalsIgnoreCase(fieldName))
                return temp;
        }
        return null;
    }
}


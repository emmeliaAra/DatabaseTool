import java.util.LinkedList;

/**
 * This class represents the Fields of the relations
 * @author Emmeleia Arakleitou
 */
public class MyField {

    private MyRelation relation;
    private String fieldName, type;
    private LinkedList<Integer> constraints;

    /**
     * Constructor of the Class
     * @param relation the relation that this field belongs to.
     * @param fieldName the name of the field
     * @param type the type of the field
     * @param constraint the constraint of the field(if any)
     */
    public MyField(MyRelation relation, String fieldName, String type, LinkedList<Integer> constraint)
    {
        this.relation = relation;
        this.fieldName = fieldName;
        this.type = type;
        this.constraints = constraint;

    }

    
    public MyRelation getRelation() {
        return relation;
    }

    public String getFieldName()
    {
        return fieldName;
    }

    private String getType()
    {
        return type;
    }

    public LinkedList<Integer> getConstraints() {
        return constraints;
    }

    public void setConstraints(LinkedList constraints)
    {
        this.constraints = constraints;
    }
}

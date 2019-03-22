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
    public MyField(MyRelation relation, String fieldName, String type, LinkedList<Integer> constraint) {
        this.relation = relation;
        this.fieldName = fieldName;
        this.type = type;
        this.constraints = constraint;
    }

    /**
     * Accessor for the relalation that this field belongs to
     * @return A MyRelation Instance
     */
    public MyRelation getRelation() {
        return relation;
    }

    /**
     * Accessor for the name of the field
     * @return a string that represents the field name
     */
    public String getFieldName() {
        return fieldName;
    }
}

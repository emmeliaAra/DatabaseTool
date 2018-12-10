import java.util.LinkedList;

public class MyField {

    private MyRelation relation;
    private String fieldName, type;
    private LinkedList<Integer> constraints;

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

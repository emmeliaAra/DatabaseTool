import java.util.LinkedList;

public class Schema{

    private String databaseName;
    private LinkedList<MyRelation> relations;

    public Schema(String databaseName)
    {
        this.databaseName = databaseName;
        relations = new LinkedList<>();
    }

    public void addRelation(MyRelation relation)
    {
        this.relations.add(relation);
    }

    public LinkedList<MyRelation> getRelations() {
        return relations;
    }

    public String getDatabaseName()
    {
        return databaseName;
    }

    public MyRelation getRelationOnName(String relationName)
    {
        for (MyRelation temp : relations) {
            if(temp.getRelationName().equalsIgnoreCase(relationName))
                return temp;
        }
        return null;
    }
}

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;

public class OptimizeTree {

    private Vector<String> selectFieldName, fromRelationNames, whereClause;
    private TreeStructure<String> canonicalTree;
    private MyHelper myHelper;
    private Schema schema;

    public OptimizeTree(TreeStructure<String> canonicalTree, Schema schema, Vector<String> selectFieldName, Vector<String> fromRelationNames, Vector<String> whereClause)
    {
        this.canonicalTree = canonicalTree;
        this.selectFieldName = selectFieldName;
        this.fromRelationNames = fromRelationNames;
        this.whereClause = whereClause;
        this.schema = schema;
        myHelper = new MyHelper();
    }

    public HashMap<String,LinkedList<String>> splitWhere(Vector<String> whereClause) {
        HashMap<String,LinkedList<String>> optimizedWhere = new HashMap<>();
        LinkedList<String> where = new LinkedList<>(whereClause);
        LinkedList<String> referencingFields;
        LinkedList<MyRelation> relations;
        String temp = null;

        String whereString = new String(myHelper.getWhereFields(where));
        String[] whereParts = whereString.split("(?i)and");

        //Iterates through all the parts divided by "AND"
        for (int i=0; i<whereParts.length; i++) {
            referencingFields = new LinkedList<>();
            if(whereParts[i].contains("=")) {
                String[] equationParts = whereParts[i].split("=");
                String condition = null;

                //For every side of the "=" sing.
                for(int j=0; j<equationParts.length; j++) {
                    //Removes white spaces if any.
                    equationParts[j] = equationParts[j].replaceAll("\\s","");

                    //if there is a referencing table stores the table and and the field used is temporarily stored.
                    if(equationParts[j].contains(".")) {
                        referencingFields.addLast(equationParts[j].substring(0, equationParts[j].indexOf(".")));
                        temp = equationParts[j].substring(equationParts[j].indexOf(".")+1);

                    }else {
                        boolean found = false;

                        //if no "."  p simeni en ksero se pio relation kamni reference enna to psaxo p to schema !!
                        relations = schema.getRelations();
                        String name = getRelationNameOnField(equationParts[j],relations);

                        if(name != null)
                            referencingFields.addLast(name);
                        else
                            temp = equationParts[j].substring(equationParts[j].indexOf(".")+1);
                    }
                    if(j!= equationParts.length-1)
                        condition = temp + "=";
                    else
                        condition = condition + temp;
                }
                System.out.println(condition + "  " + referencingFields);
                optimizedWhere.put(condition,referencingFields);
            }
        }
        return optimizedWhere;
    }

    public String getRelationNameOnField(String fieldName, LinkedList<MyRelation> relations)
    {
        String relationName = null;
        boolean found = false;
        //get the relation that the field is in !
        for (MyRelation tempRelation : relations) {
            LinkedList<MyField> tempField = tempRelation.getFields();
            for(MyField field : tempField) {
                if (field.getFieldName().equalsIgnoreCase(fieldName)) {
                    relationName = tempRelation.getRelationName();
                    found = true;
                    break;
                }
            }
            if(found) break;
        }
        return relationName;
    }
}

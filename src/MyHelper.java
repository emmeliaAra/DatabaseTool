import java.util.LinkedList;
import java.util.HashMap;


/**
 * This class is used to implement some methods used
 * in various classes to reduce code duplication.
 * @author Emmeleia Arakleitou
 */
public class MyHelper {

    /**
     * This method is used to get transform the fields from a linkedList into a String including the commas
     * @param myList the list containing the fields
     * @return a string with all the fields concatenated into one.
     */
    public StringBuilder getFields(LinkedList<String> myList)
    {
        //Append the string together
        StringBuilder sb = new StringBuilder( 1024 );
        if(myList != null)
        {
            for(int i=0; i<myList.size(); i++)
                sb.append(myList.get(i)).append(",");
            //DELETE THE LAST COMMA
            sb.deleteCharAt(sb.length()-1);
        }
        return sb;
    }

    /**
     * This method is used to transform the select fields from linkedList into string
     * @param myList the linkedList containing the from fields
     * @return a string containing the from fields
     */
    public StringBuilder getSelectFields (LinkedList<String> myList)
    {
        //Append the select fields together. If a full stop is found the replace it with the comma added in the previous iteration.
        StringBuilder sb = new StringBuilder();
        for (String var: myList) {
            if(!var.equalsIgnoreCase("."))
                sb.append(var).append(",");
            else
                //if is a full stop replace the last character of the sb (,) with a full stop
                sb.replace(sb.length() - 1, sb.length() , var);
        }
        //delete the last comma!
        sb.deleteCharAt(sb.length()-1);
        return sb;
    }

    /**
     *  This method is used to get transform the where clause from a linkedList into a String.
     * @param myList a linkedList containing all the where clause values individually
     * @return a string with the where clause.
     */
    public StringBuilder getWhereFields(LinkedList<String> myList)
    {
        //Append whereFields together
        StringBuilder sb = new StringBuilder( 1024 );
        if(myList != null)
            for(int i=0; i<myList.size(); i++)
                //if it is a "." then append it to the string
                if(myList.get(i).equals("."))
                    sb.append(myList.get(i));
                else if(i>0)
                    //If not the first element and not a "." and the previous is a "." then add it without space otherwise add space
                    if(!myList.get(i).equals(".") && myList.get(i-1).equals("."))
                        sb.append(myList.get(i));
                    else sb.append(" " + myList.get(i));
                else
                    sb.append(" " + myList.get(i));
        return sb;
    }

    /**
     * This method is used to return a relation name based on the field.
     * @param fieldName the name of the field we want to find the relation it belongs to
     * @param relations the relations to look into
     * @param newTables the new tables created
     * @return
     */
    public String getRelationNameOnField(String fieldName, LinkedList<MyRelation> relations, HashMap<String, LinkedList<String>> newTables) {
        String relationName = null;
        boolean found = false;
        //get the relation that the field is in !
        for (MyRelation tempRelation : relations) {
            //if the relation is not a new relation the check for the field
            if(!newTables.containsKey(tempRelation.getRelationName())){
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
        }
        return relationName;
    }

    /**
     * This method is used to check if a string contains a symbol. if yes it returns it if not returns nul
     * @param stringToCheck the string to for the symbol
     * @return null or the symbol
     */
    public String getSymbol (String stringToCheck) {

        //The order matters. Need to check if it contains "<=" before checking "<" or "=" because "<=" contains "<" and "=" as well.
        if(stringToCheck.contains("<>")) return "<>";
        else if(stringToCheck.contains("!=")) return "!=";
        else if(stringToCheck.contains("<=")) return "<=";
        else if(stringToCheck.contains(">=")) return  ">=";
        else if(stringToCheck.contains("<")) return  "<";
        else if(stringToCheck.contains(">")) return ">";
        else if(stringToCheck.contains("==")) return "==";
        else if(stringToCheck.contains("=")) return "=";
        else return null;
    }

    /**
     * This method is used to check if the string is actually a float number. it will also return true if an integer
     * @param stringToCheck the string to check if it is a numeber
     * @return
     */
    public boolean isFloat(String stringToCheck)
    {
        //if the exception is thrown then is not a number
        try{
            Float.parseFloat(stringToCheck);
            return true;
        }catch(NumberFormatException e){
           return false;
        }
    }
}

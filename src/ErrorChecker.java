import java.util.*;

/**
 * This class is used to evaluate the SQL statement
 * and produce the appropriate error messages.
 * @author Emmeleia Arakleitou
 */
public class ErrorChecker {

    private static MySQLite mySQLite;
    private Schema schema;
    private String databasePath, databaseName;
    private MyHelper myHelper;

    /**
     * Constructor of ErrorChecker
     * @param mySQLite an instance of the class that connects to the database
     */
    public ErrorChecker(MySQLite mySQLite)
    {
        this.mySQLite = mySQLite;
        this.schema = mySQLite.getSchema();
        this.databasePath = mySQLite.getDatabaseName();
        this.databaseName = databasePath.substring(databasePath.lastIndexOf("\\")+1,databasePath.length()-3);
        myHelper = new MyHelper();
    }

    /**
     * Method that evaluates the statement and prevents the execution of the statement
     * Also it produces messages based on the errors
     * @param selectFieldName The vector that contains the select field components
     * @param fromRelationNames The vector that contains the relations that the statement will be executed to
     * @param whereClause The vector that contains the where clause components
     * @return a vector that contains the messages if any.
     */
    public Vector<String> handleSQlExceptions(Vector<String> selectFieldName, Vector<String>fromRelationNames, Vector<String> whereClause)
    {
        //Retrieve teh instance of the database.
        LinkedList<MyRelation> myRelations = schema.getRelations();
        LinkedList<String> myRelationName = new LinkedList<>();
        Vector<String> errorMessages = new Vector<>();

        if(selectFieldName.contains("*") && selectFieldName.size()>1) {
            errorMessages.add(" When the \"*\"operator is used in the from clause you cannot define any other field. A valid statement containing the  \"*\"operator is: \n " +
                    "\t\t Select * from tableName");
            return errorMessages;
        }

        //Get the names of all the relations in lowerCase letters
        for (MyRelation relation: myRelations)
            myRelationName.add(relation.getRelationName().toLowerCase());

        String missingTableError = "This set of tables is missing from the Database and cannot be used in the \"FROM\" Clause: ";
        StringBuilder errorTable = new StringBuilder();

        //Make them to loweCase because SQLite it is not case sensitive. if the index is minus one this this table does not belong in the schema
        LinkedList<String> relationsInStatement = new LinkedList<>();
        for(int i=0 ; i<fromRelationNames.size();i++)
            if(myRelationName.indexOf(fromRelationNames.get(i).toLowerCase()) == -1)
                errorTable.append(fromRelationNames.get(i)).append(" ,");
            else
                relationsInStatement.add(myRelationName.get(myRelationName.indexOf(fromRelationNames.get(i).toLowerCase())));

        //if the length of the string >0 it means that there a least one table in the from clause that does not belong to the schema
        if(errorTable.length() >0) {
            //delete the last ",".
            errorTable.deleteCharAt(errorTable.length()-1);
            errorMessages.add(missingTableError + "{ " + errorTable + "}");
        }

        //Call the methods to discover any other messages if any.
        if(!selectFieldName.isEmpty() && relationsInStatement.size()!=0){
            errorMessages = selectANDWhereClauseErrors(selectFieldName,relationsInStatement,errorMessages);
            errorMessages = moreThanOnce(relationsInStatement,errorMessages);
        }
        if(!whereClause.isEmpty())
            errorMessages = selectANDWhereClauseErrors(whereClause,relationsInStatement,errorMessages);

        return errorMessages;
    }

    /**
     * This method checks if a relation in the from field appears twice.
     * @param relationsInStatement the relations that appear in the from clause of the statement
     * @param errorMessages The vector of the existing messages if any to add the new ones if any
     * @return a vector that contains the error messages.
     */
    public Vector<String> moreThanOnce( LinkedList<String> relationsInStatement,Vector<String>errorMessages )
    {
        //Convert the list into a set. IF they are not of the same size it means that a table appears more than once in the from clause.
        Set<String> myRelationSet  = new LinkedHashSet<>(relationsInStatement);
        if(myRelationSet.size() != relationsInStatement.size()) {
            LinkedList<String> extraTables = new LinkedList<>();

            for (String relation: relationsInStatement){
                //If the first and the last occurrence of a table is not the same then the table is used twice. Is is not already added the add it to the lis
                if (relationsInStatement.indexOf(relation) != relationsInStatement.lastIndexOf(relation) && !extraTables.contains(relation))
                    extraTables.add(relation);
            }

            if(!extraTables.isEmpty())
                errorMessages.add("This set of tables appears more than once in the \"FROM\" Clause: " + extraTables.toString());
        }
        return errorMessages;
    }

    /**
     * This method is used to check the select and the where clause for mistakes
     * @param clauseToCheck the clause to check
     * @param relationsInStatement the relations that are included in the statement
     * @param errorMessages the vector containing the error messages if any
     * @return the vector containing the error messages.
     */
    public Vector<String> selectANDWhereClauseErrors(Vector<String> clauseToCheck, LinkedList<String> relationsInStatement, Vector<String> errorMessages) {

        String[] symbols = {"<=" ,">=","<",">","==","=","!="};
        boolean previousIsSymbol = false;

        //if is not only the star!
        if(!clauseToCheck.get(0).equalsIgnoreCase("*")) {
            int i=0;
            while (i<clauseToCheck.size()){
                //Check if the token to check is a symbol. if yes set the boolean to true.
                if(Arrays.asList(symbols).contains(clauseToCheck.get(i))){
                    previousIsSymbol = true;
                    i++;
                    continue;
                //if the token is "and" or "or" then move on...
                }else if(clauseToCheck.get(i).equalsIgnoreCase("and") || clauseToCheck.get(i).equalsIgnoreCase("or")){
                    i++;
                    continue;
                }
                 /* (1)If there is a referencing table and the table used to call a field is part of the from clause
                     then Check if the referencing table has that field.
                     (2)if the referencing Table is not part of the from clause add message. */
                 //wrong field.
                if(clauseToCheck.size() > i+1 && clauseToCheck.get(i+1).equals(".")){
                    String temp = null;
                    if( relationsInStatement.contains(clauseToCheck.get(i).toLowerCase())){
                        if(schema.getRelationOnName(clauseToCheck.get(i)).getFieldOnName(clauseToCheck.get(i+2)) == null)
                            temp = ("Table " + clauseToCheck.get(i) + " does not have a field called " + clauseToCheck.get(i+2));
                        i = i+3;
                       //wrong referencing table
                    }else if(!relationsInStatement.contains(clauseToCheck.get(i).toLowerCase())) {
                        temp =("Table " + clauseToCheck.get(i) + " is not part of the \" FROM \" clause and thus it can not be used to reference field " + clauseToCheck.get(i+2));
                        i=i+3;
                    }
                    if(!errorMessages.contains(temp) && temp!=null)
                        errorMessages.add(temp);

                } /* Check if the field belongs to any of the table if not add message.
                   If it appears more than once print message as well */
                //Field does not belong to the table
                else if ((clauseToCheck.size()> i+1 && !clauseToCheck.get(i+1).equals("."))|| clauseToCheck.size()<=i+1){
                    boolean needMoreCheck = true;
                    //if the previous token is a symbol then need to check if the other side is a number or string.
                    if(previousIsSymbol ) {
                        if(clauseToCheck.get(i).startsWith("\"") && clauseToCheck.get(i).endsWith("\""))
                            needMoreCheck = false;
                        else {
                            //check if the part after the symbol is an integer or a float
                            if(!myHelper.isInteger(clauseToCheck.get(i)))
                                needMoreCheck = true;

                            if(needMoreCheck){

                                if(myHelper.isFloat(clauseToCheck.get(i)))
                                    needMoreCheck = false;
                            }
                        }
                    }
                    //if the previous token is symbol the other side is not a string or a number then check if the field is ambiguous or if the field does not exists at all.
                    if(needMoreCheck){
                        String temp=null;
                        int counter = 0;
                        for (String relationName: relationsInStatement) {
                            if(schema.getRelationOnName(relationName).getFieldOnName(clauseToCheck.get(i)) != null)
                                counter ++;
                            if(counter>1)break;
                        }
                        if(counter>1)
                            temp = ("Ambiguous field name: " + clauseToCheck.get(i) + " The same field name exists in more than one relation \n" + "Try tableName.columnName");
                        else if(counter == 0)
                            temp = ("Unknown field " + clauseToCheck.get(i) + ". It does not belong to any of the tables used in the \" FROM \" clause  ");

                        if(temp!=null && !errorMessages.contains(temp))
                            errorMessages.add(temp);
                    }
                    i++;
                }
                previousIsSymbol = false;
            }
        }
        return errorMessages;
    }

    /**
     * This method is used to check the "Drop" statement for errors
     * @param statement the statement to check
     * @return a vector containing the error messages
     */
    public Vector<String> handleSQLDropTableErrors(String statement) {

        //Get everything after the "drop table".
        Vector<String> errorMessages = new Vector<>();
        String dropTable = "drop table ";
        int index = statement.toLowerCase().indexOf(dropTable);
        String evaluationStatement = statement.substring(index+dropTable.length(),statement.length()-1); //-1 to remove the semicolon
        boolean needMoreCheck = true;

        //if the statement contains a database then evaluate if the database is correct. If not then check if the relation is part of the database.
        if(evaluationStatement.toLowerCase().contains(".")) {
            String[] parts = evaluationStatement.split("\\.");
            if(!databaseName.equalsIgnoreCase(parts[0]) ) {
                errorMessages.add("The database name used in the statement is not correct.\n The name of your database is: " + databaseName);
                needMoreCheck = false;
            }
            evaluationStatement = parts[1];
        }
        if(needMoreCheck && schema.getRelationOnName(evaluationStatement) == null)
            errorMessages.add("The database you are using does not contain a table with the name: " + evaluationStatement);
        return errorMessages;
    }

    public Vector<String> checkFromClause(String statement,Vector<String> msg) {

        int indexOfFrom = statement.toLowerCase().indexOf("from");
        int indexOfSelect = statement.toLowerCase().indexOf("select");
        int indexOfWhere = statement.toLowerCase().indexOf("where");
        boolean continue1 = false;

        if(indexOfFrom>=0 && indexOfWhere>=0) {
            statement = statement.substring(0, statement.indexOf("where"));
            continue1 = true;
        }else if(indexOfFrom>=0)
            continue1 = true;
        else if(indexOfFrom<0 && indexOfSelect>=0 ) {
            if(msg.size()>0)
                msg.set(msg.size() - 1, "Keyword \" FROM\" is missing ");
            else
                msg.add("Keyword \" FROM\" is missing ");
        }

        //If the statement contains the "From" then check if there are relations defined in that clause.
        if(continue1) {
            //in the case where no "where " then we must delete the semicolon a the end
            if(statement.contains(";"))
                statement = statement.substring(0, statement.length() - 1);
            statement = statement.replaceAll("\\s", "");
            indexOfFrom = statement.indexOf("from");

            if (statement.length() - 1 == indexOfFrom + "from".length() - 1)
                msg.set(msg.size() - 1, "The from clause is empty please provide a relation. An example of a valid statement is: \n" +
                        "\t\t Select * from tableName;");
        }
        return msg;
    }

    public Vector<String> checkSelect (String charStream, Vector<String> messages)
    {
        charStream = charStream.replaceAll("\\s","");
        if(charStream.toLowerCase().contains("selectfrom")) {
            messages = new Vector<>();
            messages.add("Select clause fields are missing. These are examples of valid statements:\n" + "\t\tSelect fieldName from tableName; \n" +
                    " \t\tSelect tableName.fieldsName from tableName;");
        }
        return messages;
    }
}

import java.util.*;

public class ErrorChecker {

    private static MySQLite mySQLite;
    private Schema schema;
    private String databaseName;

    public ErrorChecker(MySQLite mySQLite)
    {
        this.mySQLite = mySQLite;
        this.schema = mySQLite.getSchema();
        this.databaseName = mySQLite.getDatabaseName();

    }


    public Vector<String> handleSQlExceptions(Vector<String> selectFieldName, Vector<String>fromRelationNames, Vector<String> whereClause)
    {
        LinkedList<MyRelation> myRelations = schema.getRelations();
        LinkedList<String> myRelationName = new LinkedList<>();
        Vector<String> errorMessages = new Vector<>();

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

        if(errorTable.length() >0) {
            errorTable.deleteCharAt(errorTable.length()-1);
            errorMessages.add(missingTableError + "{ " + errorTable + "}");
        }

        errorMessages = selectANDWhereClauseErrors(selectFieldName,relationsInStatement,errorMessages);
        errorMessages = moreThanOne(relationsInStatement,errorMessages);
        if(!whereClause.isEmpty())
            errorMessages = selectANDWhereClauseErrors(whereClause,relationsInStatement,errorMessages);

        return errorMessages;
    }

    public Vector<String> moreThanOne( LinkedList<String> relationsInStatement,Vector<String>errorMessages )
    {
        //Convert the list into a set. IF they are not of the same size it means that a table appears more than once in the from clause.
        Set<String> myRelationSet  = new LinkedHashSet<>(relationsInStatement);
        if(myRelationSet.size() != relationsInStatement.size()) {
            LinkedList<String> extraTables = new LinkedList<>();

            for (String relation: relationsInStatement){
                //If the first and the last occurrence of a table is not the same then the table is used twice. Is is not aleady added the add it to the lis
                if (relationsInStatement.indexOf(relation) != relationsInStatement.lastIndexOf(relation) && !extraTables.contains(relation))
                    extraTables.add(relation);
            }

            if(!extraTables.isEmpty())
                errorMessages.add("This set of tables appears more than once in the \"FROM\" Clause: " + extraTables.toString());

        }

        return errorMessages;
    }
    public Vector<String> selectANDWhereClauseErrors(Vector<String> clauseToCheck, LinkedList<String> relationsInStatement, Vector<String> errorMessages)
    {

        String[] symbols = {"<=" ,">=","<",">","==","=","!="};
        boolean previousIsSymbol = false;

        //if is not only the star!
        if(!clauseToCheck.get(0).equalsIgnoreCase("*")) {
            int i=0;
            while (i<clauseToCheck.size()){
                if(Arrays.asList(symbols).contains(clauseToCheck.get(i))){
                    previousIsSymbol = true;
                    i++;
                    continue;
                }else if(clauseToCheck.get(i).equalsIgnoreCase("and") || clauseToCheck.get(i).equalsIgnoreCase("or")){
                    i++;
                    continue;
                }

                 /*(1)if there is a referencing table and the table used to call a field is part of the from clause
                     then Check if the referencing table has that field.
                     (2)if the referencing Table is not part of the from clause add message.
                    */
                if(clauseToCheck.size() > i+1 && clauseToCheck.get(i+1).equals(".")){
                    if( relationsInStatement.contains(clauseToCheck.get(i).toLowerCase())){
                        if(schema.getRelationOnName(clauseToCheck.get(i)).getFieldOnName(clauseToCheck.get(i+2)) == null)
                            errorMessages.add("Table " + clauseToCheck.get(i) + " does not have a field called " + clauseToCheck.get(i+2));
                        i = i+3;
                    }else if(!relationsInStatement.contains(clauseToCheck.get(i).toLowerCase())) {
                        errorMessages.add("Table " + clauseToCheck.get(i) + " is not part of the \" FROM \" and thus it can not be used to reference field " + clauseToCheck.get(i+2));
                        i=i+3;
                    }
                } /* Check if the field belongs to any of the table if not add message.
                   If it appears more than once print message as well
                 */
                else if ((clauseToCheck.size()> i+1 && !clauseToCheck.get(i+1).equals("."))|| clauseToCheck.size()<=i+1){
                    boolean needMoreCheck = false;
                    if(previousIsSymbol ) {
                        if(clauseToCheck.get(i).startsWith("\"") && clauseToCheck.get(i).endsWith("\""))
                            needMoreCheck = false;
                        else {
                            char[] temp = clauseToCheck.get(i).toCharArray();
                            for (Character c : temp)
                                if (!Character.isDigit(c)) {
                                    needMoreCheck = true;
                                    break;
                                }
                        }
                    }
                    if(needMoreCheck){
                        int counter = 0;
                        for (String relationName: relationsInStatement) {
                            if(schema.getRelationOnName(relationName).getFieldOnName(clauseToCheck.get(i)) != null)
                                counter ++;
                            if(counter>1)break;
                        }
                        if(counter>1)
                            errorMessages.add("Ambiguous field name: " + clauseToCheck.get(i) + " The same field name exists in more than one relation \n" + "Try tableName.columnName");
                        else if(counter == 0)
                            errorMessages.add("Unknown field " + clauseToCheck.get(i) + " It does not belong to any of the tables used in the \" FROM \" clause  ");
                    }
                    i++;
                }
                previousIsSymbol = false;
            }
        }
        return errorMessages;
    }

    public Vector<String> handleSQLDropTableErrors(String statement)
    {
        Vector<String> errorMessages = new Vector<>();
        String dropTable = "drop table ";
        int index = statement.toLowerCase().indexOf(dropTable);
        String evaluationStatement = statement.substring(index+dropTable.length(),statement.length()-1); //-1 to remove the semicolon

        if(evaluationStatement.toLowerCase().contains("."))
        {
            String[] parts = evaluationStatement.split("\\.");
            if(!databaseName.equalsIgnoreCase(parts[0]) )
                errorMessages.add("The database name used in the statement is not correct.\n The name of your database is: " + databaseName);
        } else if(schema.getRelationOnName(evaluationStatement) == null)
            errorMessages.add("The database you are using does not contain a table with the name: " + evaluationStatement);

        return errorMessages;
    }

}

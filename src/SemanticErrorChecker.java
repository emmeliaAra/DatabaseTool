import java.util.*;

/**
 * This class is used to evaluate the SQL statement
 * and produce the appropriate error messages.
 * @author Emmeleia Arakleitou
 */
public class SemanticErrorChecker {

    private static MySQLite mySQLite;
    private Schema schema;
    private String databasePath, databaseName;
    private MyHelper myHelper;

    /**
     * Constructor of SemanticErrorChecker
     * @param mySQLite an instance of the class that connects to the database
     */
    public SemanticErrorChecker(MySQLite mySQLite)
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

        //if the select vector contains the star and any other fields then add the error and return.
        if(selectFieldName.contains("*") && selectFieldName.size()>1) {
            errorMessages.add(" When the \"*\"operator is used in the from clause you cannot define any other field. A valid statement containing the  \"*\"operator is: \n " +
                    "\t\t Select * from tableName");
            return errorMessages;
        }

        //Get the names of all the relations in lowerCase letters because SQLite is not case sensitive
        for (MyRelation relation: myRelations)
            myRelationName.add(relation.getRelationName().toLowerCase());


        String missingTableError = "This set of tables is missing from the Database and cannot be used in the \"FROM\" Clause: ";
        StringBuilder errorTable = new StringBuilder();

        /* Make them to loweCase because SQLite it is not case sensitive.
         * If the index is minus one this this table does not belong in the schema so add it to the errorTable String
         * Otherwise add them to relationsInStatement for further use. -Not using from vector because we need them in lowercase*/
        LinkedList<String> relationsInStatement = new LinkedList<>();
        for(int i=0 ; i<fromRelationNames.size();i++)
            if(myRelationName.indexOf(fromRelationNames.get(i).toLowerCase()) == -1 && !errorTable.toString().contains(fromRelationNames.get(i)))
                errorTable.append(fromRelationNames.get(i)).append(" ,");
            else if(!errorTable.toString().contains(fromRelationNames.get(i)))
                relationsInStatement.add(myRelationName.get(myRelationName.indexOf(fromRelationNames.get(i).toLowerCase())));

        /* if the length of the string >0 it means that there a least one table in the from clause
         * that does not belong to the schema. Delete the last comma at the end and add the message to the message vector*/
        if(errorTable.length() >0) {
            errorTable.deleteCharAt(errorTable.length()-1);
            errorMessages.add(missingTableError + "{ " + errorTable + "}");
        }

        //Call the methods to discover any other messages if any. if the select and relationsInStatement are not empty.
        if(!selectFieldName.isEmpty() && relationsInStatement.size()!=0){
            errorMessages = selectANDWhereClauseErrors(selectFieldName,relationsInStatement,errorMessages);
            errorMessages = moreThanOnce(new LinkedList<>(fromRelationNames),errorMessages);
        }

        if(!whereClause.isEmpty())
            errorMessages = selectANDWhereClauseErrors(whereClause,relationsInStatement,errorMessages);

        return errorMessages;
    }


  /*  public Vector<String> checkReferencingDatabase(Vector<String> fromRelation,Vector<String>errorMessages) {

        LinkedList<MyRelation> databaseRelations = schema.getRelations();
        //If the from list contains a dot is either a mistake of the table is referenced using the database.
        if (fromRelation.contains(".")) {
            for (int i = 0; i < fromRelation.size(); i++) {
                if (fromRelation.get(i).equals(".") && i > 0) {

                    if (!fromRelation.get(i-1).equalsIgnoreCase(databaseName))
                        //fromRelation.get(i+1) cannot be null because this is a syntax mistake and ANTLR spot it before calling this method
                        errorMessages.add("The database used to reference table \"" + fromRelation.get(i+1) + "\" does not" +
                                "exists. The name of the database you are using is \" " + databaseName + "\"");
                    else{
                        boolean foundAMatch = false;
                        //If the name of the database is correct then check if the database has a table with that name
                        for (MyRelation relation: databaseRelations)
                            if(relation.getRelationName().equalsIgnoreCase(fromRelation.get(i+1))) {
                                foundAMatch =true;
                                break;
                            }
                        if(!foundAMatch) {
                            errorMessages.add("The database you are using does not have a table named \" " + fromRelation.get(i + 1) + "\"");
                            i++;
                        }
                    }
                    iNotToCheck.add(i-1);
                    iNotToCheck.add(i);
                    iNotToCheck.add(i+1);
                }
            }
        }
        return errorMessages;
    }*/

    /**
     * This method checks if a relation in the from field appears twice.
     * @param relationsInStatement the relations that appear in the from clause of the statement
     * @param errorMessages The vector of the existing messages if any to add the new ones if any
     * @return a vector that contains the error messages.
     */
    public Vector<String> moreThanOnce( LinkedList<String> relationsInStatement,Vector<String>errorMessages )
    {
        /* Convert the list into a set. IF they are not of the same size it means that a table appears more than once in
         * the from clause.*/

        Set<String> myRelationSet  = new LinkedHashSet<>(relationsInStatement);
        if(myRelationSet.size() != relationsInStatement.size()) {
            LinkedList<String> extraTables = new LinkedList<>();

            /*if there are duplicates then check if the first and the last occurrence of a table is not the same then the
            * table is used twice and if is not already added into the extraTables list then add it*/
            for (String relation: relationsInStatement)
                if (relationsInStatement.indexOf(relation) != relationsInStatement.lastIndexOf(relation) && !extraTables.contains(relation))
                    extraTables.add(relation);

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

        boolean previousIsSymbol = false;
        boolean isPlusOrMinus = false;

        //if is not only the star! then check!
        if(!clauseToCheck.get(0).equalsIgnoreCase("*")) {
            int i=0;
            while (i<clauseToCheck.size()){
                // Check if the token to check is a symbol and set the boolean to true. Move to the next Token.
                if(myHelper.getSymbol(clauseToCheck.get(i))!=null){
                    previousIsSymbol = true;
                    i++; continue;
                //if the token is "and" or "or" then move on...
                }else if(clauseToCheck.get(i).equalsIgnoreCase("and") || clauseToCheck.get(i).equalsIgnoreCase("or")){
                    i++; continue;
                }else if(clauseToCheck.get(i).equals("-") ||clauseToCheck.get(i).equals("+") ) {
                     isPlusOrMinus = true;
                     i++; continue;
                 }
                 /* If there is a referencing table and is part of the from clause then check if the referencing table
                  * has that field. If not add error. If the referencing table is not part of the from clause then add message */
                if(clauseToCheck.size() > i+1 && clauseToCheck.get(i+1).equals(".") && !isPlusOrMinus){
                    String temp = null;
                    if( relationsInStatement.contains(clauseToCheck.get(i).toLowerCase())
                            && schema.getRelationOnName(clauseToCheck.get(i)).getFieldOnName(clauseToCheck.get(i+2)) == null)
                        temp = ("Table " + clauseToCheck.get(i) + " does not have a field called " + clauseToCheck.get(i+2));

                    else if(!relationsInStatement.contains(clauseToCheck.get(i).toLowerCase()))
                        temp =("Table " + clauseToCheck.get(i) + " is not part of the \" FROM \" clause and thus it can not be used to reference field " + clauseToCheck.get(i+2));

                    //In the case that there are duplicate relations involved in the same error do not add it twice
                    if(!errorMessages.contains(temp) && temp!=null)
                        errorMessages.add(temp);

                    //increase counter by three. because we check i and i+1.
                    i = i+3;

                } /* Check if the field belongs to any of the table if not add message.If the field appears more than once print message as well */
                else if ((clauseToCheck.size()> i+1 && !clauseToCheck.get(i+1).equals("."))|| clauseToCheck.size()<=i+1){
                    boolean needMoreCheck = true;
                    /* if the previous token is a symbol then need to check if the other side is a number or string.
                     * Also if previous token is (+,-) we must check if this token is a number. If not then errorMessage*/
                    if(previousIsSymbol) {
                        if(clauseToCheck.get(i).startsWith("\"") && clauseToCheck.get(i).endsWith("\"") && !isPlusOrMinus)
                            needMoreCheck = false;
                        else if(isPlusOrMinus && !myHelper.isFloat(clauseToCheck.get(i))) {
                            errorMessages.add("Invalid input " + clauseToCheck.get(i-1) + clauseToCheck.get(i));
                            needMoreCheck = false;
                        }else if(myHelper.isFloat(clauseToCheck.get(i)))
                            needMoreCheck = false;
                    }
                    /* if the previous token is symbol and the other side is not a string or a number then check if the
                     * field is ambiguous or if the field does not exists at all.*/
                    if(needMoreCheck){
                        String temp=null;
                        int counter = 0;
                        //Check if the same field appears in more than one relation if yes then break because is already ambiguous
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
                isPlusOrMinus = false;
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

    /**
     * This method is used to evaluate the From clause in the case of syntax mistake to
     * provide more detailed error messages
     * @param statement The statement to check
     * @param msg the errorMessage to return if any.
     * @return a Vector containing the error messages
     */
    public Vector<String> checkFromClause(String statement,Vector<String> msg) {

        //Get the indexes of the from, where and select
        int indexOfFrom = statement.toLowerCase().indexOf("from");
        int indexOfSelect = statement.toLowerCase().indexOf("select");
        int indexOfWhere = statement.toLowerCase().indexOf("where");
        boolean continue1 = false;

        /*If where and from exists get the statement before the where. If from does not exists add msg and replace
         * any existing messages coming from ANTLR */
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

            //if the length of the statement is the same size as the from then there is nothing in the From clause.
            if (statement.length() - 1 == indexOfFrom + "from".length() - 1)
                msg.set(msg.size() - 1, "The from clause is empty please provide a relation. An example of a valid statement is: \n" +
                        "\t\t Select * from tableName;");
        }
        return msg;
    }

    /**
     * This method is used to check the select clause in the case of syntax mistake to
     * provide more detailed error messages
     * @param charStream
     * @param messages
     * @return
     */
    public Vector<String> checkSelect (String charStream, Vector<String> messages)
    {
        //Replace all empty spaces and check if their is nothing into the select clause.
        charStream = charStream.replaceAll("\\s","");
        if(charStream.toLowerCase().contains("selectfrom")) {
            messages = new Vector<>();
            messages.add("Select clause fields are missing. These are examples of valid statements:\n" + "\t\tSelect fieldName from tableName; \n" +
                    " \t\tSelect tableName.fieldsName from tableName;");
        }
        return messages;
    }
}

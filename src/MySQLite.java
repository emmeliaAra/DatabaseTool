import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.TableView;
import java.util.*;
import java.sql.*;

public class MySQLite extends DatabaseBasic{

    private static final String TABLE = "TABLE";
    private static final String TABLE_NAME = "TABLE_NAME";
    private static final String COLUMN_NAME = "COLUMN_NAME";
    private static final String FKCOLUMN_NAME = "FKCOLUMN_NAME";
    private static final String REFCOLUMN_NAME = "PKCOLUMN_NAME";
    private static final String REFTABLE_NAME = "PKTABLE_NAME";
    private static final int PRIMARY_CON = 0;
    private static final int FOREIGN_CON = 1;
    private Vector<String> newTablesCreated;
    private MyHelper myHelper;
    private String databaseName;

    public MySQLite(String databaseName) {
        super(databaseName);
        this.databaseName =databaseName;
        myHelper = new MyHelper();
        newTablesCreated = new Vector<>();
    }

    public void simpleSelect(StringBuilder selectF,StringBuilder fromF) {

        String queryTemplate = "Select " + selectF +" from " + fromF + ";";
        execute(queryTemplate);
    }

    public void createAsStatement(StringBuilder fromF,StringBuilder selectF,String tableName) {

        if(!newTablesCreated.isEmpty())
        {
            if(newTablesCreated.contains(tableName))
                tableName = tableName + "1";
        }

        String queryTemplate = "Create table " + tableName + " AS Select " + selectF +" from " + fromF + ";";
        newTablesCreated.add(tableName);

        executeCreate(queryTemplate);
    }

    public void whereSelect(StringBuilder selectF, StringBuilder fromF,StringBuilder whereCl) {

        String queryTemplate = "Select" + selectF +" from " + fromF + " where " + whereCl + ";";
        execute(queryTemplate);
    }

    public void createAsStatementWhere(StringBuilder selectF,StringBuilder fromF,String tableName,StringBuilder whereClause) {

        if(!newTablesCreated.isEmpty())
        {
            if(newTablesCreated.contains(tableName))
                tableName = tableName + "1";
        }
        newTablesCreated.add(tableName);
        String queryTemplate = "Create table " + tableName + " AS Select" + selectF +" from " + fromF + " where " + whereClause + ";";
        executeCreate(queryTemplate);
    }

    public void joinStatement(StringBuilder selectF, LinkedList<String> fromFields, StringBuilder onClause) {

        String queryTemplate = "Select" + selectF + " from " + fromFields.get(0) + " join " + fromFields.get(1) + " on " + onClause + ";";
        execute(queryTemplate);
    }

    public void createJoinStatement(StringBuilder selectF, LinkedList<String> fromFields, String tableName, StringBuilder onClause) {

        if(!newTablesCreated.isEmpty())
        {
            if(newTablesCreated.contains(tableName))
                tableName = tableName + "1";
        }
        newTablesCreated.add(tableName);
        String queryTemplate = "Create table " + tableName + " AS Select " + selectF + " from " + fromFields.get(0) + " join " + fromFields.get(1) + " on " + onClause + ";";
        executeCreate(queryTemplate);
    }


    public ResultSet execute(String queryTemplate) {

        ResultSet resultSet = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryTemplate);
            resultSet = preparedStatement.executeQuery();
            //getResults(resultSet);
        }catch (SQLException e) {
           e.printStackTrace();

        }
        return resultSet;
    }

    public void executeCreate(String queryTemplate)
    {
        Statement statement;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(queryTemplate);
        }catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }

    public void undoTables(Vector<String> tablesCreated)
    {
        while (!tablesCreated.isEmpty()) {
            dropTable(tablesCreated.firstElement());
            tablesCreated.remove(0);
        }
    }

    public void dropTable(String tableName)
    {
        Statement statement;
        try{
            statement = connection.createStatement();
            String query = "DROP TABLE " + tableName + " ;";
            statement.executeUpdate(query);

        }catch (SQLException e)
        {
            e.printStackTrace();
        }

    }

    ///no neeed to have parameter database name as parameter giati etsi jialios onta kamno isntance toutou toy class xrinsipopoio ena database j kamno connect se jino kalontas touto to method me jino to instance enna paisi to schema!!
    public Schema getSchema()
    {
        DatabaseMetaData metaData;
        ResultSet resultSetTable,keySet;
        Schema mySchema = new Schema(databaseName);
        String columnName;
        LinkedList<String> primaryKeys;
        HashMap<String, HashMap<String, String>> foreignKeys;
        try{
            metaData = connection.getMetaData();
            resultSetTable = metaData.getTables(null,null,null,new String[]{TABLE});

            while(resultSetTable.next()) {
                //get Tables and add them to schema.
                String relationName = resultSetTable.getString(TABLE_NAME);
                MyRelation relation = new MyRelation(mySchema, relationName);
                mySchema.addRelation(relation);
            }

            LinkedList<MyRelation> relations = mySchema.getRelations();
            for (int i=0; i<relations.size(); i++ ) {
                resultSetTable = metaData.getColumns(null,null,relations.get(i).getRelationName(),null);
                // Get primary and foreign keys
             //   keySet = metaData.getPrimaryKeys(null,null,relations.get(i).getRelationName());
              //  primaryKeys = getPrimaryKeys(keySet);
                //keySet = metaData.getImportedKeys(null,null,relations.get(i).getRelationName());
                //foreignKeys = getForeignKeys(keySet);

                //GET INFORMATION FOR EACH COLUMN!
                while(resultSetTable.next()) {

                    LinkedList<Integer> constraints = new LinkedList<>();
                    columnName = resultSetTable.getString(COLUMN_NAME);
                    String type = resultSetTable.getString("TYPE_NAME");
                    MyField field = new MyField(relations.get(i), columnName, type, null);
                    relations.get(i).addField(field);
                 /*   if (primaryKeys.contains(columnName)) {
                        //Add constraint
                        constraints.add(PRIMARY_CON);
                        relations.get(i).addPrimaryKey(field);
                    }*/
                 /*   if (foreignKeys.containsKey(columnName)) {
                        //add constraint
                        constraints.add(FOREIGN_CON);
                        relations.get(i).addForeignKey(field, foreignKeys.get(columnName));
                        HashMap<String, String> temp = foreignKeys.get(columnName);
                    }*/
                    //  String temp = resultSetTable.getString("IS_NULLABLE");
                }
            }
        }catch (SQLException sql) {
            sql.printStackTrace();
        }

        return mySchema;
    }

    public LinkedList<String> getPrimaryKeys(ResultSet primaryKeySet) throws SQLException
    {
        LinkedList<String> primaryKeys = new LinkedList<>();

        while (primaryKeySet.next())
            primaryKeys.add(primaryKeySet.getString(COLUMN_NAME));

        return primaryKeys;
    }

    public HashMap<String,HashMap<String,String>> getForeignKeys(ResultSet foreignKeySet) throws SQLException {
        HashMap<String,HashMap<String,String>>foreignKeys = new HashMap<>();
        while (foreignKeySet.next())
        {
            String foreignKey = foreignKeySet.getString(FKCOLUMN_NAME);
            String referencingKey = foreignKeySet.getString(REFCOLUMN_NAME);
            String referencingTable = foreignKeySet.getString(REFTABLE_NAME);
            HashMap<String, String> temp = new HashMap<>();
            temp.put(referencingKey,referencingTable);
            foreignKeys.put(foreignKey,temp);
        }

        return foreignKeys;
    }

    public StringBuilder joinException(String query, String relation1, String relation2)
    {
        //(?i) -> use embedded flag in the regex to ignore case!
        String[] joinParts = query.split("(?i)and");
        StringBuilder myNewJoin = new StringBuilder();
        MyRelation relationA = getSchema().getRelationOnName(relation1);
        MyRelation relationB = getSchema().getRelationOnName(relation2);

        for(int i=0; i<joinParts.length; i++)
        {
            if(joinParts[i].contains("="))
            {
                String[] equationParts = joinParts[i].split("=");

                if(relationA.getFieldOnName(equationParts[0]) != null)
                {
                    equationParts[0] = relationA.getRelationName() + "." + equationParts[0];
                    equationParts[1] = relationB.getRelationName() + "." + equationParts[1];
                }else{
                    equationParts[0] = relationB.getRelationName() + "." + equationParts[0];
                    equationParts[1] = relationA.getRelationName() + "." + equationParts[1];
                }
                equationParts[0] = equationParts[0].replaceAll("\\s","");
                equationParts[1] = equationParts[1].replaceAll("\\s","");
                joinParts[i] = equationParts[0] + " = " + equationParts[1];
            }

            if(i != joinParts.length-1)
                myNewJoin.append(joinParts[i] + " and ");
            else
                myNewJoin.append(joinParts[i]);
        }
        return myNewJoin;
    }

    public void getResults(ResultSet resultSet)
    {
        try {
            ResultSetMetaData  resultSetMetaData = resultSet.getMetaData();
            int columnNum = resultSetMetaData.getColumnCount();
            while (resultSet.next()){
                for(int i=1; i<columnNum+1; i++) {
                  String val = resultSet.getString(i);
                  System.out.print(val + "        ");
                }
                System.out.println(" ");
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public javafx.scene.control.TableView getRows(TableView table, String tableName)
    {
        ObservableList<ObservableList> data = FXCollections.observableArrayList();
        String queryTemplate = "SELECT * from " + tableName;
        ResultSet resultSet;

        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(queryTemplate);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i++)
                    //Iterate Column
                    row.add(resultSet.getString(i));
                data.add(row);
            }
            table.setItems(data);

        } catch (SQLException e) {
            e.printStackTrace();
        }
         return table;
    }

    public LinkedList<String> getColumnNames(String tableName)
    {
        LinkedList<String> columnNames = new LinkedList<>();
        ResultSet resultSet = getResultsOnTable(tableName);

        try {
            int i=0;
            while (i<resultSet.getMetaData().getColumnCount()) {
                columnNames.add(resultSet.getMetaData().getColumnName(i+1));
                i++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return columnNames;
    }

    public ResultSet getResultsOnTable(String tableName) {
        String query = "Select * from " + tableName;
        return execute(query);
    }

    public Vector<String> handleSQlExceptions( Vector<String> selectFieldName, Vector<String>fromRelationNames,Vector<String> whereClause)
    {
        Schema myRelationSchema = getSchema();
        LinkedList<MyRelation> myRelations = myRelationSchema.getRelations();
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

        errorMessages = selectANDWhereClauseErrors(selectFieldName,relationsInStatement,myRelationSchema,errorMessages);
        errorMessages = moreThanOne(relationsInStatement,myRelationName,errorMessages);
        if(!whereClause.isEmpty())
            errorMessages = selectANDWhereClauseErrors(whereClause,relationsInStatement,myRelationSchema,errorMessages);

        return errorMessages;
    }

    public Vector<String> moreThanOne( LinkedList<String> relationsInStatement, LinkedList<String> myRelationName,Vector<String>errorMessages )
    {
        //Convert the list into a set. IF they are not of the same size it means that a table appears more than once in the from clause.
        Set<String> myRelationSet  = new LinkedHashSet<>(relationsInStatement);
        if(myRelationSet.size() != relationsInStatement.size())
            errorMessages.add("A table appears more than once in the \"FROM\" Clause: ");

        return errorMessages;
    }
    public Vector<String> selectANDWhereClauseErrors(Vector<String> clauseToCheck, LinkedList<String> relationsInStatement,Schema myRelationSchema, Vector<String> errorMessages)
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
                        if(myRelationSchema.getRelationOnName(clauseToCheck.get(i)).getFieldOnName(clauseToCheck.get(i+2)) == null)
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
                            if(myRelationSchema.getRelationOnName(relationName).getFieldOnName(clauseToCheck.get(i)) != null)
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
        } else if(!getSchema().getRelations().contains(evaluationStatement.toLowerCase()))
            errorMessages.add("The database you are using does not contain a table with the name: " + evaluationStatement);


        return errorMessages;
    }

    public Vector<String> getNewTablesCreated()
    {
        return newTablesCreated;
    }
}

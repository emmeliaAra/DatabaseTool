import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.control.TableView;
import java.util.*;
import java.sql.*;

/**
 * This class provides the methods to execute the SQL statements
 * @author Emmeleia Arakleitou
 */
public class MySQLite extends DatabaseBasic{

    private static final String COLUMN_NAME = "COLUMN_NAME";
    private static final String TABLE_NAME = "TABLE_NAME";
    private static final String TABLE = "TABLE";
    private Vector<String> newTablesCreated;
    private String databaseName;

    /**
     * This is the constructor of the class that receives
     * the name of the database file and connect to the
     * database.
     * @param databaseName the name of the database file.
     */
    public MySQLite(String databaseName) {
        super(databaseName);
        this.databaseName =databaseName;
        newTablesCreated = new Vector<>();
    }

    /**
     * A method used to execute simple select statements
     * @param selectF elements in the select clause.
     * @param fromF elements in the from clause
     */
    public void simpleSelect(StringBuilder selectF,StringBuilder fromF) {

        String queryTemplate = "Select " + selectF +" from " + fromF + ";";
        execute(queryTemplate);
    }

    /**
     * Method to create a table using a select sub-query.
     * @param fromF elements in the select clause.
     * @param selectF elements in the from clause
     * @param tableName the name of the new relation
     */
    public void createAsStatement(StringBuilder fromF,StringBuilder selectF,String tableName) {

        if(!newTablesCreated.isEmpty()) {
            if(newTablesCreated.contains(tableName))
                tableName = tableName + "1";
        }

        String queryTemplate = "Create table " + tableName + " AS Select " + selectF +" from " + fromF + ";";
        newTablesCreated.add(tableName);
        executeCreate(queryTemplate);
    }

    /**
     * This method is used to a select statement with a condition
     * @param selectF elements in the select clause.
     * @param fromF elements in the from clause
     * @param whereCl the condition
     */
    public void whereSelect(StringBuilder selectF, StringBuilder fromF,StringBuilder whereCl) {

        String queryTemplate = "Select" + selectF +" from " + fromF + " where " + whereCl + ";";
        execute(queryTemplate);
    }

    /**
     *  Method to create a table using a select sub-query with a condition.
     * @param selectF elements in the select clause.
     * @param fromF elements in the from clause.
     * @param tableName the name of the table.
     * @param whereClause the condition.
     */
    public void createAsStatementWhere(StringBuilder selectF,StringBuilder fromF,String tableName,StringBuilder whereClause) {

        if(!newTablesCreated.isEmpty()) {
            if(newTablesCreated.contains(tableName))
                tableName = tableName + "1";
        }
        newTablesCreated.add(tableName);
        String queryTemplate = "Create table " + tableName + " AS Select" + selectF +" from " + fromF + " where " + whereClause + ";";
        executeCreate(queryTemplate);
    }

    /**
     * Method to execute a join statement.
     * @param selectF elements in the select clause.
     * @param fromFields elements in the from clause.
     * @param onClause elements after the "ON" keyword.
     */
    public void joinStatement(StringBuilder selectF, LinkedList<String> fromFields, StringBuilder onClause) {

        String queryTemplate = "Select" + selectF + " from " + fromFields.get(0) + " join " + fromFields.get(1) + " on " + onClause + ";";
        execute(queryTemplate);
    }

    /**
     * Method to create a table using a Select-Join sub-query with a condition
     * @param selectF elements in the select clause.
     * @param fromFields elements in the from clause.
     * @param tableName the name of the table.
     * @param onClause elements after the "ON" keyword.
     */
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

    /**
     * This method executes the SQL statements using a preparedStatement
     * @param queryTemplate the query to execute
     * @return
     */
    public ResultSet execute(String queryTemplate) {

        ResultSet resultSet = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryTemplate);
            resultSet = preparedStatement.executeQuery();
        }catch (SQLException e) {
           e.printStackTrace();
        }
        return resultSet;
    }

    /**
     * This method executes the create statements
     * @param queryTemplate the query to execute
     */
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

    /**
     * This method is used to delete the relations created for the
     * intermediate results of execution.
     * @param tablesCreated the new tables created.
     */
    public void undoTables(Vector<String> tablesCreated) {
        while (!tablesCreated.isEmpty()) {
            dropTable(tablesCreated.firstElement());
            tablesCreated.remove(0);
        }
    }

    /**
     * A method to execute the drop table statements.
     * @param tableName the name of the table to drop.
     */
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

    /**
     * Method to get the schema of the database.
     * @return
     */
    public Schema getSchema()
    {
        DatabaseMetaData metaData;
        ResultSet resultSetTable;
        Schema mySchema = new Schema(databaseName);
        String columnName;
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

                //GET INFORMATION FOR EACH COLUMN!
                while(resultSetTable.next()) {
                    columnName = resultSetTable.getString(COLUMN_NAME);
                    String type = resultSetTable.getString("TYPE_NAME");
                    MyField field = new MyField(relations.get(i), columnName, type, null);
                    relations.get(i).addField(field);
                }
            }
        }catch (SQLException sql) {
            sql.printStackTrace();
        }
        return mySchema;
    }

    /**
     * This method is used to change the ON clause of the JOin statement so no exception will occur during execution.
     * @param query the query to execute
     * @param relation1 the name of the first relation
     * @param relation2 the name of the second relation
     * @return
     */
    public StringBuilder joinException(String query, String relation1, String relation2) {
        //(?i) -> use embedded flag in the regex to ignore case!
        String[] joinParts = query.split("(?i)and");
        StringBuilder myNewJoin = new StringBuilder();
        MyRelation relationA = getSchema().getRelationOnName(relation1);
        MyRelation relationB = getSchema().getRelationOnName(relation2);

        //If there is a referencing table change the name from the referencing table to the name of the new relation.
        for(int i=0; i<joinParts.length; i++) {
            if(joinParts[i].contains("=")) {
                String[] equationParts = joinParts[i].split("=");

                if(relationA.getFieldOnName(equationParts[0]) != null) {
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

    /**
     * Get the TableView object that contains the results of the table.
     * @param table the tableView object
     * @param tableName the name of the relation to get the results
     * @return
     */
    public javafx.scene.control.TableView getRows(TableView table, String tableName)
    {
        /* Create an observable list to hold the information. and perform a select query to
         * To retrieve the results*/
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

    /**
     * Method to iterate through the result set of a table
     * and get the names of the attributes
     * @param tableName the name of the table.
     * @return
     */
    public LinkedList<String> getColumnNames(String tableName) {
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

    /**
     * Execute a select statement and return a ResultSet
     * to display the result in the GUI.
     * @param tableName the name of the database.
     * @return
     */
    public ResultSet getResultsOnTable(String tableName) {
        String query = "Select * from " + tableName;
        return execute(query);
    }

    /**
     * Accessor for the vector containing the new tables created
     * @return
     */
    public Vector<String> getNewTablesCreated() {
        return newTablesCreated;
    }

    /**
     * Accessor for the database name
     * @return
     */
    public String getDatabaseName(){return databaseName;}
}

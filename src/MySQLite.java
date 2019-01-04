import java.sql.*;
import java.util.HashMap;
import java.util.LinkedList;

public class MySQLite extends DatabaseBasic{

    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private String databaseName;
    private static final String TABLE_NAME = "TABLE_NAME";
    private static final String TABLE = "TABLE";
    private static final String COLUMN_NAME = "COLUMN_NAME";
    private static final String FKCOLUMN_NAME = "FKCOLUMN_NAME";
    private static final String REFCOLUMN_NAME = "PKCOLUMN_NAME";
    private static final String REFTABLE_NAME = "PKTABLE_NAME";
    private static final int PRIMARY_CON = 0;
    private static final int FOREING_CON = 1;
    private static final int NOT_NULL_CON= 2;
    private static final int NULL_CON = 3;
    private static final int DEFAULT_CON = 4;
    private static final String DATA_TYPE = "DATA_TYPE";
    private MyHelper myHelper;

    public MySQLite(String databaseName)
    {
        super(databaseName);
        this.databaseName =databaseName;
        myHelper = new MyHelper();
    }

    public void simpleSelect(LinkedList<String> selectFields, LinkedList<String> fromFields) {
        StringBuilder fromF = myHelper.getFields(fromFields);
        StringBuilder selectF = myHelper.getFields(selectFields);

        String queryTemplate = "Select " + selectF +" from " + fromF + ";";
        resultSet = execute(queryTemplate);
    }

    public void createAsStatement(LinkedList<String> selectFields,LinkedList<String> fromFields,String tableName) {
        StringBuilder fromF = myHelper.getFields(fromFields);
        StringBuilder selectF = myHelper.getFields(selectFields);
        String queryTemplate = "Create table " + tableName + " AS Select" + selectF +" from " + fromF + ";";
        executeCreate(queryTemplate);
    }

    public void whereSelect(LinkedList<String> selectFields, LinkedList<String> fromFields,LinkedList<String> whereClause) {
        StringBuilder fromF = myHelper.getFields(fromFields);
        StringBuilder selectF = myHelper.getFields(selectFields);

        StringBuilder whereCl = myHelper.getWhereFields(whereClause);
        whereCl = whereException(whereCl.toString());

        String queryTemplate = "Select" + selectF +" from " + fromF + " where " + whereCl + ";";
        resultSet = execute(queryTemplate);
    }

    public void createAsStatementWhere(LinkedList<String> selectFields,LinkedList<String> fromFields,String tableName,LinkedList<String> whereClause) {
        StringBuilder fromF = myHelper.getFields(fromFields);
        StringBuilder selectF = myHelper.getFields(selectFields);
        int emm = 2 ; // apla gia na gi to duplicate.

        StringBuilder whereCl = myHelper.getWhereFields(whereClause);
        whereCl = whereException(whereCl.toString());
        String queryTemplate = "Create table " + tableName + " AS Select" + selectF +" from " + fromF + " where " + whereCl + ";";
        executeCreate(queryTemplate);
    }


    public ResultSet execute(String queryTemplate)
    {
        preparedStatement = null;
        resultSet = null;
        try {
            //queryTemplate = whereException(queryTemplate);
            preparedStatement = connection.prepareStatement(queryTemplate);
            resultSet = preparedStatement.executeQuery();
            System.out.println("______________________________________________________________________________________");
            while (resultSet.next())
                System.out.println(resultSet.getString(1));

            System.out.println("______________________________________________________________________________________");
        }catch (Exception e) {
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

            while(resultSetTable.next())
            {
                //get Tables and add them to schema.
                String relationName = resultSetTable.getString(TABLE_NAME);
                MyRelation relation = new MyRelation(mySchema, relationName);
                mySchema.addRelation(relation);
            }

            LinkedList<MyRelation> relations = mySchema.getRelations();
            for (int i=0; i<relations.size(); i++ ) {
                resultSetTable = metaData.getColumns(null,null,relations.get(i).getRelationName(),null);

                // Get primary and foreign keys
                keySet = metaData.getPrimaryKeys(null,null,relations.get(i).getRelationName());
                primaryKeys = getPrimaryKeys(keySet);
                keySet = metaData.getImportedKeys(null,null,relations.get(i).getRelationName());
                foreignKeys = getForeignKeys(keySet);

                //GET INFORMATION FOR EACH COLUMN!
                while(resultSetTable.next()) {

                    LinkedList<Integer> constraints = new LinkedList<>();
                    columnName = resultSetTable.getString(COLUMN_NAME);
                    String type = resultSetTable.getString("TYPE_NAME");

                    MyField field = new MyField(relations.get(i), columnName, type, null);
                    relations.get(i).addField(field);
                    if (primaryKeys.contains(columnName)) {
                        //Add constraint
                        constraints.add(PRIMARY_CON);
                        relations.get(i).addPrimaryKey(field);
                    }
                    if (foreignKeys.containsKey(columnName)) {
                        //add constraint
                        constraints.add(FOREING_CON);
                        relations.get(i).addForeignKey(field, foreignKeys.get(columnName));
                        HashMap<String, String> temp = foreignKeys.get(columnName);
                    }
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

    public HashMap<String,HashMap<String,String>> getForeignKeys(ResultSet foreignKeySet) throws SQLException
    {
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

    public StringBuilder whereException(String query) {

        //(?i) -> use embedded flag in the regex to ignore case!
        String[] whereParts = query.split("(?i)and");
        StringBuilder myNewWhere = new StringBuilder();
        for(int i=0; i<whereParts.length; i++)
        {
            //en tha dulefki panta dioti pes oti to filed name eshi kataxorimeno to name = {emmelia=emmelia} tote enne apiasi to = enno en tha prepi
            //to idio isxii j gia tin telia. alla telos panton pros to paron! afi sto !
            if(whereParts[i].contains("=")) // if in case that there is also Like j ta alla oulla!!!
            {
                String[] equationParts = whereParts[i].split("=");
                //check if it's referring to a field using the relation and remove it because this relation does not exists anymore.
                for(int j=0; j<equationParts.length; j++) {
                    if (equationParts[j].contains("."))
                        equationParts[j] = equationParts[j].substring(equationParts[j].indexOf(".") + 1);
                }

                //remove any white spaces before comparing the 2 parts!
                equationParts[0] = equationParts[0].replaceAll("\\s","");
                equationParts[1] = equationParts[1].replaceAll("\\s","");
                if(equationParts[0].equalsIgnoreCase(equationParts[1]))
                    // add "" and :1 to the second column if they have the same name. If it doesn't work -> check this line on git!
                    equationParts[1] = "\"" + equationParts[1]+ ":1\"";

                whereParts[i] = equationParts[0] + " = " + equationParts[1];
            }
            if(i != whereParts.length-1)
                myNewWhere.append(whereParts[i] + " and ");
            else
                myNewWhere.append(whereParts[i]);
        }
        return  myNewWhere;
    }
}

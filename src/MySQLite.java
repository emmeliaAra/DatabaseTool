import jdk.internal.org.objectweb.asm.Type;
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
    private static final String DATA_TYPE = "DATA_TYPE";
    private static final String FKCOLUMN_NAME = "FKCOLUMN_NAME";
    private static final String REFCOLUMN_NAME = "PKCOLUMN_NAME";
    private static final String REFTABLE_NAME = "PKTABLE_NAME";
    private static final int PRIMARY_CON = 0;
    private static final int FOREING_CON = 1;
    private static final int NOT_NULL_CON= 2;
    private static final int NULL_CON = 3;
    private static final int DEFAULT_CON = 4;


    public MySQLite(String databaseName)
    {
        super(databaseName);
        this.databaseName =databaseName;
    }

    public void simpleSelect(LinkedList<String> selectFields, LinkedList<String> fromFields) {

        StringBuilder fromF = getFields(fromFields);
        StringBuilder selectF = getFields(selectFields);

        String queryTemplate = "Select " + selectF +" from " + fromF + ";";
        resultSet = execute(queryTemplate);
    }

    public void createAsStatement(LinkedList<String> selectFields,LinkedList<String> fromFields,String tableName)
    {
        StringBuilder fromF = getFields(fromFields);
        StringBuilder selectF = getFields(selectFields);

        String queryTemplate = "Create table " + tableName + " AS Select" + selectF +" from " + fromF + ";";
        executeCreate(queryTemplate);
    }

    public void whereSelect(LinkedList<String> selectFields, LinkedList<String> fromFields,LinkedList<String> whereClause) {

        StringBuilder fromF = getFields(fromFields);
        StringBuilder selectF = getFields(selectFields);
        StringBuilder whereCl = getWhereFields(whereClause);
        String queryTemplate = "Select" + selectF +" from " + fromF + " where " + whereCl + ";";
        resultSet = execute(queryTemplate);
    }

    public void createAsStatementWhere(LinkedList<String> selectFields,LinkedList<String> fromFields,String tableName,LinkedList<String> whereClause)
    {
        StringBuilder fromF = getFields(fromFields);
        StringBuilder selectF = getFields(selectFields);
        StringBuilder whereCl = getWhereFields(whereClause);

        String queryTemplate = "Create table " + tableName + " AS Select" + selectF +" from " + fromF + " where " + whereCl + ";";
        executeCreate(queryTemplate);
    }


    public ResultSet execute(String queryTemplate)
    {
        preparedStatement = null;
        resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(queryTemplate);
            resultSet = preparedStatement.executeQuery();
            System.out.println("______________________________________________________________________________________");
            while (resultSet.next())
                System.out.println(resultSet.getString(1));

            System.out.println("______________________________________________________________________________________");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return resultSet;
    }

    public StringBuilder getFields(LinkedList<String> myList)
    {
        StringBuilder sb = new StringBuilder( 1024 );
        if(myList != null)
        {
            for(int i=0; i<myList.size(); i++)
                sb.append(myList.get(i) +",");
            sb.deleteCharAt(sb.length()-1);
        }
        return sb;
    }
    public StringBuilder getWhereFields(LinkedList<String> myList)
    {
        StringBuilder sb = new StringBuilder( 1024 );
        if(myList != null)
            for(int i=0; i<myList.size(); i++)
                    sb.append(myList.get(i) + " ");

        return sb;
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
        int columnflag;

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
            for (int i=1; i<relations.size(); i++ )
            {
                //Get Columns of reach relations.
                System.out.println("relation Name = " + relations.get(i).getRelationName() );
                resultSetTable = metaData.getColumns(null,null,relations.get(i).getRelationName(),null);

                // Get primary and foreign keys
                keySet = metaData.getPrimaryKeys(null,null,relations.get(i).getRelationName());
                primaryKeys = getPrimaryKeys(keySet);
                keySet = metaData.getImportedKeys(null,null,relations.get(i).getRelationName());
                foreignKeys = getForeignKeys(keySet);

                //GET INFORMATION FOR EACH COLUMN!
                while(resultSetTable.next()) {
                    LinkedList<Integer> constraints = new LinkedList<>();

                    //String type = resultSetTable.getString(DATA_TYPE);
                    //type = getType(type);
                    columnName = resultSetTable.getString(COLUMN_NAME);
                    String type = resultSetTable.getString("TYPE_NAME");
                    System.out.println("column Name = " + columnName + "  " + type );

                    MyField field = new MyField(relations.get(i),columnName,type,null);
                    if(primaryKeys.contains(columnName)) {
                        //Add constraint
                        constraints.add(PRIMARY_CON);
                        relations.get(i).addPrimaryKey(field);
                        System.out.println("Primary key -> " + field.getFieldName() );
                    }
                    if(foreignKeys.containsKey(columnName)) {
                        //add constraint
                        constraints.add(FOREING_CON);
                        relations.get(i).addForeignKey(field, foreignKeys.get(columnName));
                        HashMap<String, String> temp = foreignKeys.get(columnName);
                        System.out.println("foreign Key " + field.getFieldName());
                        System.out.println("Referencing." + temp);
                    }
                    String temp = resultSetTable.getString("IS_NULLABLE");
                    System.out.println(temp + " ho ho ho ");

                }
                System.out.println("------------------------------------------------------------");
            }
        }catch (SQLException sql)
        {
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



    public String getType(String typeNum)
    {
        //theli jialla types.
        int typeInt = Integer.parseInt(typeNum);
        switch (typeInt)
        {
            case Types.BIGINT:{
                typeNum = "BIGINT";
                break;
            }
            case Types.BLOB:{
                typeNum =  "BLOB";
                break;
            }
            case Types.CHAR:{
                typeNum = "CHAR";
                break;
            }
            case Types.DATE: {
                typeNum = "DATE";
                break;
            }
            case Types.DOUBLE:{
                typeNum = "DOUBLE";
                break;
            }
            case Type.FLOAT:{
                typeNum = "FLOAT";
                break;
            }
            case Types.INTEGER:{
                typeNum = "INTEGER";
                break;
            }
            case Types.VARCHAR:{
                typeNum = "VARCHAR";
                break;
            }

        }
        return typeNum;
    }
}

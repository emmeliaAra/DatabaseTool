import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class MySQLite extends DatabaseBasic{

    private ResultSet resultSet;
    private PreparedStatement preparedStatement;

    public MySQLite(String databaseName)
    {
        super(databaseName);
    }

    public void simpleSelect(LinkedList<String> selectFields, LinkedList<String> fromFields) {

        StringBuilder fromF = getFields(fromFields);
        StringBuilder selectF = getFields(selectFields);

        String queryTemplate = "Select" + selectF +" from " + fromF + ";";
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
        Statement statement = null;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(queryTemplate);
        }catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }

}

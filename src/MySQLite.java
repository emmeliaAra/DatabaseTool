import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySQLite extends DatabaseBasic{

    private ResultSet resultSet;
    private PreparedStatement preparedStatement;

    public MySQLite(String databaseName)
    {
        super(databaseName);
    }

    public ResultSet simpleSelect(String selectField, String fromField) {

        String queryTemplate = "Select " + selectField + " from " + fromField;
        execute(queryTemplate);
        return resultSet;
    }

    public void execute(String queryTemplate)
    {
        preparedStatement = null;
        resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(queryTemplate);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
                System.out.println(resultSet.getString(1));
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseBasic {

    private static final String JDBC_DRIVER = "org.sqlite.JDBC";
    private static final String DATABASE_LOCATION = "jdbc:sqlite:";
    protected Connection connection = null;
    private String databaseName = null;


    public DatabaseBasic(String databaseName)
    {
        this.databaseName = databaseName;
        open();
    }

    public void open()
    {
        File databaseFile = new File(databaseName);

        if(databaseFile.exists() == false) {
            System.out.println("The database file : " + databaseName +"does not exist!!");
            System.exit(0);
        }
        try {
            Class.forName(JDBC_DRIVER);
            getConnection();
        }catch (ClassNotFoundException cnfe)
        {
            cnfe.printStackTrace();
        }
    }

    //establish a jdbc connection with the database
    //Autocommit is turned off delaying updates until commit( ) is called
    public void getConnection()
    {
        try{
            connection = DriverManager.getConnection(DATABASE_LOCATION +databaseName);
            connection.setAutoCommit(false);
        }catch (SQLException sqlex)
        {
            sqlex.printStackTrace();
            close();
        }

    }

    public final void close()
    {
        try {
            connection.commit();
            connection.close();;
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }


}

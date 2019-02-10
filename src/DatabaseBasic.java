import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.io.File;

/**
 * This Class provides connection to the database
 * @author Emmeleia Arakleitou
 */
public class DatabaseBasic {

    private static final String JDBC_DRIVER = "org.sqlite.JDBC";
    private static final String DATABASE_LOCATION = "jdbc:sqlite:";
    protected Connection connection = null;
    private String databaseName;


    /**
     * Constructor of the class
     * @param databaseName the name of the database to connect to.
     */
    public DatabaseBasic(String databaseName) {
        this.databaseName = databaseName;
        open();
    }

    /**
     * Opens the Database file and calls
     * getConnection method to connect to the database.
     * Throws Exception if the file is not found
     */
    private void open()
    {
        File databaseFile = new File(databaseName);

        if(!databaseFile.exists()) {
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

    /**
     * Establishes a JDBC connection with the database
     * Autocommit is turned off, Delaying updated until commit method is called
     */
    private void getConnection()
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

    /**
     * This method closes the connection with the databasse an commits the changes..
     */
    public final void close()
    {
        try {
            connection.commit();
            connection.close();
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

}

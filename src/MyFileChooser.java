import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class represents the FileChooser that opens the dialog
 * and allows the user to choose the file to load.
 * @author Emmeleia Arakleitou
 */
public class MyFileChooser extends GraphicalUserInterface{

    private String initialDirPath = "C:\\Users\\emmel\\Desktop";
    private String myStringPath = null,myCopyPath, fileName;

    /**
     * This method is used to create the fileChooser and load the file.
     * @param myStage The stage the the fileChooser will be displayed
     * @param gUi an instance of the Graphical User interface class
     * @param mySQLite an instance to the class that connects to the DBMS
     * @return
     */
    public String setFileChooser(Stage myStage, GraphicalUserInterface gUi, MySQLite mySQLite)
    {
        FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("databaseFile","*.db");
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(extensionFilter);
        //fileChooser.setInitialDirectory(new File(initialDirPath));   //set the initial directory - Commented So that it works on different devices
        File file = fileChooser.showOpenDialog(myStage);

        //If the file exists. get the path and pass it but also keep a copy of the file.
        if (file != null) {
            //If the user is not trying to load the already loaded file then close the connection and load the new file.
            if(myStringPath == null || !myStringPath.equals(file.getPath())){

                gUi.safeCloseConnection(mySQLite);
                replaceFile(); // replace the used file with the copy that we kept to remove the restore the changes

                //Get the name of the database without the .db
                fileName = file.getName();
                myStringPath = file.getPath();
                copyFile(myStringPath); //create a copy of the file.
            }
        }
        return myStringPath;
    }

    /**
     * This method is used to copy the database file
     * @param path the path of the file to copy
     */
    public void copyFile(String path)
    {
        //Copy the file with the name databaseFileNamecopy.txt so that is wont appear on the dialog box.
        if(path!= null){
            Path myPath = Paths.get(path);
            myCopyPath = path.substring(0,path.indexOf(".")) + "copy.txt";
            Path destination = Paths.get(myCopyPath);
            try {
                Files.copy(myPath, destination, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                System.out.println("An Error occurred and the file cannot be copied.");
            }
        }
    }

    /**
     * This method is used to replace the database file used in the session with the copy that we made
     */
    public void replaceFile()
    {
        //Delete the original and copy the copy using the original's name path
        if(myStringPath != null){
            Path originalPath  = Paths.get(myStringPath);
            try {
                File thisFile = new File(myCopyPath);
                File renamedFile = new File(myStringPath+".db");
                thisFile.renameTo(renamedFile);
                Path copyPath = Paths.get(myStringPath+".db");

                Files.delete(originalPath);
                Files.copy(copyPath,originalPath,StandardCopyOption.REPLACE_EXISTING);
                Files.delete(copyPath);
            } catch (IOException e) {
               System.out.println("An Error occurred and the changes cannot be restored ");
            }
        }
    }

    /**
     * This method is used to delete the copied file when the user wants to commit the changes
     */
    public void deleteCopy(){

        if(myCopyPath != null)
        {
            Path copyPath = Paths.get(myCopyPath);
            try {
                Files.delete(copyPath);
            } catch (IOException e) {
                System.out.println("An Error occurred and the file cannot be deleted ");
            }
        }
    }

    /**
     * This method is used to save the changes made to the file without closing the application
     */
    public void saveWithoutExit(){
        //delete the old copy and make a new one with the current changes/
        deleteCopy();
        copyFile(myStringPath);
    }

    /**
     * This method is used to read the query file if
     * @param databaseName the name of the database file
     * @param path the path that the file must be loacated
     * @return a list with the queries if any.
     */
    public ArrayList<String> readQueryFile(String databaseName, String path)
    {
        //constructs the name that the query file must have and checks if their is any at the same directory of the database file/
        String newFileName = databaseName.substring(0,databaseName.length()-3);
        path = path.substring(0,path.length()-databaseName.length()) + newFileName;
        path = path + "Queries.txt";
        ArrayList<String> lines;

        //Get the lines of file as a stream
        try (Stream<String> stream = Files.lines(Paths.get(path))){
            lines = (ArrayList<String>) stream.collect(Collectors.toList());
        }catch (IOException ex) {
            lines = null;
        }
        return lines;
    }

    /**
     * Accessor for the database file name
     * @return
     */
    public String getFileName()
    {
        return fileName;
    }


}

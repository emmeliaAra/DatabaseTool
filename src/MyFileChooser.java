import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyFileChooser extends GraphicalUserInterface{

    private String initialDirPath = "C:\\Users\\emmel\\Desktop";
    private String myStringPath = null,myCopyPath, fileName;


    String temp ="C:\\Users\\emmel\\Desktop\\SCC 2016-2017\\2018-2019\\SCC 300 - Third Year Project\\DatabaseTool";

    public String setFileChooser(Stage myStage, GraphicalUserInterface gUi, MySQLite mySQLite)
    {
        FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("databaseFile","*.db");
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(extensionFilter);
        fileChooser.setInitialDirectory(new File(temp));   //set the initial directory
        File file = fileChooser.showOpenDialog(myStage);

        //If the file exists. get the path and pass it but also keep a copy of the file.
        if (file != null) {
            if(myStringPath == null || !myStringPath.equals(file.getPath())){
                //If this is a different file then
                gUi.safeCloseConnection(mySQLite);
                replaceFile();
                //Get the name of the database without the .db
                fileName = file.getName();
                myStringPath = file.getPath();
                copyFile(myStringPath);
            }
        }
        return myStringPath;
    }

    public void copyFile(String path)
    {
        if(path!= null){
            Path myPath = Paths.get(path);
            myCopyPath = path.substring(0,path.indexOf(".")) + "copy.db";
            Path destination = Paths.get(myCopyPath);
            try {
                Files.copy(myPath, destination, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void replaceFile()
    {
        //Delete the original and copy the copy using the original's name path
        if(myStringPath != null){
            Path originalPath  = Paths.get(myStringPath);
            Path copyPath = Paths.get(myCopyPath);
            try {
                Files.delete(originalPath);
                Files.copy(copyPath,originalPath,StandardCopyOption.REPLACE_EXISTING);
                Files.delete(copyPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteCopy(){

        if(myCopyPath != null)
        {
            Path copyPath = Paths.get(myCopyPath);
            try {
                Files.delete(copyPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void saveWithoutExit(){
        deleteCopy();
        copyFile(myStringPath);
    }

    public ArrayList<String> readQueryFile(String databaseName, String path)
    {
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

    public String getFileName()
    {
        return fileName;
    }

    public String getPath()
    {
        return myStringPath;
    }

}

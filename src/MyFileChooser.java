import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MyFileChooser extends GraphicalUserInterface{

    private String initialDirPath = "C:\\Users\\emmel\\Desktop";
    private String myStringPath,myCopyPath;


    String temp ="C:\\Users\\emmel\\Desktop\\SCC 2016-2017\\2018-2019\\SCC 300 - Third Year Project\\DatabaseTool";

    public String setFileChooser(Stage myStage)
    {
        FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("databaseFile","*.db");
        myStringPath = null;
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(extensionFilter);
        fileChooser.setInitialDirectory(new File(temp));          //set the initial directory
        File file = fileChooser.showOpenDialog(myStage);

        //If the file exists. get the path and pass it but also keep a copy of the file.
        if (file != null) {
            myStringPath = file.getPath();
            copyFile(myStringPath);
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
}

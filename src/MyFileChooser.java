import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;

public class MyFileChooser extends GraphicalUserInterface{

    private String initialDirPath = "C:\\Users\\emmel\\Desktop";

    public String setFileChooser(Stage myStage)
    {
        FileChooser.ExtensionFilter extensionFilter = new FileChooser.ExtensionFilter("databaseFile","*.db");
        String myPath = null;
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(extensionFilter);
        //set the initial directory
        fileChooser.setInitialDirectory(new File(initialDirPath));
        File file = fileChooser.showOpenDialog(myStage);

        if (file != null) {
            myPath = file.getPath();
        }
        return myPath;
    }

}

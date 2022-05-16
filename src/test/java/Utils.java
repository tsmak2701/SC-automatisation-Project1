import java.io.File;

public class Utils {

    public static String isFileExist(File file){
        if (file.exists()){
            return "Required file exists";
        } else return "Required file doesn't exist";
    }

    public static void deleteFile(File file){
        if (file.exists()) file.delete();
    }
}

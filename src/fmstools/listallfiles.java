package fmstools;
import java.io.File;

public class listallfiles {


    public listallfiles() {
        String[] pathnames;

        
       //fix path names
        String localDir = System.getProperty("user.dir");
        File f = new File(localDir+File.separator+"resources");
    
        // Populates the pathname array with file names
        pathnames = f.list();
        
        // For each loop the pathname array
        for (String pathname : pathnames) {
            // Print the names of files and directories
            printIt.o(pathname);
        }
        
    }
    public static void main(String[] args) {
        new listallfiles();
    }
    
}

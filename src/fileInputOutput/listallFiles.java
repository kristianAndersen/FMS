package fileInputOutput;

import java.io.File;
public class listallFiles {
    
    private String[] pathnames;

    
    public void listTheFiles() {
        

        // fix path namesuser.name
        String localDir = System.getProperty("user.dir");
        File f = new File(localDir + File.separator + "resources");

        // Populates the pathname array with file names
        pathnames = f.list();

       
        // For each loop the pathname array
        for (int i = 0; i < pathnames.length; i++) {
            // Print the names of files 
            if (i % 2 == 0){
                System.out.printf("%-10s", i + " .) " + pathnames[i]);
            }else{
                System.out.printf("%10s %-10s"," ", i + " .) " + pathnames[i]);
                System.out.println("\n");
            }
            
        }
       
        
    }

    public String[] returnFileList() {
        return pathnames;
    };

}

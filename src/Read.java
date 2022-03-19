import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class parses a log file for log
 * items with a level of SEVERE or WARNING
 */

public class Read extends Initialize{
    public static void readFromLog() {
        try {
            File myFile = new File("myLogs.txt");
            Scanner s = new Scanner(myFile);
            System.out.println("Parsing log for SEVERE and WARNING level records");
            while (s.hasNextLine()) {
                String line = s.nextLine();
                    if(line.startsWith("WARNING") || line.startsWith("SEVERE")){
                        System.out.println(".............................................................");
                        System.out.println(line);
                        s.nextLine();
                        String dateStamp = s.nextLine();
                        System.out.println(dateStamp);
                    }
                }
            System.out.println(".............................................................");
            System.out.println("Log Parsed!");
            s.close();
        }
        catch (IOException ex) {
            System.out.println("No SEVERE or WARNING level records found");
        }
    }
}

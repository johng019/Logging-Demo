import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Read extends Initialize{
    public static void readFromLog() {
        try {
            Scanner s = new Scanner(new File("myLog.txt"));
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

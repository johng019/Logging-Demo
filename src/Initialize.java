import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * This class initializes the logger object and defines
 * a location for log data to be written to.
 */

public class Initialize {

    protected Logger logger = Logger.getLogger("myLog.txt");

    public void init(){
        try{
            FileHandler fh = new FileHandler("myLogs.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);
            logger.setLevel(Level.INFO);
            logger.info("Logger running \n" + ".......................................");
        }catch(Exception e){
            logger.log(Level.WARNING,"FileNotFoundException : ", e);
        }
    }
}

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Initialize {
    protected Logger logger = Logger.getLogger("myLog.txt");

    public void init(){
        FileHandler fh;
        //System.setProperty("java.util.logging.SimpleFormatter.format", "%1$tF   %1$tT   %4$-7s %5$s %n" );
        try{
            fh = new FileHandler("C:\\Users\\Specialty Shops #3\\Desktop\\Spring 2022\\CEN 4802\\javaLogs\\myLog.txt");
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

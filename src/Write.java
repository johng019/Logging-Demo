import java.text.DecimalFormat;
import java.util.logging.Level;

public class Write extends Initialize{

    public void writeToLog(int a) {
        DecimalFormat df = new DecimalFormat("#.###");
        int i ;
        try {
            for (i = a; i <= 100; i++) {
                int j = 100 / i;
                logger.log(Level.INFO, "For i = " + i + " : j = " + df.format((double)100 / i ) +
                        "\n.......................................");
            }
        }
        catch(Exception e){
            logger.log(Level.SEVERE, "Exception :  " + e +
                    "\n.............................................................");
            logger.log(Level.WARNING, " Re-calling the Method " +
                    "\n ......................................");
            writeToLog(1);
        }
    }
}

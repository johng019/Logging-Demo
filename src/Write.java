import java.text.DecimalFormat;
import java.util.logging.Level;

/**
 * This class writes log data to a text file.
 * The data provided using a simple for loop
 * that takes the integers 0 thu 100 and
 * divides 100 by that number.
 *The returned value or exception is logged
 */

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

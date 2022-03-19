public class Main {

    /**
     * Entry point for the application
     * that will write data to a log file,
     * before reading back selected data
     * logs from that file
     */

    public static void main(String[] args)  {
        Initialize i =  new Initialize();
        Read r = new Read();
        Write w = new Write();

        i.init();
        w.writeToLog(0);
        i.logger.info("Log Created \n.......................................");
        r.readFromLog();
    }
}



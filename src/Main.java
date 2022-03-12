import biz.paluch.logging.gelf.wildfly.WildFlyGelfLogHandler;
import biz.paluch.logging.gelf.wildfly.WildFlyJsonFormatter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.*;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        Initialize i =  new Initialize();
        Read r = new Read();
        Write w = new Write();

        i.init();
        w.writeToLog(0);
        i.logger.info("Log Created \n.......................................");
        r.readFromLog();
    }
}

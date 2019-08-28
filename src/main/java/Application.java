import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String args[])
    {
      logger.debug("Started the logging");
      logger.debug("This is a unique transaction" + "SSN is 000-00-0000");
      logger.debug("This transaction is done by name"+ "Sangeeth Jagadish");

      System.out.println("Is this a violation");
    }
}

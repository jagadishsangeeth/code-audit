import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

public class Application {
    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String args[])
    {
      logger.debug("Started the logging");
      logger.debug("This is a unique transaction" + "SSN is 000-00-0000");
      logger.debug("This transaction is done by name"+ "Sangeeth Jagadish");

      System.out.println("Is this a violation");
    }

    public static void horribleIteration(String [] words){
        int i = 0;
        try {
            while(true){
                System.out.println(words[i]);
                i++;
            }
        } catch (IndexOutOfBoundsException e){
            //iteration complete
        }
    }

    public static void readWritePrivate() throws NoSuchFieldException, IllegalAccessException {
        Field f = System.class.getDeclaredField("lineSeparator");
        f.setAccessible(true);
        String separator = (String) f.get(System.class);
        System.out.println("Line separator is " + separator + ".");

        f.set(System.class ,"!!!");
        System.out.println("Line one");
        System.out.println("Line two");
        System.out.println("Line three");
    }



}

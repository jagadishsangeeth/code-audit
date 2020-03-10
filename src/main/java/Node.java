import java.util.HashMap;
import java.util.Map;

public class Node {

    //Test String builder error
    public String toStringConvert()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DeepCode").append("DeepCode only");
        return stringBuilder.toString();
    }

    //Credentials
    public Map basicPassword()
    {
        Map credentials = new HashMap();
        credentials.put("user" ,"user");
        credentials.put("pass","pass");
        return credentials;
    }

    //null check

    public Map nullCheck()
    {
        Map nullValues = new HashMap();
        nullValues.put("isnull",null);
        return nullValues;
    }

    //Catching exception and not doing anything
    public void checkException(Integer value)
    {
        try {

            if (value.toString() == "UST") {
                System.out.println("UST");
            } else {
                System.out.println("some other company");
            }
        }catch(NumberFormatException nfe)
        {
            
        }
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class ifsc
{
    public static void main(String[] args) throws ParseException,IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Ifsc code");
        String input=br.readLine();
        String bank=input.substring(0,4);
        String file="C:/Users/meera/OneDrive/Desktop/Project/data/"+bank+".json";  
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(file));
            JSONObject jsonObject = (JSONObject) obj;
            JSONObject code = (JSONObject) jsonObject.get(input);
            String bank1 = (String) code.get("BANK");
            System.out.println("Bank Name : "+bank1);
            String branch = (String) code.get("BRANCH");
            System.out.println("Branch Name : "+branch);
            String centre = (String) code.get("CENTRE");
            System.out.println("Centre : "+centre);
            String district = (String) code.get("DISTRICT");
            System.out.println("District : "+district);
            String state = (String) code.get("STATE");
            System.out.println("State : "+state);
            String add = (String) code.get("ADDRESS");
            System.out.println("Address : "+add);
            String contact= (String) code.get("CONTACT");
            System.out.println("Contact Number : "+contact);
        }
        catch (IOException e)
         {
            e.printStackTrace();
        }
    }
}
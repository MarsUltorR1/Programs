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
        String file="C:/Users/meera/OneDrive/Desktop/JavaProject/IFSCcode/data/"+bank+".json";  //C:\Users\meera\OneDrive\Desktop\JavaProject\IFSCcode\data
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(file));
            JSONObject jsonObject = (JSONObject) obj;
            JSONObject code = (JSONObject) jsonObject.get(input);
            System.out.println("Bank Name : "+(code.get("BANK")));
            System.out.println("Branch Name : "+(code.get("BRANCH")));
            System.out.println("Centre : "+(code.get("CENTRE")));
            System.out.println("District : "+(code.get("DISTRICT")));
            System.out.println("State : "+(code.get("STATE")));
            System.out.println("Address : "+(code.get("ADDRESS")));
            System.out.println("Contact Number : "+(code.get("CONTACT")));
        }
        catch (IOException e)
         {
            e.printStackTrace();
        }
    }
}

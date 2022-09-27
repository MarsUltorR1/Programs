import java.util.*;
public class palin_word 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("INPUT :");
        String input=sc.nextLine();
        int len=input.length();
        String check="!?.";
        System.out.print("OUTPUT  :");
        for(int i=0;i<len;i++)
        {
            char ch=input.charAt(i);
            if(Character.isLowerCase(ch)||check.indexOf(input.charAt(len-1))==-1)
            {
                System.out.println("INVALID INPUT");
                System.exit(0);
            }
        }
        input=input.substring(0,len-2)+" ";
        String wrd="",rev="",output="";
        for(int i=0;i<len-1;i++)
        {
            char ch=input.charAt(i);
            if(ch!=' ')
            {
                wrd=wrd+ch;
                rev=ch+rev;
            }
            else
            {  
                if(rev.equalsIgnoreCase(wrd)) 
                output=output+" "+wrd;
                else
                output=output+" "+(wrd+(rev.substring(1,rev.length())));
                wrd="";
                rev="";
            }
        }
        System.out.println("ORIGNAL STRING :  "+input);
        System.out.println("CONVERTED STRING :  "+output);
    }
      
}

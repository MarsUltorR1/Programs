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
        input=input.substring(0,len-1);
		input +=" ";
        String wrd="",rev="",output="";
        for(int i=0;i<len;i++)
        {
            char ch=input.charAt(i);
            if(ch!=' ')
            {
                wrd=wrd+ch;
                rev=ch+rev;
            }
			
            else
            {  
		        rev=rev+" ";
                if(rev.equalsIgnoreCase(wrd)) 
                output=output+" "+wrd;
                else
				{
					for(int k=0;k<=rev.length()-1;k++) 
						if(wrd.charAt(wrd.length()-1)==rev.charAt(k))	
							rev=rev.substring(k+2,rev.length());
				}
				output=output+" "+wrd+rev;
					wrd="";
					rev="";
            }
        }
        System.out.println("ORIGNAL STRING :  "+input);
        System.out.println("CONVERTED STRING :  "+output+" "+wrd);
    }
      
}

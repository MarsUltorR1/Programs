import java.util.*;
class Exchange
{
    int size;
    String rev,sent;
    Exchange()
    {
        sent="";
        size=0;
        rev="";
    }
    void readsentence()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence");
        sent=sc.nextLine()+" ";
        size=sent.length();
    }
    void exfirsthalf()
    {
        String nw="";
        for(int i=0;i<size;i++)
        {
            char ch=sent.charAt(i);
            if(ch!=' ')
            {
            nw=nw+ch;
            }
            else
            {
                if(nw.length()<=1)
                    rev=rev+ch;
                else
                {
                    rev=rev+" "+nw.substring(nw.length()-1)+nw.substring(1,nw.length()-1)+nw.charAt(0);
                    nw="";
                }
            }
        }
    }
    void display()
    {
        System.out.println(rev.trim());
    }
    public static void main(String[] args) 
    {
        Exchange ob=new Exchange();
        ob.readsentence();
        ob.exfirsthalf();
        ob.display();    
    }
}
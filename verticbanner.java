import java.util.Scanner;
public class verticbanner 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("N =");
        int N=sc.nextInt();
        if(N<2||N>9)
        {
            System.out.println("Invalid input.");
            return;
        }
        int length=0;
        int l=0;
        String name[]=new String[11];
        for(int i=0;i<N;i++)
        {
            System.out.print("Team "+(i+1)+" :");
            name[i]=sc.nextLine();
            if((l++)==0)
            name[i]=sc.nextLine();
            if(name[i].length()>length)
            length=name[i].length();
        }
        for(int i=0;i<length;i++)
        {
            for(int k=0;k<N;k++)
            {
                if(i<name[k].length())
                    System.out.print(name[k].charAt(i) + "\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;
public class changedate
{
    public void datechange(int d,int y)
    {
        String array[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int year[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int count=0;
        int day=0;
        if((y%4==0&&y%100!= 0)||y%400 == 0)
            year[1]=29;
            int i=0;
            while(d>=0)
            {
                if(i>=12)
                i=0;
                if(count>=12)
                count=0;
                d=d-year[i];
                if(d>0)
                {
                    count++;
                    i++;
                }
            }
            day=year[i]+d;
            if(day==0)
            day=year[i];
        System.out.println(day+" TH "+array[count]+" "+y);
    }
    public static void main(String[] args)
    {
        changedate ob=new changedate();
        Scanner sc = new Scanner(System.in);
        System.out.println( "DAY NUMBER :");
        int day=sc.nextInt();
        System.out.println("YEAR ");
        int year=sc.nextInt();
        System.out.println("Date After(N) Days :");
        int N=sc.nextInt();
        System.out.println("OUTPUT :");
        if(N<1||N>100)
        {
            System.out.println("Date After(N) Days Out Of Range");
            System.exit(0);
        }
        if(day<1||day>366)
        {
            System.out.println("Day Number Out Of Range");
            System.exit(0);
        }
        if(year<1000||year>9999)
        {
            System.out.println("Year not in 4 digits");
            System.exit(0);
        }
        System.out.println("Date After(N) Days: ");
        ob.datechange(day, year);
        day=day+N;
        if(year%4==0)
            while(day>366)
            {
                day=day-366; 
                year++;  
            }
        else
        while(day>365)
        {
            day=day-365; 
            year++;  
        }
        ob.datechange(day, year);        
    }
}

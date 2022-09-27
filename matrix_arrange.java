import java.util.*;
public class matrix_arrange 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("N =");
        int N=sc.nextInt();
        if(N<2||N>10)
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        int a[]=new int[N];
        int b[][]=new int[N][N];
        for(int i=0;i<N;i++)
            a[i]=sc.nextInt(); 
        for(int i=0;i<N;i++)
        {
            for(int k=0;k<N;k++)
            if(a[i]<a[k])
            {
                a[i]=a[i]+a[k];
                a[k]=a[i]-a[k];
                a[i]=a[i]-a[k];
            }
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                    b[i][j]=a[j];
            }  
        }
        for(int i=0;i<N;i++)
        {
            
            for(int k=N-1;k>0;k--)
            {
                b[i][k]=a[k];
            }
        }
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }      
    }
}

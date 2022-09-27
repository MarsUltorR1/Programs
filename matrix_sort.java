import java.util.*;
class matrix_sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("M = ");
        int M=sc.nextInt();
        System.out.print("N = ");
        int N=sc.nextInt();
        int A[][]=new int[M][N];
        if(M<=2||M>10||N<=2||N>10)
        {
        System.out.println("MATRIX SIZE OUT OF RANGE");
        }    
        else
        {
            for(int i=0;i<M;i++)
                for(int j=0;j<N;j++)
                    A[i][j]=sc.nextInt();
            System.out.println("OUTPUT :");
            System.out.println("ORIGNAL MATRIX :");
            for(int i=0;i<M;i++)
            {
                for(int j=0;j<N;j++)
                    System.out.print(A[i][j] +" ");
                System.out.println();
            }
            System.out.println("MATRIX AFTER SORTING ROWS :");
            for(int i=0;i<M;i++)
                for(int j=0;j<N;j++)
                    for(int k=0;k<N;k++)
                    if(A[i][k]>A[i][j])
                    {
                        A[i][k]=A[i][k]+A[i][j];
                        A[i][j]=A[i][k]-A[i][j];
                        A[i][k]=A[i][k]-A[i][j];
                    }
            for(int i=0;i<M;i++)
            {
                for(int j=0;j<N;j++)
                    System.out.print(A[i][j]+" ");
                System.out.println();
            }
        }
    }
}
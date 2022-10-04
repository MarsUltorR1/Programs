import java.util.*;
class matrix_reorganized
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("INPUT :");
        System.out.print("M =");
        int M=sc.nextInt();
        System.out.print("N =");
        int N=sc.nextInt();
        int A[][]=new int[M][N];
        int B[]=new int[M*N];int j=0,i=0;
        for(i=0;i<M;i++)
        {
            for( j=0;j<N;j++)
            {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("OUTPUT :");
        System.out.println("\n ORIGNAL MATRIX");
        int lg=A[0][0];
        int sg=A[0][0];
        int r1=0;
        int r2=0;
        int c1=0;
        int c2=0;
        for(i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
            System.out.print(A[i][j]+" ");
            System.out.println();
        }
        for(i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
            {
                if(A[i][j]>lg)
            {
                lg=A[i][j];
                r1=i;
                c1=j;
            }
            if(A[i][j]<sg)
            {
                sg=A[i][j];
                r2=i;
                c2=j;
            }
            }
        }
        System.out.println("Largest Number ="+lg);
        System.out.println("Row ="+(r1+1));
        System.out.println("Column ="+(c1+1));
        System.out.println();
        System.out.println("Smallest Number ="+sg);
        System.out.println("Row ="+(r2+1));
        System.out.println("Column ="+(c2+1));
        int k=0;
        for(i=0;i<M;i++)
        {
            for( j=0;j<N;j++)
            {
               B[k++]=A[i][j];
            }
        }
        k=0;
        int temp=0;
        for( i=0;i<M*N;i++)
        {
            for(k=0;k<M*N;k++)
            {
                if(B[k]<B[i])
                {
                    temp=B[k];
                    B[k]=B[i];
                    B[i]=temp;
                    temp=0;
                }
            }
            
        }
        k=0;
        for( i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
            {
                A[i][j]=B[k++];
            }
        }
        System.out.println("ORGANIZED MATRIX");
        for( i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
            {
               System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}

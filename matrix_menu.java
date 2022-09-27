import java.util.*;
class matrix_menu
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size :");
        int N=sc.nextInt();
        int p=1;
        if(N>3)
        {
            int A[][]=new int[N][N];
            for(int i=0;i<N;i++)
                for(int j=0;j<N;j++)
                    A[i][j]=sc.nextInt();
            while(p>0)
            { 
                System.out.println("MENU :");
                System.out.println("1. Border Elemnts"); 
                System.out.println("2. Inner Elemnts"); 
                System.out.println("3. Lower left triangle including diagonal"); 
                System.out.println("4. Lower left triangle excluding diagonal"); 
                System.out.println("5. Upper right triangle including diagonal"); 
                System.out.println("6. Upper right triangle excluding diagonal"); 
                System.out.println("7. Lower right triangle including diagonal");
                System.out.println("8. Lower right triangle excluding diagonal"); 
                System.out.println("9. Upper left triangle including diagonal");
                System.out.println("10. Upper left triangle excluding diagonal");
                System.out.println("11. Exit.");
                System.out.print("Enter Choice->");
                int choice=sc.nextInt();
                switch (choice) 
                {
                    case 1:
                    for(int i=0;i<N;i++)
                    {
                        for(int j=0;j<N;j++)
                        {
                            if((i==0||i==(N-1))||(j==0||j==(N-1)))
                            System.out.print(A[i][j]+"\t");
                            else
                            System.out.print("\t");
                        }
                        System.out.println();
                    }
                    break;
                    case 2:
                    for(int i=0;i<N;i++)
                        {
                            for(int j=0;j<N;j++)
                            {
                                if((i==0||i==(N-1))||(j==0||j==(N-1)))
                                System.out.print("  ");
                                else
                                System.out.print(A[i][j]+"\t");
                            }
                            System.out.println();
                        }
                        break;
                    case 3:
                    for(int i=0;i<N;i++)
                    {
                        for(int j=0;j<N;j++)
                        {
                            if((i==j)||(i>j))
                            System.out.print(A[i][j]+"\t");    
                        }
                        System.out.println();
                    }
                    break;
                    case 4:
                    for(int i=0;i<N;i++)
                    {
                        for(int j=0;j<N;j++)
                        {
                            if(i>j)
                            System.out.print(A[i][j]+"\t");    
                        }
                        System.out.println();
                    }
                    break;
                    case 5:
                    for(int i=0;i<N;i++)
                    {
                        for(int j=0;j<N;j++)
                            if((i==j)||(i<j))
                            System.out.print(A[i][j]+"\t");   
                            else 
                            System.out.print("\t"); 
                        System.out.println();
                    }
                    break;
                    case 6:
                    for(int i=0;i<N;i++)
                    {
                        for(int j=0;j<N;j++)
                            if(i<j)
                            System.out.print(A[i][j]+"\t");   
                            else 
                            System.out.print("\t"); 
                        System.out.println();
                    }
                    break;
                    case 7:
                    for(int i=0;i<N;i++)
                    {
                        for(int j=0;j<N;j++)
                            if((i+j)>=N-1)
                            System.out.print(A[i][j]+"\t");   
                            else 
                            System.out.print("\t"); 
                        System.out.println();
                    }
                    break;
                    case 8:
                    for(int i=0;i<N;i++)
                    {
                        for(int j=0;j<N;j++)
                            if((i+j)>N-1)
                            System.out.print(A[i][j]+"\t");   
                            else 
                            System.out.print("\t"); 
                        System.out.println();
                    }
                    break;
                    case 9:
                    for(int i=0;i<N;i++)
                    {
                        for(int j=0;j<N;j++)
                            if((i+j)<=N-1)
                            System.out.print(A[i][j]+"\t");   
                            else 
                            System.out.print("\t"); 
                        System.out.println();
                    }
                    case 10:
                    for(int i=0;i<N;i++)
                    {
                        for(int j=0;j<N;j++)
                            if((i+j)<N-1)
                            System.out.print(A[i][j]+"\t");   
                            else 
                            System.out.print("\t"); 
                        System.out.println();
                    }
                    break;
                    case 11:
                        System.out.println("Exiting Program....");
                        System.exit(0);
                    break;
                }
            }
        }
        else 
        System.out.println("Input Invalid ");
        
    }
}
    

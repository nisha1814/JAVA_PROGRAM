import java.util.Scanner;
 class array{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a1=new int[n][n];
        int[][] a2=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
             a1[i][j]=sc.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
             a2[i][j]=sc.nextInt();

        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(a1[i][j]+a2[i][j]+" ");
            System.out.println("");

        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                int m=0;
                for(int k=0;k<n;k++)
                   m += a1[i][k]*a2[k][j];
                System.out.print(m+" ");
            }
            System.out.println("");

        }
        
       
    }
 }
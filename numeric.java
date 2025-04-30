public class numeric
{
    public static void main(String args[])
    {
        int i,j,k;
        for(i=1;i<=4;i++)
        { 
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

         for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        int count=1;
         for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++,count++)
            {
                System.out.print(count+" ");
            }
            System.out.println();
        }
         for(i=1;i<=4;i++)
        {
            for(j=4;j>=i;j--)
                System.out.print(" ");
            for(k=1;k<=i;k++)
                System.out.print(i+" ");
            System.out.println();
        }
    }
}
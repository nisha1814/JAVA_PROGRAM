public class character
{
    public static void main(String args[])
    {
        char ch='A';
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(ch+" ");
            System.out.println();
            ch++;
        }
         for(i=1;i<=5;i++)
        {
            ch='A';
            for(j=1;j<=i;j++,ch++)
                System.out.print(ch+" ");
                
            System.out.println();
        }
        ch='A';
         for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++,ch++)
                System.out.print(ch+" ");
            System.out.println();
            
        }

    }
}
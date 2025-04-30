class star{
    public static void main(String args[])
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
          
            for(j=1;j<=i;j++)
            {
                System.out.print("*" +" ");
            }
            System.out.println();
        }


         for(i=1;i<=4;i++)
        {
            System.out.println();
            for(j=4;j>=i;j--)
            {
                System.out.print("*" +" ");
            }
        }
        System.out.println();
      
         for(i=1;i<=5;i++)
        {
            for(j=5;j>i;j--)
                System.out.print(" ");
            for(k=1;k<=i;k++)
                System.out.print("*");
            System.out.println();
        }
        
        System.out.println();

        for(i=1;i<=5;i++)
        {
            for(j=1;j<i;j++)
                System.out.print(" ");
            for(k=5;k>=i;k--)
                System.out.print("*");
            System.out.println(" ");
        }

        System.out.println();

        for(i=1;i<=5;i++)
        {
            for(j=4;j>=i;j--)
                System.out.print(" ");
            for(k=1;k<=i;k++)
                System.out.print("*");
            System.out.println();
        }
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(" ");
            for(k=4;k>=i;k--)
                System.out.print("*");
            System.out.println();
        }

        System.out.println();

        for(i=1;i<=10;i++)
        {
            for(j=1;j<=10;j++)
            {
                if(i==j || i+j==11)
                    System.out.print("X");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


 }
}

        
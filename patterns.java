public class patterns {
    public static void main(String[]args){
        char c='A';
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            { 
                if(i==1 && j==1)
                    System.out.print(c);
                else if(j==1)
                    System.out.print((char)(c+i-2));
                else   
                    System.out.print((char)(c+i-1));
            }
            System.out.println("");
        }

        System.out.println(c);
        for(int i=1;i<=5;i++){
            System.out.print(c);
            c++;
            for(int j=1;j<=i;j++)
            {
                System.out.print(c);
            }
            
            System.out.println();
        }

        for(int i=1;i<=5;i++)
        { 
            char cc='A';
            for(int j=1;j<=i;j++)
            {
                if(i==1 && j==1)
                    System.out.println(cc);
                else if(i==j)
                    System.out.println((char)(cc+i-2));
                else
                    System.out.print((char)(cc+i-1));

            }
        }

        for(int i=1;i<=5;i++)
        {
            char ch='A';
            for(int j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }
       
        
    }
    
}

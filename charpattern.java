import java.lang.*;
public class charpattern {
    public static void main(String [] args)
    {
        String s="PROGRAM";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            for(int j=0;j<s.length();j++)
            {
                if(i==j||i+j==s.length()-1)
                    System.out.print(c);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    
        for(int i=1;i<=5;i++)
         {
         for(int j=1;j<=5;j++)
         {
            if(i==1||i==5||j==1)
            {
                System.out.print("*");
            }
            else
                System.out.print(" ");
         }
         System.out.println("");
         }

         for(int i=0;i<s.length();i++)
         {
             char c=s.charAt(i);
             for(int j=0;j<s.length();j++)
             {
                 if(i==j||j==s.length()-i-1)
                     System.out.print(c);
                 else
                     System.out.print(" ");
             }
             System.out.println();
         }

         for(int i=1;i<=5;i++)
         { char c='A';
            for(int j=1;j<=i;j++)
            {
                if(i==1&&j==1)
                 System.out.print(c);
                else if(j==1)
                    System.out.print((char)(c+i-2));
                else
                    System.out.print((char)(c+i-1));
            }
            System.out.println();
         }
         
         int n=5;
         char cha='A';
        for(int i=1;i<n;i++)
         { 
        
            for(int j=n;j>i;j--)
                System.out.print(" ");
            for( int k=1;k<=i;k++)
                System.out.print((char)(cha+k-1));
            for(int l=1;l<i;l++)
                System.out.print((char)(i+64-l));
            System.out.println("");
         }
         for(int i=1;i<n;i++)
         {
            for(int j=1;j<=i;j++)
                System.out.print(" ");
            for(int j=1;j<n-1;j++)
                System.out.print((char)(64+j));
            /*for(int j=1;j<n;j++)
                System.out.print((char)(j+64));*/
          System.out.println("");
         }
        
         char ch='A';
        int n1=1;
         for(int i=1;i<=6;i++)
         {
            if(i%2!=0)
            {
                for(int j=1;j<=3;j++){
                    System.out.print(ch+" ");
                }
                ch++;
                System.out.println("");
            }
            else 
            {
                System.out.print(" ");
                for(int k=1;k<=3;k++){
                    System.out.print(n1);
                    n1++;
                }
                System.out.println(" ");
            }
         }
         
         for(int i=1;i<=5;i++){
            if(i==1)
            {
                for(int j=1;j<=5;j++){
                    System.out.print(j);
                }
             
            }
            else if(i==5){
                for(int j=5;j>=1;j--){
                    System.out.print(j);
                }
               
            }
            else{
                System.out.print(i);
                for(int j=1;j<=3;j++){
                    System.out.print(" ");
                }
                System.out.print(5-i+1);
            
            }
            System.out.println("");
        }
         int sum=0,a=0,b=1;
         for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++)
            {
               sum=a+b;
               a=b;
               b=sum;
               System.out.print(sum+" ");
            }
            System.out.println();
            
         }
        }
     

    
}

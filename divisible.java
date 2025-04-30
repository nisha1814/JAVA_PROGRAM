import java.util.Scanner;

class divisible{
    public static void main(String args[])
    {
        
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n%3==0 && n%5==0){
          System.out.println("Divisible by both 3 and 5");
        }
        else if(n%3==0)
        {
          System.out.println("Divisible by 3");
          
        }
        else if(n%5==0)
        {
          System.out.println("Divisible by 5");

        }
        
        else 
        {
          System.out.print("Not divisible by 3 and 5");

        }
    }
}
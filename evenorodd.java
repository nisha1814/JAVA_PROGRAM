import java.util.Scanner;

class evenorodd{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if(n%2==0)
          System.out.print("Even number");
        else
          System.out.print("Odd number");
    }
}
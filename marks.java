import java.util.Scanner;
class mark{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      int marks = scan.nextInt();
      if (marks>35)
       System.out.print("Pass");
     else
       System.out.print("Fail");
    }
}
import java.util.Scanner;

public class basic{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in) ;
        String name=scan.nextLine();
        Double score=scan.nextDouble();
       String department=scan.nextLine();

        System.out.println("My name is:"+name);
        System.out.println("My score is:"+score/10 +"/10");
        System.out.print("My department is:"+department);
      
   }
}
import java.util.*;
class movieticket{
    public static void main(String[]args){  
        Scanner sc=new Scanner(System.in);
        boolean weekday=sc.nextBoolean();
        int age=sc.nextInt();
    if(weekday==true)
    {
        if(age<13)
            System.out.print("Rs.100");
        else if(age>=13 && age<64)
            System.out.print("Rs.150");
        else
            System.out.print("Rs.130");
    }
    else
    {
         if(age<13)
            System.out.print("Rs.120");
        else if(age>=13 && age<64)
            System.out.print("Rs.180");
        else
            System.out.print("Rs.150");
        
    }
    }
}
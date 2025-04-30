import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0 && year%100!=0){
            System.out.print("The given year is leapyear");
        }
        else{
            System.out.println("The given year is not a leapyear");
        }
    }
    
}

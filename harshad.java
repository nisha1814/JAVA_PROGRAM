import java.util.*;
public class harshad {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0, rem=0;
        int num=n;
        while(num>0)
        {
            rem=num%10;
            sum+=rem;
            num/=10;
        }
        if(n%sum==0)
            System.out.println("Harshad number");
        else
            System.out.println("Not harshad number");
        
    }
    
}

import java.util.*;
public class automorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long sq=n*n;
        System.out.println(sq);
        while(n>0)
        {
            if(n%10 != sq%10){
                System.out.println("Not an automorphic number");
                break;
            }
            n/=10;
            sq/=10;
        }
        if(n==0)
        {
            System.out.println("Automorphic number");
        }
    
    }
    
}

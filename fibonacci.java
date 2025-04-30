import java.util.*;
public class fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,res=0;
     
        for(int i=2;i<=n;i++)
        {
            System.out.print(a+" ");
            res=a+b;
            a=b;
            b=res;
           
        }
       
    }
    
}

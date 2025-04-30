import java.util.*;
 class factorial {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int fact=sc.nextInt();
        int res=1;
        for(int i=1;i<=fact;i++){
            res*=i;
        }
        System.out.println(res);
    }
    
}

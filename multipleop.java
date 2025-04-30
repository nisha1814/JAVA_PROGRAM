import java.util.*;
class multipleop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        for(int i=1;i<=a;i++){
            c+=b;
        }
        System.out.println(c);
    }
}
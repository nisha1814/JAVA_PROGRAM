import java.util.*;
public class nisha {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }

    }
}

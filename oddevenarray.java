import java.util.*;
public class oddevenarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr1=new int[n];
        
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Even no:");
        for(int i=0;i<n;i++){
            if(arr1[i]%2==0)
            {
                System.out.print(arr1[i]+" ");
            }
        }
        System.out.println("");
        System.out.print("odd no:");
        for(int i=0;i<n;i++){
            if(arr1[i]%2 !=0){
                System.out.print(arr1[i]+" ");
            }
        }
    }
}

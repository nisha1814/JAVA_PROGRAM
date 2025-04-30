import java.util.*;
public class maxminarray {
 
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int temp=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("Max no:"+ max);
        System.out.println("Min no:" +min);
    
}
}

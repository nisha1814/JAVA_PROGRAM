import java.util.*;
public class ascending {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int temp=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-1;j++)
            {
                if(arr[i]>arr[j])
                { 
                  temp=arr[i];
                  arr[i]=arr[j];  
                  arr[j]=temp;
                }
            }
        }
        
            System.out.print(Arrays.toString(arr));
    }
    
} 
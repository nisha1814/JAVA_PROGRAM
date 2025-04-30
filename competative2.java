import java.util.*;
public class main{
    public static void main{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        int target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=1;j<n;j++)
            {
                sum=arr[i]+arr[j];
                if(sum==target)
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}


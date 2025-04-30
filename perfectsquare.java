import java.util.*;
public class perfectsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,8,9,4,25,36};
        int n=arr.length;
        int i=2,st=0,end=n-1;
        Arrays.sort(arr);
        while(st<=end)
        {
            int j=i*i;
            if(j<arr[st])
            {
                i++;
                j=i*i;
            }
            if(arr[st]==j)
            {
                System.out.print(arr[st]+" ");
                i++;
            }
            st++;
        }

    }
    
}

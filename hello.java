import java.lang.System;
import java.util.Scanner;
class Solution {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int [] arr=new int[n];
        int i,j;
        for( i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        int target=scan.nextInt();

        for(i=0;i<n-1;i++)
        {
            for( j=1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {

                    System.out.println(i,j);
                }
            }
        }
    } 
}
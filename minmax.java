import java.util.*;
class minmax 
{   int minmax(int n){
    int min=0,max=999;
    Scanner sc=new Scanner(System.in);
        for(int i=1;i<=n;i++)
        {
            
            int a=sc.nextInt();
            if(a<min)
            {
                min=a;
            }
            if(a>max)
            {
                max=a;
            }
         }  
         
         System.out.println("Maxvalue:"+max);
         System.out.println("Minvalue:"+min);
         return max-min;
    }   


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        minmax obj=new minmax();
        System.out.println("Diff:"+obj.minmax(n));

    }
}
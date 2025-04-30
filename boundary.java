public class boundary {

    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n=a.length;
        int i=0,j=0,sum=0;
        System.out.println("Boundary Traversal");

        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                if(i==0 || i==n-1 || j==0 || j==n-1)
                    sum+=a[i][j];
        }
        System.out.print(sum);
       
        
    }
}

public class diagonal {
    public static void main(String[] args) {
        int i=0,j=0,n=3;
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Primary Diagonal:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++){
                if(i==j)
                    System.out.print(a[i][j]+" ");
            }
        }
        System.out.println("");
        System.out.println("Secondary Diagonal:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++){
                if(i+j==n-1)
                    System.out.print(a[i][j]+" ");
            }
        }
        
    }
    
}

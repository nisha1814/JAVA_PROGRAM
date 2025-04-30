
import java.util.*;

public class alternativesort {

    public static void main(String[] args) {
        int[] arr = {67, 56, 98, 34, 90};
        int n = arr.length;
        int i = 0, j = n - 1;
        Arrays.sort(arr);
        while (i <= n / 2) {
            if (i == j) {
                System.out.println(arr[i]); 
            }else {
                System.out.println(arr[i]);
                System.out.println(arr[j]);
            }
            i++;
            j--;
        }
    }

}

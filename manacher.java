
import java.util.Scanner;

class manacher {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder t = new StringBuilder();
  
        for (char c:s.toCharArray()) {
            t.append("#").append(c);
        }
        t.append("#");
         int max=0;
        for(int i=0;i<t.length();i++){
            int l=i-1;
            int r=i+1;
            int count=0;
            while(l>=0 && r<t.length() && t.charAt(l)==t.charAt(r))
            {
                count++;
                l--;
                r++;
            }
            if(count>max)
                max=count;

        }
        System.out.println(max);

    }
}
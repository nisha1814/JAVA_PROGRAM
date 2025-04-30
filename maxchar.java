import java.util.*;
public class maxchar {
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char ch1=sc.next().charAt(0);
    char ch2=sc.next().charAt(0);
    maxchar obj=new maxchar();
    System.out.print(obj.maxchar(ch1,ch2));
    
}   
  char maxchar(char ch1,char ch2){
    if(ch1>ch2)
     return ch1;
    else
     return ch2;
  }
}

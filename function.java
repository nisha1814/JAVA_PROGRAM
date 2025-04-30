import java.util.Scanner;
 public class Demo{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
    void multi(int a,int b)
    {
        System.out.println(a*b);
    }
    public static void main(String[] args)
    {
        Demo obj=new Demo();
        obj.add(2,4);
        obj.multi(2,4);
    }
 }
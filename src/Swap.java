import java.util.*;
public class Swap {
    public static void main(String[] args) {
        int a,b,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("a="+a+"\nb="+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping:\na="+a+"\nb="+b);
    }
}

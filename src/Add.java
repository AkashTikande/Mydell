import java.util.*;
public class Add {
    public static void main(String[] args) {
        int a,b,add;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number");
        a = sc.nextInt();
        b =sc.nextInt();
        add(a,b);
    }
    static void add(int x ,int y)
    {
        System.out.println("Sum="+(x+y));
    }
}

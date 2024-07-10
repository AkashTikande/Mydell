import java.util.*;
public class Odd {
    public static void main(String[] args) {
        int i,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Entwr the value of n:");
        n= sc.nextInt();
        for(i=1;i<=n;i+=2)
        {
            System.out.println(i);
        }
    }
}

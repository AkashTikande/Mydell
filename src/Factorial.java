import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        int n,fact;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        fact =facto(n);
        System.out.println("Factorial="+fact);
    }
    static int facto (int n)
    {
        int i,fact=1;
        for(i=1;i<=n;i++)
        {
            fact =fact*i;
        }
        return fact;
    }
}
/*import java.util.*;
* public class Factorial
* Public Static void main(String args[])
* int n, fact;
* Scanner sc = new Scanner (System.in);
* ;System.ot.println("Enter The number:)
* n = sc.nexInt();
* fact =facto(n
* System.out.println("factorial of a number =" +fact);
* }
* Static inr facto (int n)
* {
* int i,fact =1;
* dor(i=1;i<=n;i++)
* {
* fact =fact*i;
* }
* return fact;
* }
*
* */

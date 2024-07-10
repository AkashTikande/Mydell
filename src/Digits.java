import java.util.*;
public class Digits {
    public static void main(String[] args) {
        {
            int count =0,n;
            Scanner sc=new Scanner (System.in);
            System.out.println("Enter A Number:");
            n=sc.nextInt();
            while(n!=0)
            {
                count++;
                n/=10;
            }
            System.out.println("Count="+count);
        }
    }
}

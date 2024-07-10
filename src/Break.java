import java.util.*;
public class Break {
    public static void main(String args[]){
        int n,total=0,i;
        Scanner sc = new Scanner(System.in);
        for(i=1;i<=0;i++)
        {
            System.out.print("Enter a number.:");
            n=sc.nextInt();
            if(n>99)
                break;
            total+=n;
        }
        System.out.println("sum="+total);
    }
}

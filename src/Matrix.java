import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        int m, n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and column:");
        m = sc.nextInt();
        n = sc.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[n][m];
        System.out.println("Matrix A");
        for (i = 0; i <= m - 1; i++) ;
        {
            for (j = 0; j <= n - 1; j++) ;
            {
                System.out.print("Enter a no:");
                a[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i <= m-1; i++) ;
        {
            for (j = 0; j <= n-1; j++) ;
            {
                b[i][j] = a[i][j];
            }
            System.out.println("Transpose Matrix");
            for (i = 0; i <= n-1; i++) {
                for (j = 0; j <= m-1; j++) {
                    System.out.println(b[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
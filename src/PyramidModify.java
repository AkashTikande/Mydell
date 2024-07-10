public class PyramidModify {
    public static void main(String[] args) {
        int Term = 6;
        for(int i=1;i<=Term;i++){
            for(int j= Term;j>=i;j--){   // condition (j<=1; j--) gives infinite Execution of loop
                System.out.print(" * ");
            }
            System.out.println();//new line
        }
    }
}

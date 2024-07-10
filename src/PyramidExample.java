public class PyramidExample
{
    public static void main (String args [])
    {
        for (int i=1;i<=5;i++)  // nested for loop, A loop inside Another loop.
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(" * "); // blank space also executed  // nextLine() need not tobe specified
            }
            System.out.println(); // for getting new loop on next line
        }
    }
}


/* public class PyramidExample {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }
}*/
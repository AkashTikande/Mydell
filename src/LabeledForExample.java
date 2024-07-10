public class LabeledForExample {
    public static void main(String[] args) {
        aa:
        for (int i = 1; i <= 9 ; i++) { // value are increment maximum UP-TO 99  starting from 11
            bb:
            for (int j = 1; j <= 9 ; j++) {
                if (i == 9 & j == 10) {  // change the value of i and j to get different results
                    break aa;
                }
                System.out.println(i+" "+j);  // spacing will also change the output of programme:gives space between 2 rows
            }
        }
    }
}
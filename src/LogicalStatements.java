public class LogicalStatements {
        public static void main(String[] args) {
            int i = 0;
            while (i <= 10) {               //use different conditions and combinations for trail of code:
                if (i == 4) {
                    i++;
                    continue;
                    //break;
                }

                System.out.println(i);
                i++;
            }
        }
}

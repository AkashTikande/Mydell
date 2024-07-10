import java.util.*;
public class Bird {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc = new Scanner("T");
        System.out.println("Enter your name");
        int i;
        int j;
        for (i = 0; i <= 10; i++) {
            System.out.println("T");
        }
        for (j = 0; j <= 10; j++) {
            System.out.println("A");
        }


        class Cotline extends Bird {
            void funcCotline() {
                System.out.println("HIGHT");
            }

            public void funcMTYSTRY() {
            }
        }
        class MYSTRY extends Cotline {
            {
                System.out.println("MY function");
            }

            class Demo {
                public static void main(String[] args) {
                    Cotline m = new Cotline();
                    m.funcCotline();
                    m.funcMTYSTRY();
                }
            }
        }
    }
}

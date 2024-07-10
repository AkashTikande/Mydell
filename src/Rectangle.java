import java.util.*;
public class Rectangle {
    public static void main(String[] args) {
        float l, b, area, perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle:");
        l = sc.nextFloat();
        b = sc.nextFloat();
        area = l * b;
        perimeter = 2 * (l + b);
        System.out.println("The Area=" + area + "\nThe Perimeter=" + perimeter);

    }
}
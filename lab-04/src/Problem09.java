import java.util.Locale;
import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of edges of a triangle: ");
        int edg1 = scanner.nextInt();
        int edg2 = scanner.nextInt();
        int edg3 = scanner.nextInt();

        if (edg1 + edg2 > edg3 && edg2 + edg3 > edg1 && edg3 + edg1 > edg2) {
            int perimeter = edg1 + edg2 + edg3;
            System.out.println("The perimeter: " + perimeter);
        } else System.out.println("The input is invalid.");


    }
}
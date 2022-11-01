import java.util.Locale;
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        double xDistance = Math.sqrt(x * x);
        double yDistance = Math.sqrt(y * y);

        if ((xDistance <= 10.0 / 2) && (yDistance <= 5.0 / 2)) {
            System.out.printf("Point (%.1f, %.1f) is in the rectangle%n", x, y);
        } else {
            System.out.printf("Point (%.1f, %.1f) is not in the rectangle%n", x, y);
        }
    }
}

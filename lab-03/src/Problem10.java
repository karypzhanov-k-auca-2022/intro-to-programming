import java.util.Locale;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (Math.sqrt(x * x + y * y) <= 10.0) {
            System.out.println("Point (" + x + ", " + y + ") is in the circle");
        } else {
            System.out.println("Point (" + x + ", " + y
                    + ") is not in the circle");
        }
    }
}

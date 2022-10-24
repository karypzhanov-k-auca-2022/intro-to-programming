import java.util.Locale;
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble(),
                b = scanner.nextDouble(),
                c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(discriminant)) / 2 * a;
            x2 = (-b + Math.sqrt(discriminant)) / 2 * a;

            System.out.printf("The equation has two roots %.4f and %.4f%n", x2, x1);
        } else if (discriminant == 0) {
            double x;
            x = -b / (2 * a);

            System.out.printf("The equation has one root %.4f%n", x);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}

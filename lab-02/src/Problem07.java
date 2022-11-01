import java.util.Locale;
import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double r = scanner.nextDouble();
        double l = scanner.nextDouble();

        double area = r * r * Math.PI;
        double volume = area * l;

        System.out.printf("The area is %.4f%nThe volume is %.1f", area, volume);
        scanner.close();
    }
}

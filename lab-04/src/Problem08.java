import java.util.Locale;
import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight of the package: ");
        double weight = scanner.nextDouble();

        if (weight > 0 && weight <= 1) {
            System.out.println("The shipping cost: 3.5");
        } else if (weight > 0 && weight <= 3) {
            System.out.println("The shipping cost: 5.5");
        } else if (weight > 0 && weight <= 10) {
            System.out.println("The shipping cost: 8.5");
        } else if (weight > 0 && weight <= 20) {
            System.out.println("The shipping cost: 10.5");
        } else if (weight > 20) {
            System.out.println("The package cannot be shipped.");
        } else if (weight < 0) {
            System.out.println("Invalid input.");
        }
    }
}

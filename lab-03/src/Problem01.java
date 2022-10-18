import java.util.Locale;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("some real number? ");
        double realNumber = scanner.nextDouble();

        if (realNumber < 0) {
            double number = realNumber * -1;
            System.out.printf("|%.4f| = %.4f%n", realNumber, number);
        } else {
            System.out.printf("|%.4f| = %.4f%n", realNumber, realNumber);
        }
    }
}

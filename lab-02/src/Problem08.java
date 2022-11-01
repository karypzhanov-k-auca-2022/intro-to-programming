import java.util.Locale;
import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double poundInKilograms = 0.454;

        System.out.print("Enter a number in pounds: ");
        double p = scanner.nextDouble();

        double kilograms = p * poundInKilograms;
        System.out.printf("%.1f pounds is %.3f kilograms%n", p, kilograms);
    }
}
import java.util.Locale;
import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperature in degrees Fahrenheit? ");
        int f = scanner.nextInt();

        double celsius = 5.0 / 9 * (f - 32);
        System.out.printf("The temperature in degrees Celsius is %.2f%n", celsius);
    }
}

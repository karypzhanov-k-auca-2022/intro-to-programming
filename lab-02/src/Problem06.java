import java.util.Locale;
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = scanner.nextDouble();

        double f = 9.0 / 5 * celsius + 32;
        System.out.printf("%.1f Celsius is %.1f Fahrenheit", celsius, f);
    }
}

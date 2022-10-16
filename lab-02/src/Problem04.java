import java.util.Locale;
import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double oneApp = 2.54;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Length in inches? ");
        int a = scanner.nextInt();

        double result = a * oneApp;
        System.out.printf("%d in. = %.2f cm.%n", a, result);
    }
}

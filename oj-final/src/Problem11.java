import java.util.Locale;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double number, lowestNumber = 0;

        for (int i = 0; i < N; i++) {
            number = scanner.nextDouble();
            if (number < lowestNumber) lowestNumber = number;
        }

        System.out.printf("%.2f", lowestNumber);
    }
}
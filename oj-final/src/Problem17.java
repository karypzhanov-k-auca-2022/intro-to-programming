import java.util.Locale;
import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        int count = 1;

        if (number == 1) {
            count = 0;
        } else if (number > 1) {
            while (number >= 2) {
                number /= 2;
                count += 1;
            }
        } else if (number <= 0) {
            System.out.println("Wrong number");
        } else {
            count = -1;

            while (number <= 0.5) {
                number *= 2;
                count -= 1;
            }
        }

        System.out.println(count);
    }
}
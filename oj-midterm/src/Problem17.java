import java.util.Locale;
import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int small = scanner.nextInt();
        int middle = scanner.nextInt();
        int large = scanner.nextInt();

        int happiness = small + 2 * middle + 3 * large;
        if (happiness >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}

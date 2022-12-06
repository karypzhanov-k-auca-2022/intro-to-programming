import java.util.Locale;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int bats = scanner.nextInt();
        double sumOfNumbers = 0;
        int nWalk = 0;

        for (int i = 0; i < bats; i++) {
            int number = scanner.nextInt();
            if (number < 0) continue;
            ++nWalk;
            sumOfNumbers += (double) number;
        }

        System.out.println(sumOfNumbers / nWalk);
    }
}

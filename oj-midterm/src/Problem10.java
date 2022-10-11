import java.util.Locale;
import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();

        double t = (2.0 / 9.8) * v;

        System.out.printf("%.6f%n", t);
    }
}

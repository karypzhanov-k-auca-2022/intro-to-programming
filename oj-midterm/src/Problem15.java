import java.util.Locale;
import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int q = scanner.nextInt();
        int l = scanner.nextInt();
        int t = scanner.nextInt();

        int N = 0;
        int D = 0;
        int Q = 0;
        int L = 0;
        int T = 0;

        if (n > 0 && n <= 10) {
            N = n * 5;
        }
        if (d > 0 && d <= 10) {
            D = d * 10;
        }
        if (q > 0 && q <= 10) {
            Q = q * 25;
        }
        if (l > 0 && l <= 10) {
            L = l * 100;
        }
        if (t > 0 && t <= 10) {
            T = t * 200;
        }

        int salary = N + D + Q + L + T;

        System.out.println(salary);
    }
}

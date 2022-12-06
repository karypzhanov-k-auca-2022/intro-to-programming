import java.util.Locale;

public class Problem09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double start = 1;
        double end = 901;

        System.out.println("\ni           m(i)    ");

        for (double i = start; i <= end; i += 100) {
            System.out.printf("%-12.0f", i);
            System.out.printf("%-6.4f\n", findPI(i));
        }
    }

    public static double findPI(double n) {
        double pi = 0;

        for (double i = 1; i <= n; i++) {
            pi += Math.pow(-1, i + 1) / (2 * i - 1);
        }
        pi = pi * 4;
        return pi;
    }
}
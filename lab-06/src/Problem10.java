import java.util.Locale;

public class Problem10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double start = 1;
        double end = 20;

        System.out.println("\ni          m(i)     ");

        for (double i = start; i <= end; i++) {
            System.out.printf("%-10.0f", i);
            System.out.printf("%7.4f\n", sum(i));
        }
    }

    public static double sum(double n) {
        double sum = 0;

        for (double i = 1; i <= n; i++) {
            sum = sum + i / (i + 1);
        }
        return sum;
    }
}
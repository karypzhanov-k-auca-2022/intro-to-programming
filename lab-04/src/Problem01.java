import java.util.Locale;

public class Problem01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double d = 0.1;
        double result = d + d + d + d + d + d + d + d + d + d;//10 times

        if (Math.abs(result - 1) <= 1E-9) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
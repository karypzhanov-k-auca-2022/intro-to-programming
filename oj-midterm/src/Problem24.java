import java.util.Locale;
import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(),
                b = scanner.nextInt();

        if (a < b) {
            System.out.println(a + " " + b);
        } else {
            System.out.println(b + " " + a);
        }
    }
}

import java.util.Locale;
import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int t = scanner.nextInt();

        int ordinate = Math.abs(b - d);
        int abscissa = Math.abs(a - c);
        int path = t - ordinate - abscissa;

        if (path % 2 == 0 && path >= 0) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}
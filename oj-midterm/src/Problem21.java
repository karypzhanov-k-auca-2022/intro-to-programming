import java.util.Locale;
import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(),
                b = scanner.nextInt();

        if (a > b) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

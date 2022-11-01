import java.util.Locale;
import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (a < d && c < b) {
            System.out.println("YES");
        } else System.out.println("NO");
    }

}


import java.util.Locale;
import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a % b == 0 ? "yes" : "no");
    }
}
//        if (a % b == 0) {
//            System.out.print("yes");
//        } else {
//            System.out.print("no");
//        }
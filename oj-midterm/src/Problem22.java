import java.util.Locale;
import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int stone = scanner.nextInt();

        if (stone % 2 == 1) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
    }
}

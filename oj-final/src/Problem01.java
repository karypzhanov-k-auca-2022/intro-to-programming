import java.util.Locale;
import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String greetings = scanner.next();

        for (int i = 0; i < greetings.length(); i++) {
            char symbol = greetings.charAt(i);

            if (symbol == 'e') {
                System.out.print(symbol);
            }
            System.out.print(symbol);
        }
    }
}

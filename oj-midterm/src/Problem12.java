import java.util.Locale;
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int digit1 = number / 10;
        int digit2 = number % 10;

        String newNumber = digit2 + "" + digit1;
        System.out.println(newNumber);

    }
}

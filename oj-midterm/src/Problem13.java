import java.util.Locale;
import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int inverseNum1 = (number1 % 10 * 100) + (number1 / 10 % 10 * 10) + (number1 / 100);
        int inverseNum2 = (number2 % 10 * 100) + (number2 / 10 % 10 * 10) + (number2 / 100);

        int bigNumber = Math.max(inverseNum1, inverseNum2);
        System.out.println(bigNumber);
    }
}
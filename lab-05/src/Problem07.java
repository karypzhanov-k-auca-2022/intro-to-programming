import java.util.Locale;
import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("The number is ");
        int number = scanner.nextInt();
        int result = 0;

        for (int i = 0; i <= number; i++) {
            result += i;
        }
        System.out.println("The sum is " + result);
    }
}
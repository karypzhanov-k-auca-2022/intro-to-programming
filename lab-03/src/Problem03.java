import java.util.Locale;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("1st number? ");
        int num1 = scanner.nextInt();

        System.out.print("2nd number? ");
        int num2 = scanner.nextInt();

        System.out.print("3rd number? ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.printf("The value %d is the greatest one.%n", num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.printf("The value %d is the greatest one.%n", num2);
        } else {
            System.out.printf("The value %d is the greatest one.%n", num3);
        }
    }
}

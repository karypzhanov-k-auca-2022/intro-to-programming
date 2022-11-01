import java.util.Locale;
import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three integer numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 < number2 && number1 < number3) {
            if (number2 < number3) {
                System.out.println(number1);
                System.out.println(number2);
                System.out.println(number3);
            } else {
                System.out.println(number1);
                System.out.println(number3);
                System.out.println(number2);
            }
        } else if (number2 < number1 && number2 < number3) {
            if (number1 < number3) {
                System.out.println(number2);
                System.out.println(number1);
                System.out.println(number3);
            } else {
                System.out.println(number2);
                System.out.println(number3);
                System.out.println(number1);
            }
        } else if (number3 < number1 && number3 < number2) {
            if (number1 < number2) {
                System.out.println(number3);
                System.out.println(number1);
                System.out.println(number2);
            } else {
                System.out.println(number3);
                System.out.println(number2);
                System.out.println(number1);
            }
        }
    }
}

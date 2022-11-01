import java.util.Locale;
import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("month? ");
        int monthNumber = scanner.nextInt();

        if (monthNumber == 1 || monthNumber == 2 || monthNumber == 12) {
            System.out.println("winter");
        } else if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            System.out.println("spring");
        } else if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            System.out.println("summer");
        } else if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            System.out.println("fall");
        } else System.out.println("Invalid number");
    }
}


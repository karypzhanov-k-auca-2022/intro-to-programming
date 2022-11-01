import java.util.Locale;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("month? ");
        int monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
                break;
            case 1:
            case 2:
            case 12:
                System.out.println("winter");
                break;
            default:
                System.out.println("Invalid month number");
                break;
        }
    }
}

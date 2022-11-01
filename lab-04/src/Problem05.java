import java.util.Locale;
import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Year? ");
        int year = scanner.nextInt();
        System.out.print("Month? ");
        int month = scanner.nextInt();
        int daysInMonth;

        switch (month) {
            case 2:
                if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                    daysInMonth = 29;
                    System.out.println("Number of days: " + daysInMonth);
                } else {
                    daysInMonth = 28;
                    System.out.println("Number of days: " + daysInMonth);
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                System.out.println("Number of days: " + daysInMonth);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                System.out.println("Number of days: " + daysInMonth);
                break;
        }
    }
}

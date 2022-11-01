import java.util.Locale;
import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();

        int minutesInYear = 60 * 24 * 365;
        int minutesInDay = 60 * 24;

        int years = minutes / minutesInYear;
        int days = (minutes % minutesInYear) / minutesInDay;
        System.out.printf("%d minutes is approximately %d years and %d days", minutes, years, days);
    }
}

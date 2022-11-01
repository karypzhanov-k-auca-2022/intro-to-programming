import java.util.Locale;
import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        int minutesInHour = 60;
        int clockMinutes = 45;

        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt(),
                minute = scanner.nextInt();

        minute -= clockMinutes;

        if (minute < 0) {
            hour -= 1;
            minute += minutesInHour;
        }
        if (hour < 0) {
            hour = 23;
        }
        System.out.println(hour + " " + minute);
    }
}

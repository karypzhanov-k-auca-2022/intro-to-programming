import java.util.Locale;
import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int today = scanner.nextInt();
        String nameDayToday = null;

        switch (today) {
            case 0:
                nameDayToday = "Sunday";
                break;
            case 1:
                nameDayToday = "Monday";
                break;
            case 2:
                nameDayToday = "Tuesday";
                break;
            case 3:
                nameDayToday = "Wednesday";
                break;
            case 4:
                nameDayToday = "Thursday";
                break;
            case 5:
                nameDayToday = "Friday";
                break;
            case 6:
                nameDayToday = "Saturday";
                break;
        }

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDay = scanner.nextInt();
        String dayNameFuture = null;

        int futureDay = (today + elapsedDay) % 7;

        switch (futureDay) {
            case 0:
                dayNameFuture = "Sunday";
                break;
            case 1:
                dayNameFuture = "Monday";
                break;
            case 2:
                dayNameFuture = "Tuesday";
                break;
            case 3:
                dayNameFuture = "Wednesday";
                break;
            case 4:
                dayNameFuture = "Thursday";
                break;
            case 5:
                dayNameFuture = "Friday";
                break;
            case 6:
                dayNameFuture = "Saturday";
                break;
        }

        System.out.printf("Today is %s and the future day is %s%n", nameDayToday, dayNameFuture);
    }
}

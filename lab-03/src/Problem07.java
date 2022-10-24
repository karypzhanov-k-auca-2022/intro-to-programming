import java.util.Locale;
import java.util.Scanner;


public class Problem07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int today = scanner.nextInt();
        String nameDayToday = "";

        if (today == 0) {
            nameDayToday = "Sunday";
        } else if (today == 1) {
            nameDayToday = "Monday";
        } else if (today == 2) {
            nameDayToday = "Tuesday";
        } else if (today == 3) {
            nameDayToday = "Wednesday";
        } else if (today == 4) {
            nameDayToday = "Thursday";
        } else if (today == 5) {
            nameDayToday = "Friday";
        } else if (today == 6) {
            nameDayToday = "Saturday";
        }

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDay = scanner.nextInt();
        String dayNameFuture = "";
        int futureDay = (today + elapsedDay) % 7;

        if (futureDay == 0) {
            dayNameFuture = "Sunday";
        } else if (futureDay == 1) {
            dayNameFuture = "Monday";
        } else if (futureDay == 2) {
            dayNameFuture = "Tuesday";
        } else if (futureDay == 3) {
            dayNameFuture = "Wednesday";
        } else if (futureDay == 4) {
            dayNameFuture = "Thursday";
        } else if (futureDay == 5) {
            dayNameFuture = "Friday";
        } else if (futureDay == 6) {
            dayNameFuture = "Saturday";
        }
        System.out.printf("Today is %s and the future day is %s%n", nameDayToday, dayNameFuture);
    }
}

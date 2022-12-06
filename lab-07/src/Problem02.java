import java.util.Scanner;

public class Problem02 {

    public static Scanner scanner;
    public static int[] monthNumbers;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        monthNumbers = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        while (true) {
            int month = readInt("Month: ", "Incorrect month", 1, 100000);
            int year = readInt("Year: ", "Incorrect year", 1, 100000);

            System.out.println("Days: " + getDaysOfMonth(year, month));
        }
    }

    public static int getDaysOfMonth(int year, int month) {
        if (isLeapYear(year) && month == 2) {
            return monthNumbers[month - 1] + 1;
        } else {
            return monthNumbers[month - 1];
        }
    }

    public static int readInt(String prompt, String errorMessage, int minValue, int maxValue) {
        System.out.print(prompt);

        if (!scanner.hasNext()) {
            System.exit(0);
        }

        int value = scanner.nextInt();
        if (value > maxValue || value < minValue) {
            System.out.println(errorMessage);
            System.exit(1);
        }
        return value;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

}

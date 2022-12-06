import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int days = 0;
        int year = scanner.nextInt();
        System.out.print("Month: ");
        int month = scanner.nextInt();
        boolean alo = isLeap(year);
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            default:
                if (alo) {
                    days = 29;
                } else days = 28;
        }
        System.out.println("Number of days: " + days);
    }

    public static boolean isLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysOfMonth(int year, int month) {
        return year;
    }
}


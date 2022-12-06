import java.util.Scanner;

public class Problem33 {
    public static boolean isLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getNumberOfDays(int month, int days) {
        int numberOfDays = 0;

        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1, 3, 5, 7, 8, 10, 12:
                    numberOfDays += 31;
                    break;
                case 4, 6, 9, 11:
                    numberOfDays += 30;
                    break;
                default:
                    numberOfDays += 28;
            }
        }
        numberOfDays += days;
        return numberOfDays;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int Y, M, D;

        for (int i = 0; i < T; i++) {
            Y = scanner.nextInt();
            M = scanner.nextInt();
            D = scanner.nextInt();
            if (isLeap(Y) && M >= 3) {
                System.out.println(getNumberOfDays(M, D) + 1);
            } else System.out.println(getNumberOfDays(M, D));
        }
    }
}

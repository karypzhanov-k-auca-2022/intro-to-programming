import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year, month, day;
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            year = scanner.nextInt();
            month = scanner.nextInt();
            day = scanner.nextInt();
            if (2007 - year > 18) {
                System.out.println("Yes");
            } else if (2007 - year < 18) {
                System.out.println("No");
            } else if (2 - month > 0) {
                System.out.println("Yes");
            } else if (2 - month < 0) {
                System.out.println("No");
            } else if (27 - day >= 0) {
                System.out.println("Yes");
            } else System.out.println("No");
        }
    }
}
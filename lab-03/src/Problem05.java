import java.util.Locale;
import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of points? ");
        int points = scanner.nextInt();

        if (points < 0 || points > 100) {
            System.out.printf("%d is not in the permitted range.%n", points);
        } else if (90 <= points) {
            System.out.println("Grade: A");
        } else if (80 <= points) {
            System.out.println("Grade: B");
        } else if (70 <= points) {
            System.out.println("Grade: C");
        } else if (60 <= points) {
            System.out.println("Grade: D");
        } else if ( 0 <= points) {
            System.out.println("Grade: F");
        }
    }
}

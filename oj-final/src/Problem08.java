import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        for (int i = X - 1; i < Y + 1; i++) {
            if ((i - X) % (4 * 5 * 3) == 0) {
                System.out.println("All positions change in year " + i);
            }
        }
    }
}
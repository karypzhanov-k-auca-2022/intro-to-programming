import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r1 = scanner.nextInt();
        int s = scanner.nextInt();
        int r2 = 2 * s - r1;
        System.out.println(r2);
    }
}

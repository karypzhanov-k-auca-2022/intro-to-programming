import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int h = scanner.nextInt();
        double s = 1.0 / 2 * (a * h);
        System.out.println(s);
    }
}

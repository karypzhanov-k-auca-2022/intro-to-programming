import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int h = scanner.nextInt();
        double v = Math.PI * (r * r) * h / 3;
        System.out.printf("%.2f", v);
    }
}

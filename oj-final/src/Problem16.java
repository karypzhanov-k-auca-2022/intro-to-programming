import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int N;
        for (int i = 0; i < T; i++) {
            N = scanner.nextInt();
            if (N > 315 || N <= 45) {
                System.out.println("N");
            }
            if (N > 45 && N <= 135) {
                System.out.println("E");
            }
            if (N > 135 && N <= 225) {
                System.out.println("S");
            }
            if (N > 225 && N <= 315) {
                System.out.println("W");
            }
        }
    }
}
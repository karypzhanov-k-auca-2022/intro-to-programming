import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int matchLength;

        double length = Math.sqrt(W * W + H * H);

        for (int i = 0; i < N; i++) {
            matchLength = scanner.nextInt();

            if (matchLength <= length) System.out.println("DA");
            else System.out.println("NE");
        }
    }
}
import java.util.Scanner;

public class Problem50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        if (N >= M) {
            System.out.println(M - 1);
        } else System.out.println(N);
    }
}
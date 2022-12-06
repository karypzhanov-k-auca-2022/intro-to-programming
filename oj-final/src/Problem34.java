import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int N;

        for (int i = 0; i < T; i++) {
            N = scanner.nextInt();
            if (isPrime(N)) {
                System.out.println("1");
            } else System.out.println("0");
        }
    }

    public static boolean isPrime(int n) {
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                count++;
            }

            if (count > 2) return false;
        }
        if (count == 2) return true;
        else return false;
    }
}

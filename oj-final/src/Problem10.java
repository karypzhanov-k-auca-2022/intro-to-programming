import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int k = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < k+1; i++) {
            sum += N;
            N *= 10;
        }

        System.out.println(sum);
    }
}
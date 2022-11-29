import java.util.Scanner;

public class Problem25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K, someNumber;
        int totalWays = 0;
        for (int i = 0; i < N; i++) {
            K = scanner.nextInt();
            for (int j = 0; j < K; j++) {
                someNumber = scanner.nextInt();
                totalWays += someNumber-1;
            }
            System.out.println(totalWays+1);
            totalWays = 0;
        }
    }
}

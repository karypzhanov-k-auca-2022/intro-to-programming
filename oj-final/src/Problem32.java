import java.util.Scanner;

public class Problem32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int N, counter = 0;

        for (int i = 0; i < T; i++) {
            N = Math.abs(scanner.nextInt());

            if (N == 0) {
                counter = 1;
            } else while (N != 0) {
                N /= 10;
                counter += 1;
            }

            System.out.println(counter);
            counter = 0;
        }
    }
}

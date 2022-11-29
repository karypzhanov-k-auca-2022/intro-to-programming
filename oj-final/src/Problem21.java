import java.util.Locale;
import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        int N = scanner.nextInt();
        int R = scanner.nextInt();
        int M = 0;
        int infected = 0;

        while (infected <= P) {
            infected += N * Math.pow(R, M);
            M++;
        }

        System.out.println(M - 1);
    }
}
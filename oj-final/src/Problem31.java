import java.util.Scanner;

public class Problem31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int firstDigit, secondDigit, thirdDigit;

        for (int i = M; i < N; i++) {
            firstDigit = i / 100;
            secondDigit = (i % 100) / 10;
            thirdDigit = i % 10;

            if (Math.pow(firstDigit, 3) + Math.pow(secondDigit, 3) + Math.pow(thirdDigit, 3) == i) {
                System.out.println(i);
            }
        }
    }
}

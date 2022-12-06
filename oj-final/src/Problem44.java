import java.util.Scanner;

public class Problem44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] distances = new int[5];
        int answerForAnyCase = 0;
        int res = 0;
        distances[0] = 0;

        for (int i = 1; i < 5; i++) {
            distances[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j >= i) {
                    for (int k = i; k <= j; k++) {
                        res += distances[k];
                    }
                } else for (int k = i; k >= j; k--) {
                    res += distances[k];
                }

                System.out.print(res + " ");
                res = 0;
            }

            System.out.println("\n");
            if (i <= 3) {
                distances[i] = distances[i + 1];
                distances[i + 1] = 0;
            }
        }
    }
}
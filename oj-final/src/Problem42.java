import java.util.Scanner;

public class Problem42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ranges = {0, 10000, 20000, 30000, 40000, 50000};
        int[] occurrences = {0, 0, 0, 0, 0, 0};

        while (n != -1) {
            for (int i = 5; i > -1; i--) {
                if (n >= ranges[i]) {
                    occurrences[i] += 1;
                    i = -2;
                }
            }
            n = scanner.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(occurrences[i] + " ");
        }
    }
}

import java.util.Scanner;

public class Problem40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String[] adjectives = new String[n];
        String[] nouns = new String[m];

        for (int i = 0; i < n; i++) {
            adjectives[i] = scanner.next();
        }

        for (int i = 0; i < m; i++) {
            nouns[i] = scanner.next();
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.println(adjectives[j] + " as " + nouns[i]);
            }
        }
    }
}

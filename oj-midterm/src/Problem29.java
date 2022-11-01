import java.util.Scanner;

public class Problem29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bowl1 = scanner.nextInt();
        int bowl2 = scanner.nextInt();
        int bowl3 = scanner.nextInt();

        int maxBowl = Math.max(bowl1, Math.max(bowl2, bowl3));
        int minBowl = Math.min(bowl1, Math.min(bowl2, bowl3));

        System.out.println(bowl1 + bowl2 + bowl3 - (maxBowl + minBowl));
    }
}

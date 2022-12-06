import java.util.Scanner;

public class Problem30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        String stars = "*";
        int starsCounter = 1;
        int count = 1;
        String twoStars = "**";

        for (int i = 0; i < H; i++) {
            System.out.print(stars);

            for (int j = 0; j < 2 * (H - starsCounter); j++) {
                System.out.print(" ");
            }

            System.out.print(stars);
            System.out.print("\n");

            if (i < (H - 1) / 2) {
                stars += twoStars;
                starsCounter += 2;
            }

            if (i >= (H - 1) / 2) {
                stars = "*";

                for (int j = 0; j < i - count; j++) {
                    stars += "**";
                }

                starsCounter -= 2;
                count += 2;
            }
        }
    }
}

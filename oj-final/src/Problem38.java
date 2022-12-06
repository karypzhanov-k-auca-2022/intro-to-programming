import java.util.Scanner;

public class Problem38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] figures = new int[6];

        for (int i = 0; i < 6; i++) {
            figures[i] = scanner.nextInt();
        }

        figures[0] = 1 - figures[0];
        figures[1] = 1 - figures[1];
        figures[2] = 2 - figures[2];
        figures[3] = 2 - figures[3];
        figures[4] = 2 - figures[4];
        figures[5] = 8 - figures[5];

        for (int i = 0; i < 6; i++) {
            System.out.println(figures[i] + " ");
        }
    }
}

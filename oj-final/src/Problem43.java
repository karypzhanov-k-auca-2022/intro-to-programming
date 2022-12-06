import java.util.Scanner;

public class Problem43 {
    public static void main(String[] args) {
        int[] square = new int[16];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 16; i++) {
            square[i] = scanner.nextInt();
        }

        int sum = square[0] + square[1] + square[2] + square[3];
        int counter = 0;

        for (int i = 0; i <= 8; i += 4) {
            if (square[i] + square[i + 1] + square[i + 2] + square[i + 3] != sum) {
                counter += 1;
            }
        }

        for (int i = 0; i < 4; i += 1) {
            if (square[i] + square[i + 4] + square[i + 8] + square[i + 12] != sum) {
                counter += 1;
            }
        }

        if (counter == 0) {
            System.out.println("magic");
        } else System.out.println("not magic");
    }
}

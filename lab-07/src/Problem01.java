import java.util.Random;
import java.util.Scanner;

public class Problem01 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
        int numberOfTosses = scanner.nextInt();

        int[] tosses = new int[13];

        for (int i = 0; i < numberOfTosses; i++) {
            int diceOne = random.nextInt(1, 7);
            int diceTwo = random.nextInt(1, 7);
            tosses[diceOne + diceTwo]++;
        }

        for (int i = 2; i < tosses.length; i++) {
            System.out.printf("%d: %d%n", i, tosses[i]);
        }
    }

}

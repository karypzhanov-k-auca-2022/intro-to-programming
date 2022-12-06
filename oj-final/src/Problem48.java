import java.util.Scanner;

public class Problem48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersOfNumbers = new int[101];

        int maxNumberOfNumbers = 0;

        int number = scanner.nextInt();
        while (number != -1) {
            numbersOfNumbers[number]++;
            number = scanner.nextInt();
        }

        for (int numbersOfNumber : numbersOfNumbers) {
            if (numbersOfNumber > maxNumberOfNumbers) {
                maxNumberOfNumbers = numbersOfNumber;
            }
        }

        for (int i = 0; i < numbersOfNumbers.length; i++) {
            if (numbersOfNumbers[i] == maxNumberOfNumbers) {
                System.out.println(i);
            }
        }
    }
}

import java.util.Scanner;

public class Problem10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] uniqueNumbers = eliminateDuplicates(numbers);
        System.out.print("The distinct numbers are:");
        for (int i = 0; i < uniqueNumbers.length; i++) {
            System.out.print(" " + uniqueNumbers[i]);
        }
        System.out.println();
    }

    public static int[] eliminateDuplicates(int[] list) {
        int[] rawListWithoutDuplicates = new int[list.length];

        int k = 0;
        for (int i = 0; i < list.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                isUnique = isUnique && list[i] != list[j];
            }

            if (isUnique) {
                rawListWithoutDuplicates[k] = list[i];
                k++;
            }
        }

        int[] listWithoutDuplicates = new int[k];
        for (int i = 0; i < listWithoutDuplicates.length; i++) {
            listWithoutDuplicates[i] = rawListWithoutDuplicates[i];
        }

        return listWithoutDuplicates;
    }

}

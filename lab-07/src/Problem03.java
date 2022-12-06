import java.util.Scanner;

public class Problem03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N: ");
        int numbersQuantity = scanner.nextInt();
        int[] numbers = new int[numbersQuantity];

        for (int i = 0; i < numbersQuantity; i++) {
            System.out.printf("Enter %d element: ", i);
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Before reversing:");
        for (int i = 0; i < numbersQuantity; i++) {
            System.out.print(numbers[i]);
            if (i < numbersQuantity - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
        System.out.println("After reversing:");
        for (int i = numbersQuantity - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }

        System.out.println();
    }

}

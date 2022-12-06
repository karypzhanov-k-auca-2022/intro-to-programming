import java.util.Scanner;

public class Problem07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[101];

        System.out.print("Enter the integers between 1 and 100: ");
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            numbers[number]++;
        }

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                continue;
            }
            System.out.printf("%d occurs %d time" + (numbers[i] == 1 ? "" : "s"), i, numbers[i]);
            System.out.println();
        }
    }

}

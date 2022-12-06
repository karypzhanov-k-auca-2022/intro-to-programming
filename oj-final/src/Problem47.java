import java.util.Scanner;

public class Problem47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        int index = indexOfMax(numbers);
        double temp = numbers[index];
        numbers[index] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%.2f%n", numbers[i]);
        }
    }

    public static int indexOfMax(double[] a) {
        double maxNumber = 0;
        int maxNumberIndex = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > maxNumber) {
                maxNumber = a[i];
                maxNumberIndex = i;
            }
        }

        return maxNumberIndex;
    }
}

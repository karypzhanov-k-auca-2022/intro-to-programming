import java.util.Locale;
import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }
        int smallestIndex = indexOfSmallestElement(numbers);
        System.out.println(smallestIndex + "-index of smallest number");

    }

    public static int indexOfSmallestElement(double[] array) {
        double smallest = array[0];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
}



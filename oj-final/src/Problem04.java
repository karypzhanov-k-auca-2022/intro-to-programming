import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTestCases = scanner.nextInt();

        for (int i = 0; i < numberOfTestCases; i++) {
            int dataSetNumber = scanner.nextInt();
            int numberOfDays = scanner.nextInt();

            System.out.println(dataSetNumber + " " + ((numberOfDays + 1) * numberOfDays / 2 + numberOfDays));
        }
    }
}

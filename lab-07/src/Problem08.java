import java.util.Scanner;

public class Problem08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] scores = new double[100];

        double sum = 0;
        int i = 0;

        System.out.print("Scores: ");
        while (true) {
            double number = scanner.nextDouble();
            if (number < 0) {
                break;
            }
            sum += number;
            scores[i] = number;
            i++;
        }

        double average = sum / i;
        int aboveAverage = 0;

        for (int j = 0; j < i; j++) {
            if (scores[j] >= average) {
                aboveAverage++;
            }
        }

        System.out.println("Above average: " + aboveAverage);
        System.out.println("Below average: " + (i - aboveAverage));
    }

}

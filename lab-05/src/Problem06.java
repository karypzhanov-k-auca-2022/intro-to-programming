import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;

        do {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            count++;
            sum += number;
        } while (true);

        if (sum != 0) {
            System.out.println("The arithmetic mean is " + sum / 1.0 / count);
        } else {
            System.out.println("Nothing to calculate");
        }
    }
}

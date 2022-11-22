import java.util.*;

public class Problem01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int numbers;
        int sum = 0;

        do {
            System.out.print("Enter an integer (the input ends if it is 0): ");
            numbers = scanner.nextInt();
            sum += numbers;
        } while (numbers != 0);

        System.out.println("The sum is " + sum);
    }
}

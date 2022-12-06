import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Integer? ");
        int digits = scanner.nextInt();

        int sum = 0;

        while (digits != 0) {
            sum += digits % 10;
            digits /= 10;
        }

        System.out.println("The sum of all digits is " + sum);
    }
}

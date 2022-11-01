import java.util.Scanner;

public class Problem35 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int limit = scanner.nextInt();
        int speed = scanner.nextInt();

        if (speed > limit) {
            int speedOverLimit = speed - limit;
            if (speedOverLimit >= 1 && speedOverLimit <= 20) {
                System.out.println("You are speeding and your fine is $100.");
            } else if (speedOverLimit >= 21 && speedOverLimit <= 30) {
                System.out.println("You are speeding and your fine is $270.");
            } else {
                System.out.println("You are speeding and your fine is $500.");
            }
        } else {
            System.out.println("Congratulations, you are within the speed limit!");
        }
    }

}

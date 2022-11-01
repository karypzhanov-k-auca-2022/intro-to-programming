import java.util.Scanner;

public class Problem49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pepperoni = scanner.nextInt();
        int cheese = scanner.nextInt();
        int vegetarian = scanner.nextInt();

        int pizzaQuantity = 0;

        if (pepperoni / 3.0 > (pepperoni / 3) / 1.0) {
            pizzaQuantity += pepperoni / 3 + 1;
        } else {
            pizzaQuantity += pepperoni / 3;
        }

        if (cheese / 3.0 > (cheese / 3) / 1.0) {
            pizzaQuantity += cheese / 3 + 1;
        } else {
            pizzaQuantity += cheese / 3;
        }

        if (vegetarian / 3.0 > (vegetarian / 3) / 1.0) {
            pizzaQuantity += vegetarian / 3 + 1;
        } else {
            pizzaQuantity += vegetarian / 3;
        }

        System.out.println(pizzaQuantity);
    }
}

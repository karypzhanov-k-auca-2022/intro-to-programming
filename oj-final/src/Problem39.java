import java.util.Scanner;

public class Problem39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] burgers = {461, 431, 420, 0};
        int[] drinks = {130, 160, 118, 0};
        int[] sideOrders = {100, 57, 70, 0};
        int[] dessert = {167, 266, 75, 0};

        int calories = burgers[scanner.nextInt() - 1] +
                sideOrders[scanner.nextInt() - 1] +
                drinks[scanner.nextInt() - 1] +
                dessert[scanner.nextInt() - 1];

        System.out.println("Your total Calorie count is " + calories + ".");
    }
}

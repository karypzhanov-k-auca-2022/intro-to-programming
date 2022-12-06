import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dice1, dice2;
        dice1 = input.nextInt();
        dice2 = input.nextInt();
        int counter = 0;

        for (int i = 1; i <= dice1; i++) {
            for (int j = 1; j <= dice2; j++) {
                if (i + j == 10) {
                    counter++;
                }
            }
        }

        if (counter == 1) {
            System.out.println("There is 1 way to get the sum 10.");
        } else {
            System.out.println("There are " + counter + " ways to get the sum 10.");
        }
    }
}
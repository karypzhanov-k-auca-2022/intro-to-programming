import java.util.Scanner;

public class Problem41 {
    public static void main(String[] args) {
        int[] cases = {100, 500, 1000, 5000, 10000, 25000, 50000, 100000, 500000, 1000000};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num;

        for (int i = 0; i < n; i++) {
            num = scanner.nextInt();
            cases[num - 1] = 0;
        }

        double dealersOffer = scanner.nextDouble();
        int counter = 0;
        double moneyThing = 0;

        for (int i = 0; i < 10; i++) {
            if (cases[i] == 0) {
                counter--;
            }

            moneyThing += cases[i];
            counter++;
        }

        if (dealersOffer > moneyThing / counter) {
            System.out.println("deal");
        } else System.out.println("no deal");
    }
}

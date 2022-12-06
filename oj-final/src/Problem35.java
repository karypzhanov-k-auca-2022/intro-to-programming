import java.util.Scanner;

public class Problem35 {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int casperBestFish = findTheBestFish(scanner.nextInt());
        int natalieBestFish = findTheBestFish(scanner.nextInt());

        if (natalieBestFish > casperBestFish) {
            System.out.println("Natalie");
        } else if (casperBestFish > natalieBestFish) {
            System.out.println("Casper");
        } else {
            System.out.println("Tie");
        }
    }

    public static int findTheBestFish(int n) {
        int theBestFish = 0;

        for (int i = 0; i < n; i++) {
            int fish = scanner.nextInt() * scanner.nextInt();

            if (fish > theBestFish) {
                theBestFish = fish;
            }
        }

        return theBestFish;
    }

}

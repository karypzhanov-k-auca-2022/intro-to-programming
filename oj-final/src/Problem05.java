import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int weightRating = scanner.nextInt();
        int weightOfTruck = scanner.nextInt();
        int numberOfItems = scanner.nextInt();

        int weightOfItems = 0;

        for (int i = 0; i < numberOfItems; i++) {
            weightOfItems += scanner.nextInt();
        }

        System.out.println((int) ((weightRating - weightOfTruck) * 0.9 - weightOfItems));
    }
}

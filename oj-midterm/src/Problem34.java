import java.util.Scanner;

public class Problem34 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPeaces = scanner.nextInt();
        int numberOfPeople = scanner.nextInt();

        if (numberOfPeople > numberOfPeaces) {
            int leftOver = numberOfPeople - numberOfPeaces;
            if (leftOver == 1) {
                System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
            } else {
                System.out.printf("Dr. Chaz will have %d pieces of chicken left over!%n", leftOver);
            }
        } else {
            int needsMore = numberOfPeaces - numberOfPeople;
            if (needsMore == 1) {
                System.out.println("Dr. Chaz needs 1 more piece of chicken!");
            } else {
                System.out.printf("Dr. Chaz needs %d more pieces of chicken!%n", needsMore);
            }
        }
    }

}

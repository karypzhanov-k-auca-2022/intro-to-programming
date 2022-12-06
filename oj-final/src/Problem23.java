import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int massageCounter = scanner.nextInt();
        int numberToRepeat;
        String massage;

        for (int i = 0; i < massageCounter; i++) {
            numberToRepeat = scanner.nextInt();
            massage = scanner.next();

            for (int j = 0; j < numberToRepeat; j++) {
                System.out.print(massage);
            }

            System.out.println("\n");
        }
    }
}

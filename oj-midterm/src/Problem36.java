import java.util.Scanner;

public class Problem36 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfAntennae = scanner.nextInt();
        int numberOfEyes = scanner.nextInt();

        if (numberOfAntennae >= 3 && numberOfEyes <= 4) {
            System.out.println("TroyMartian");
        }
        if (numberOfAntennae <= 6 && numberOfEyes >= 2) {
            System.out.println("VladSaturnian");
        }
        if (numberOfAntennae <= 2 && numberOfEyes <= 3) {
            System.out.println("GraemeMercurian");
        }
    }
}

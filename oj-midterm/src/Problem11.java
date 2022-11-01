import java.util.Locale;
import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int articles = scanner.nextInt(),
                impactFactors = scanner.nextInt();

        int neededScientists = articles * impactFactors - articles + 1;
        System.out.println(neededScientists);
    }
}

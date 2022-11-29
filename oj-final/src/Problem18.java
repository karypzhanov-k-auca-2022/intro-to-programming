import java.util.Locale;
import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double numberOfTiles = scanner.nextDouble();
        int squareLength = 0;

        while (numberOfTiles >= (squareLength + 1) * (squareLength + 1)) {
            squareLength += 1;
        }

        System.out.println("The largest square has side length " + squareLength + ".");
    }
}
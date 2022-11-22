import java.util.Locale;

public class Problem03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        System.out.println("Multiplication table");
        System.out.print("    ");
        for (int j = 1; j <= 9; ++j)
            System.out.print("   " + j);

        System.out.printf("%n------------------------------------------%n");

        for (int i = 1; i <= 9; ++i) {
            System.out.print(i + " | ");

            for (int j = 1; j <= 9; ++j) {
                System.out.printf("%4d", i * j);
            }

            System.out.println();
        }
    }
}
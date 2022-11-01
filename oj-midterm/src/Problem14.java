import java.util.Locale;
import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double h = scanner.nextInt();
        double v = scanner.nextInt();

        double radians = v * Math.PI / 180;
        int length = (int) Math.ceil(h / Math.sin(radians));

        System.out.println(length);


    }
}

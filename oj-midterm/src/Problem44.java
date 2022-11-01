import java.util.Scanner;

public class Problem44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a == 0 && b == 0) {
            System.out.println("indeterminate");
        } else if  (a == 0) {
            System.out.println("undefined");
        } else {
            System.out.printf("%.2f", -b / a);
        }
    }
}

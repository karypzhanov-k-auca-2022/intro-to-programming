import java.util.Scanner;

public class Problem38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight = scanner.nextDouble();
        double height = scanner.nextDouble();

        double bodyMassIndex = weight / (height * height);

        if (bodyMassIndex < 18.5) {
            System.out.println("Underweight");
        } else if (bodyMassIndex > 25) {
            System.out.println("Overweight");
        } else {
            System.out.println("Normal weight");
        }
    }
}

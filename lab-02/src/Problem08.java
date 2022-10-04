import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        double poundInKilograms = 0.454;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double p = scanner.nextDouble();
        double kilograms = p * poundInKilograms;
        System.out.printf("%.1f pounds is %.3f kilograms ", p, kilograms);
    }
}

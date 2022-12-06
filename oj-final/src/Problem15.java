import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int hoursWorked;
        boolean isMoreThan40;
        double payRate, moneyValue;
        String taxCategory, donations;

        for (int i = 0; i < T; i++) {
            payRate = scanner.nextDouble();
            hoursWorked = scanner.nextInt();
            taxCategory = scanner.next();
            donations = scanner.next();
            isMoreThan40 = hoursWorked > 40;
            if (isMoreThan40) {
                moneyValue = 40 * payRate + (hoursWorked - 40) * 2 * payRate;
            } else moneyValue = hoursWorked * payRate;

            switch (taxCategory) {
                case "E":
                    moneyValue *= 0.65;
                    break;
                case "D":
                    moneyValue *= 0.71;
                    break;
                case "C":
                    moneyValue *= 0.8;
                    break;
                case "B":
                    moneyValue *= 0.9;
                    break;
                default:
                    moneyValue *= 1;
            }

            switch (donations) {
                case "y":
                    moneyValue -= 10;
                    break;
                default:
                    moneyValue = moneyValue;
            }

            System.out.printf("%.2f\n", moneyValue);
        }
    }
}

import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        if (num1 == 9 && num2 == num3 && num4 == 8) {
            System.out.println("ignore");
        } else if (num1 == 8 && num2 == num3 && num4 == 9) {
            System.out.println("ignore");
        } else if (num1 == 9 && num2 == num3 && num4 == 9) {
            System.out.println("ignore");
        } else if (num1 == 8 && num2 == num3 && num4 == 8) {
            System.out.println("ignore");
        } else System.out.println("answer");
    }
}


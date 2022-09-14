import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1st int? ");
        int firstNumber = scanner.nextInt();
        System.out.print("2nd int? ");
        int secondNumber = scanner.nextInt();
        int plusFirstAndSecond = firstNumber + secondNumber;
        int minesFirstAndSecond = firstNumber - secondNumber;
        int multiplyFirstAndSecond = firstNumber * secondNumber;
        int divideFirstAndSecond = firstNumber / secondNumber;
        int residueOfFirstAndSecond = firstNumber % secondNumber;

        System.out.println(firstNumber + " + " + secondNumber + " = " + plusFirstAndSecond);
        System.out.println(firstNumber + " + " + secondNumber + " = " + minesFirstAndSecond);
        System.out.println(firstNumber + " + " + secondNumber + " = " + multiplyFirstAndSecond);
        System.out.println(firstNumber + " + " + secondNumber + " = " + divideFirstAndSecond);
        System.out.println(firstNumber + " + " + secondNumber + " = " + residueOfFirstAndSecond);
    }
}

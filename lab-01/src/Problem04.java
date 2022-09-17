import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1st int? ");
        int firstNumber = scanner.nextInt();
        System.out.print("2nd int? ");
        int secondNumber = scanner.nextInt();
        int plus = firstNumber + secondNumber;
        int mines = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        int divide = firstNumber / secondNumber;
        int residue = firstNumber % secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + plus);
        System.out.println(firstNumber + " - " + secondNumber + " = " + mines);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiply);
        System.out.println(firstNumber + " / " + secondNumber + " = " + divide);
        System.out.println(firstNumber + " % " + secondNumber + " = " + residue);
    }
}

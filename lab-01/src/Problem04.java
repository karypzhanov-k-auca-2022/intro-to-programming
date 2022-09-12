public class Problem04 {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 2;
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

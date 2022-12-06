import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("An integer? ");
        int number = scanner.nextInt();

        System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + "a palindrome");
    }

    static int reverse(int number) {
        String reversedNumber = "";
        String n = number + "";

        for (int i = n.length() - 1; i >= 0; i--) {
            reversedNumber = reversedNumber + n.charAt(i);
        }
        return Integer.parseInt(reversedNumber);
    }

    static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
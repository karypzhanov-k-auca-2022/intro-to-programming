import java.util.Locale;
import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = scanner.next();

        int low = 0;
        int high = word.length() - 1;
        boolean isPalindrome = true;

        while (low < high) {
            if (word.charAt(low) != word.charAt(high)) {
                isPalindrome = false;
                break;
            }
            ++low;
            --high;
        }

        if (isPalindrome)
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");
    }
}
import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String word = scanner.next();
        int b = scanner.nextInt();

        String word1 = word.toUpperCase();
        String word2 = "INFRONT";

        if (word1.equals(word2)) {
            System.out.println(a - b);
        } else {
            System.out.println(a + b);
        }
    }
}
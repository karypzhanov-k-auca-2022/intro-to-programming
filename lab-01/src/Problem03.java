import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String fullName = scanner.nextLine();
        System.out.println("Hello, " + fullName);
    }
}

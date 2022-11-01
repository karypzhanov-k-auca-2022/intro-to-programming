import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");
        System.out.println("Your name in upper-case: " + name.toUpperCase());
        System.out.println("Your name in Lower-case: " + name.toLowerCase());
        System.out.println("The total number of characters is " + name.length());
    }
}

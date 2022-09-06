import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("What is your name?");
        System.out.println("My name is:");
        Scanner scanner = new Scanner(System.in);
        String myName = scanner.next();
        System.out.println("Nice to meet you, " + myName);
    }
}

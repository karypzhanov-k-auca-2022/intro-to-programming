import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("1st value? ");
        int a = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("2nd value? ");
        int b = scanner2.nextInt();
        System.out.printf("Before swapping: a = %d; b = %d;%n", a, b);
        int c = a;
        a = b;
        b = c;
        System.out.printf("After swapping: a = %d; b = %d;", a, b);
    }
}
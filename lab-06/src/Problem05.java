import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A = ");
        int a = scanner.nextInt();

        System.out.print("B = ");
        int b = scanner.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("GCD(" + a + ", " + b + ") is not defined.");
        } else {
            System.out.print("GCD(" + a + ", " + b + ") = " + gcd(a, b));
        }
    }

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }
}
import java.util.Scanner;

public class Problem04 {
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

    static int gcd(int a, int b) {
        int gcd = 1;
        int k = 2;

        while (k <= a && k <= b) {
            if (a % k == 0 && b % k == 0)
                gcd = k;
            k++;
        }
        return gcd;
    }
}
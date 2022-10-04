import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("1st value? ");
        int a = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.print("2nd value? ");
        int b = sc2.nextInt();
        System.out.printf("Before swapping: a = %d; b = %d;%n", a, b);
//        a = a + b - (b = a);
        a = a + b;
        b = a - b;
        a = a - b;
//        a = a ^ b;
//        b = b ^ a;
//        a = a ^ b;
        System.out.printf("After swapping: a = %d; b = %d;", a, b);
    }
}


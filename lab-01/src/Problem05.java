import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1st double? ");
        double a = sc.nextDouble();
        System.out.print("2nd double? ");
        double b = sc.nextDouble();
        double plusAb = a + b;
        double minesAb = a - b;
        double multiplyAb = a * b;
        double divideAb = a / b;
        double residueAb = a % b;
        System.out.println(a + " + " + b + " = "+ plusAb);
        System.out.println(a + " + " + b + " = "+ minesAb);
        System.out.println(a + " + " + b + " = "+ multiplyAb);
        System.out.println(a + " + " + b + " = "+ divideAb);
        System.out.println(a + " + " + b + " = "+ residueAb);

    }
}

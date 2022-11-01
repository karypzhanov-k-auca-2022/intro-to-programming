import java.util.Locale;
import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("1st double? ");
        double a = sc.nextDouble();

        System.out.print("2nd double? ");
        double b = sc.nextDouble();

        double plus = a + b;
        double mines = a - b;
        double multiply = a * b;
        double div = a / b;
        double residue = a % b;

        System.out.println(a + " + " + b + " = " + plus);
        System.out.println(a + " - " + b + " = " + mines);
        System.out.println(a + " * " + b + " = " + multiply);
        System.out.println(a + " / " + b + " = " + div);
        System.out.println(a + " % " + b + " = " + residue);

    }
}

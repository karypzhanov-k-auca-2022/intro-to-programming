import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = a / 10000;

        if (b == 555) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

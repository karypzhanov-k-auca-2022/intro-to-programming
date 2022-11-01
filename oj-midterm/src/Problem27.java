import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = scanner.nextInt();
        int cheese = scanner.nextInt();

        if (width == 3 && 95 <= cheese && cheese <= 100) {
            System.out.println("C.C. is absolutely satisfied with her pizza.");
        } else if (width == 1 && cheese <= 50) {
            System.out.println("C.C. is fairly satisfied with her pizza.");
        } else System.out.println("C.C. is very satisfied with her pizza.");
    }
}

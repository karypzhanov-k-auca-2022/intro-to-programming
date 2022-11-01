import java.util.Scanner;

public class Problem40 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pointX = scanner.nextInt();
        int pointY = scanner.nextInt();

        if (pointX > 0 && pointY > 0) {
            System.out.println(1);
        } else if (pointX > 0 && pointY < 0) {
            System.out.println(4);
        } else if (pointX < 0 && pointY > 0) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}

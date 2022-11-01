import java.util.Scanner;

public class Problem30 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();

        if (angle1 + angle2 + angle3 == 180) {
            if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("Equilateral");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}


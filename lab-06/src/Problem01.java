import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your coordinate: ");
        int myCoordinate = scanner.nextInt();

        System.out.print("Coordinate of 1st point: ");
        int point1 = scanner.nextInt();

        System.out.print("Coordinate of 2nd point: ");
        int point2 = scanner.nextInt();

        int res1 = abs(myCoordinate - point1);
        int res2 = abs(myCoordinate - point2);

        if (res1 > res2) {
            System.out.println("2nd point is closer. Distance " + res2);
        } else System.out.println("1st point is closer. Distance " + res1);
    }

    public static int abs(int x) {
        return Math.abs(x);
    }
}

import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.useDelimiter("\\D");

        int bigX = 0;
        int bigY = 0;
        int smallX = 100;
        int smallY = 100;

        for (int i = 0; i < n; ++i) {
            int pointX = scanner.nextInt();
            int pointY = scanner.nextInt();
            if (pointX < smallX) {
                smallX = pointX;
            }
            if (pointY < smallY) {
                smallY = pointY;
            }
            if (pointX > bigX) {
                bigX = pointX;
            }
            if (pointY > bigY) {
                bigY = pointY;
            }
        }
        System.out.println((smallX - 1) + "," + (smallY - 1));
        System.out.println((bigX + 1) + "," + (bigY + 1));
    }
}
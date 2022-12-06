import java.util.Scanner;

public class Problem37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int counter = 0;

        for (int i = m; i < n; i++) {
            if (isRotatable(i)) {
                counter += 1;
            }
        }

        System.out.println(counter);
    }

    public static int rotate(int n) {
        int rotation, inverse = 0, startingN = n;

        while (n != 0) {
            if (n % 10 == 2 || n % 10 == 3 || n % 10 == 4 || n % 10 == 5 || n % 10 == 7) {
                return rotation = -1;
            }
            n /= 10;
        }

        n = startingN;

        while (n != 0) {
            inverse *= 10;
            if (n % 10 == 6) {
                inverse += 9;
            } else if (n % 10 == 9) {
                inverse += 6;
            } else inverse += n % 10;
            n /= 10;
        }

        rotation = inverse;
        return rotation;
    }

    public static boolean isRotatable(int n) {
        if (n == rotate(n)) {
            return true;
        } else return false;
    }
}

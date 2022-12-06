import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int throwerNumber = scanner.nextInt();
        int sumOfWays = 0;

        for (int i = 4; i < throwerNumber + 1; i++) {
            sumOfWays += (i - 3) * (i - 2) / 2;
        }

        System.out.println(sumOfWays);
    }
}

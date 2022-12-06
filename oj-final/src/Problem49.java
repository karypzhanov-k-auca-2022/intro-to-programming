import java.util.Scanner;

public class Problem49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfRows = scanner.nextInt();

        int[] pascalsTriangle = new int[numberOfRows * (numberOfRows + 1) / 2];
        for (int i = 0; i < pascalsTriangle.length; i++) {
            pascalsTriangle[i] = 1;
        }

        for (int i = 2; i < numberOfRows; i++) {
            int leftBound = i * (i + 1) / 2;
            int rightBound = leftBound + i;

            for (int j = leftBound + 1; j < rightBound; j++) {
                pascalsTriangle[j] = pascalsTriangle[j - i - 1] + pascalsTriangle[j - i];
            }
        }

        int n = 1;
        for (int i = 0; i < pascalsTriangle.length; i++) {
            System.out.print(pascalsTriangle[i]);
            if (n * (n + 1) / 2 == i + 1) {
                System.out.println();
                n++;
            } else {
                System.out.print(" ");
            }
        }
    }
}
 import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberOfTiles1 = scanner.nextDouble();
        int squareLength = 0;

        while (numberOfTiles1 >= (squareLength + 1) * (squareLength + 1)) {
            squareLength += 1;
        }

        System.out.println("The largest square has side length " + squareLength + ".");
    }
}
import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        int lengthOfClass = scanner.nextInt();
        int widthOfClass = scanner.nextInt();
        int squareSide = scanner.nextInt();

        int numberOfTilesInLength = lengthOfClass / squareSide;
        int numberOfTilesInWidth = widthOfClass / squareSide;
        System.out.println(numberOfTilesInLength * numberOfTilesInWidth);
    }
}
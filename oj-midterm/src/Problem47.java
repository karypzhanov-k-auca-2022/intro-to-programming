import java.util.Scanner;

public class Problem47 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstVertexX = scanner.nextInt();
        int firstVertexY = scanner.nextInt();
        int secondVertexX = scanner.nextInt();
        int secondVertexY = scanner.nextInt();
        int thirdVertexX = scanner.nextInt();
        int thirdVertexY = scanner.nextInt();

        int fourthVertexX;
        int fourthVertexY;

        if (firstVertexX == secondVertexX) {
            fourthVertexX = thirdVertexX;
        } else if (firstVertexX == thirdVertexX) {
            fourthVertexX = secondVertexX;
        } else {
            fourthVertexX = firstVertexX;
        }

        if (firstVertexY == secondVertexY) {
            fourthVertexY = thirdVertexY;
        } else if (firstVertexY == thirdVertexY) {
            fourthVertexY = secondVertexY;
        } else {
            fourthVertexY = firstVertexY;
        }

        System.out.println(fourthVertexX + " " + fourthVertexY);
    }
}

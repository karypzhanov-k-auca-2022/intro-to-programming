import java.util.Scanner;

public class Problem33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drawing = scanner.next();

        int firstHalfLength = drawing.indexOf("(") + 1;

        if (drawing.length() == firstHalfLength * 2) {
            System.out.println("correct");
        } else {
            System.out.println("fix");
        }
    }
}
import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {

        int students = 28;
        Scanner scanner = new Scanner(System.in);
        int bigBox = scanner.nextInt();
        int littleBox = scanner.nextInt();

        int cakes = bigBox * 8 + littleBox * 3 - students;
        System.out.println(cakes);
    }
}

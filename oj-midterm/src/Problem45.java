import java.util.Scanner;

public class Problem45 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startFirstClip = scanner.nextInt();
        int endFirstClip = scanner.nextInt();

        int startSecondClip = scanner.nextInt();
        int endSecondClip = scanner.nextInt();

        System.out.println(endFirstClip <= startSecondClip ||
                endSecondClip <= startFirstClip ? "NO" : "YES");
    }
}

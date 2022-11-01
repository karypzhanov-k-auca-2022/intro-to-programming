import java.util.Scanner;

public class Problem48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstAgentX = scanner.nextInt();
        int firstAgentY = scanner.nextInt();
        int secondAgentX = scanner.nextInt();
        int secondAgentY = scanner.nextInt();
        int shadyX = scanner.nextInt();
        int shadyY = scanner.nextInt();
        int D = scanner.nextInt();

        if (Math.sqrt(Math.pow(shadyX - firstAgentX, 2) + Math.pow(shadyY - firstAgentY, 2)) <= D
                || Math.sqrt(Math.pow(shadyX - secondAgentX, 2) + Math.pow(shadyY - secondAgentY, 2)) <= D) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

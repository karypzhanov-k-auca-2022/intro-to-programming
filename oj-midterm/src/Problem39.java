import java.util.Scanner;

public class Problem39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        switch (n) {
            case 2:
            case 3:
            case 7:
            case 8:
                System.out.println(2);
                break;
            case 4:
            case 5:
            case 6:
                System.out.println(3);
                break;
            default:
                System.out.println(1);
        }
    }
}

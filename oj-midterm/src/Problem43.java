import java.util.Scanner;

public class Problem43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String code = scanner.next();

        switch (code) {
            case "MG":
                System.out.println("midget girls");
                break;
            case "MB":
                System.out.println("midget boys");
                break;
            case "JG":
                System.out.println("junior girls");
                break;
            case "JB":
                System.out.println("junior boys");
                break;
            case "SG":
                System.out.println("senior girls");
                break;
            case "SB":
                System.out.println("senior boys");
                break;
            default:
                System.out.println("invalid code");
        }
    }
}

import java.util.Scanner;

public class Problem32 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String monthName = scanner.next();
        int day = scanner.nextInt();

        switch (monthName) {
            case "OCT":
                if (day == 31) {
                    System.out.println("yup");
                } else {
                    System.out.println("nope");
                }
                break;
            case "DEC":
                if (day == 25) {
                    System.out.println("yup");
                } else {
                    System.out.println("nope");
                }
                break;
            default:
                System.out.println("nope");
        }
    }

}

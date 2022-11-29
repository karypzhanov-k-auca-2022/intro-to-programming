import java.util.Scanner;

public class Problem20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWins = 0;

        while (scanner.hasNext()) {
            if (scanner.next().equals("W")) {
                numberOfWins += 1;
            }
        }

        switch (numberOfWins) {
            case 5:
            case 6:
                System.out.println(1);
                break;
            case 3:
            case 4:
                System.out.println(2);
                break;
            case 2:
            case 1:
                System.out.println(3);
                break;
            default:
                System.out.println(-1);
        }
    }
}
import java.util.Locale;
import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int computerMove = (int) (Math.random() * 3);
        int myMove = scanner.nextInt();

        String moveName = null;
        String userMoveName = null;

        switch (computerMove) {
            case 0:
                moveName = "scissor";
                break;
            case 1:
                moveName = "rock";
                break;
            case 2:
                moveName = "paper";
                break;
        }

        switch (myMove) {
            case 0:
                userMoveName = "scissor";
                break;
            case 1:
                userMoveName = "rock";
                break;
            case 2:
                userMoveName = "paper";
                break;
        }

        if (myMove == 0 && computerMove == 2) {
            System.out.printf("The computer is %s. You are %s. You won%n", moveName, userMoveName);
        } else if (myMove == 1 && computerMove == 0) {
            System.out.printf("The computer is %s. You are %s. You won%n", moveName, userMoveName);
        } else if (myMove == 2 && computerMove == 1) {
            System.out.printf("The computer is %s. You are %s. You won%n", moveName, userMoveName);
        } else if (myMove == computerMove) {
            System.out.printf("The computer is %s. You are %s too. It is a draw%n", moveName, userMoveName);
        } else {
            System.out.printf("The computer is %s. You are %s. You lost%n", moveName, userMoveName);
        }
    }
}

import javax.security.auth.login.AccountException;
import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dice1 = scanner.nextInt();
        int dice2 = scanner.nextInt();
        int counter = 0;
        if(dice1 < 10) {
            for (int i = 1; i < dice1; i++) {
                if (10 - i <= dice2) counter += 1;
            }
        }
        else for (int i = 1; i < 9; i++) {
            if (10 - i <= dice2) counter += 1;
        }
        if(counter == 1) System.out.println("There is " + counter + " way to get the sum 10.");
        else if(counter == 0) System.out.println("There are 0 ways to get the sum 10.");
        else System.out.println("There are " + (counter+1) + " ways to get the sum 10.");
    }
}

import java.util.Scanner;

public class Problem41 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int team1 = 0;
        team1 += scanner.nextInt() * 3;
        team1 += scanner.nextInt() * 2;
        team1 += scanner.nextInt();

        int team2 = 0;
        team2 += scanner.nextInt() * 3;
        team2 += scanner.nextInt() * 2;
        team2 += scanner.nextInt();

        if (team1 > team2) {
            System.out.println("A");
        } else if (team1 < team2) {
            System.out.println("B");
        } else {
            System.out.println("T");
        }
    }

}

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int points, fouls;
        int counterForPlayers = 0, counterForTeam = 0;

        for (int i = 0; i < N; i++) {
            points = scanner.nextInt();
            fouls = scanner.nextInt();
            if (points * 5 - fouls * 3 > 40) {
                counterForPlayers += 1;
            }
            if (points * 5 - fouls * 3 <= 40) {
                counterForTeam += 1;
            }
        }

        if (counterForTeam != 0) {
            System.out.println(counterForPlayers);
        } else System.out.println(counterForPlayers + "+");
    }
}

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int bidPrice, winnersBid = 0;
        String name, winner = " ";

        for (int i = 0; i < N; i++) {
            name = scanner.next();
            bidPrice = scanner.nextInt();
            if (winnersBid < bidPrice) {
                winnersBid = bidPrice;
                winner = name;
            }
        }

        System.out.println(winner);
    }
}

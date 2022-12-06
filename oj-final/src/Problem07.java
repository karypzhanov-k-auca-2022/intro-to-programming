import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int antonioScore = 100, davidScore = 100;
        int antonioDieScore, davidDieScore;

        for (int i = 0; i < n; i++) {
            antonioDieScore = scanner.nextInt();
            davidDieScore = scanner.nextInt();

            if(antonioDieScore < davidDieScore) {
                antonioScore -= davidDieScore;
            }
            else if(davidDieScore < antonioDieScore){
                davidScore -= antonioDieScore;
            }
        }

        System.out.println(antonioScore + "\n" + davidScore);
    }
}
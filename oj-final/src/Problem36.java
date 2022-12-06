import java.util.Scanner;

public class Problem36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casesCounter = scanner.nextInt();
        int beats;
        double sec;

        for (int i = 0; i < casesCounter; i++) {
            beats = scanner.nextInt();
            sec = scanner.nextDouble();
            beatsPerMinute(beats, sec);
        }
    }

    public static double beatsPerMinute(double beats, double sec) {
        double minBeatsPerMinute = (beats - 1) * 60 / sec;
        double beatsPerMinute = beats * 60 / sec;
        double maxBeatsPerMinute = (beats + 1) * 60 / sec;
        System.out.printf("%.4f %.4f %.4f\n", minBeatsPerMinute, beatsPerMinute, maxBeatsPerMinute);
        return 1;
    }
}

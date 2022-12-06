import java.util.Scanner;

public class Problem45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int xyene[] = new int[N];
        int xyeneCounter = 0, fatalEagleCounter = 0;
        int fatalEagle[] = new int[N];

        for (int i = 0; i < N; i++) {
            xyene[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            fatalEagle[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            if (xyene[i] > fatalEagle[i]) {
                xyeneCounter += 1;
            }

            if (fatalEagle[i] > xyene[i]) {
                fatalEagleCounter += 1;
            }
        }

        System.out.println(xyeneCounter + " " + fatalEagleCounter);

        if (xyeneCounter > fatalEagleCounter) {
            System.out.println("Xyene");
        } else if (fatalEagleCounter > xyeneCounter) {
            System.out.println("FatalEagle");
        } else {
            System.out.println("Tie");
        }
    }
}

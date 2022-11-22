import java.util.*;

public class Problem08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Number of tests?");
        int numOfTests = scanner.nextInt();
        int numOfCorrectAns = 0;
        int i = 0;

        while (i < numOfTests) {
            int num1 = -50 + random.nextInt(101);
            int num2 = -50 + random.nextInt(101);

            System.out.printf("%d + %d = ", num1, num2);
            int answer = scanner.nextInt();

            if (answer == num1 + num2) {
                ++numOfCorrectAns;
            }

            ++i;
        }

        System.out.println("Number of correct answers: " + numOfCorrectAns);
        System.out.println("Number of incorrect answers: " + (numOfTests - numOfCorrectAns));
    }
}
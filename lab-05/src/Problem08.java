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
            int op1 = -50 + random.nextInt(101);
            int op2 = -50 + random.nextInt(101);

            System.out.printf("%d + %d = ", op1, op2);
            int answer = scanner.nextInt();

            if (answer == op1 + op2) {
                ++numOfCorrectAns;
            }

            ++i;
        }

        System.out.println("Number of correct answers: " + numOfCorrectAns);
        System.out.println("Number of incorrect answers: " + (numOfTests - numOfCorrectAns));
    }
}
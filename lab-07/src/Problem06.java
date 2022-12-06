import java.util.Scanner;

public class Problem06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.printf("Enter %d scores: ", numberOfStudents);
        int[] scores = new int[numberOfStudents];
        int bestScore = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = scanner.nextInt();
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }

        for (int i = 0; i < scores.length; i++) {
            String grade = "";
            if (scores[i] >= bestScore - 10) {
                grade = "A";
            } else if (scores[i] >= bestScore - 20) {
                grade = "B";
            } else if (scores[i] >= bestScore - 30) {
                grade = "C";
            } else if (scores[i] >= bestScore - 40) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.printf("Student %d score is %d and grade is " + grade, i, scores[i]);
            System.out.println();
        }
    }

}

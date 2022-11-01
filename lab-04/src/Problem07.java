import java.util.Locale;
import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your lottery pick (three digits): ");
        int userNumber = scanner.nextInt();
        int computerNumber = (int) (Math.random() * 900 + 100);

        int lotteryDigit1 = computerNumber / 100;
        int lotteryDigit2 = (computerNumber % 100) / 10;
        int lotteryDigit3 = computerNumber % 10;
        System.out.println("The lottery number is " + lotteryDigit1 + lotteryDigit2 + lotteryDigit3);

        int userDigit1 = userNumber / 100;
        int userDigit2 = (userNumber % 100) / 10;
        int userDigit3 = userNumber % 10;

        if (computerNumber == userNumber) {
            System.out.println("Exact match: you win $10.000");
        } else if ((userDigit1 == lotteryDigit1 || userDigit1 == lotteryDigit2 || userDigit1 == lotteryDigit3)
                || (userDigit2 == lotteryDigit1 || userDigit2 == lotteryDigit2 || userDigit2 == lotteryDigit3)
                || (userDigit3 == lotteryDigit1 || userDigit3 == lotteryDigit2 || userDigit3 == lotteryDigit3)) {
            System.out.println("Match one digit: you win $1.000");
        } else if (userDigit1 == lotteryDigit2 && userDigit2 == lotteryDigit1 && userDigit3 == lotteryDigit3
                || userDigit1 == lotteryDigit2 && userDigit2 == lotteryDigit3 && userDigit3 == lotteryDigit1
                || userDigit1 == lotteryDigit3 && userDigit2 == lotteryDigit2 && userDigit3 == lotteryDigit1
                || userDigit1 == lotteryDigit3 && userDigit2 == lotteryDigit1 && userDigit3 == lotteryDigit2
                || userDigit1 == lotteryDigit1 && userDigit2 == lotteryDigit3 && userDigit3 == lotteryDigit2) {
            System.out.println("Match all digits: you win $3.000");
        } else
            System.out.println("no match");
    }
}



import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();
        int count = 0, counter = 0;
        for (int i = initialNumber; i < endNumber + 1; i++) {
            for (int j = 1; j < i; j++) {
                if(i % j == 0) count ++;
            }
            if(count + 1 == 4) counter ++;
            count = 0;
        }
        System.out.printf("The number of RSA numbers between " + initialNumber + " and " + endNumber + " is " + counter);
    }
}

import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("A four-digit integer? ");
        int n = scanner.nextInt(); // 1234
        int sumOfDigits = 0;
        sumOfDigits += n % 10;
        n /= 10;
        sumOfDigits += n % 10;
        n /= 10;
        sumOfDigits += n % 10;
        n /= 10;
        sumOfDigits += n % 10;
        n /= 10;
        sumOfDigits += n % 10;
        n /= 10;
        System.out.println("The sum of all digits is " + sumOfDigits);
        scanner.close();
        //        while ( > 0) {
//             =  % 10;
//            a = a / 10;
//        }
    }
}

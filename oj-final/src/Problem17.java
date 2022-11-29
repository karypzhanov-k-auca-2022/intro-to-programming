import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        int countt = 1;

        if (number == 1) {
            countt = 0;
        } else if (number > 1) {
            while (number >= 2) {
                number /= 2;
                countt += 1;
            }
        } else if (number <= 0) {
            System.out.println("Wrong number");
        } else {
            countt = -1;

            while (number <= 0.5) {
                number *= 2;
                countt -= 1;
            }
        }

        System.out.println(countt);
    }
}
import java.util.Scanner;

public class Problem42 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int temperature = scanner.nextInt();
        int pressure = 5 * temperature - 400;

        System.out.println(pressure);
        if (pressure > 100) {
            System.out.println(-1);
        } else if (pressure < 100) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}

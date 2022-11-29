import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double P = scanner.nextDouble();
        int A = scanner.nextInt();
        int Y = scanner.nextInt();
        int B = scanner.nextInt();
        while(A < B){
            Y += 1;
            A *= (1+P/100);
        }
        System.out.println(Y);
    }
}

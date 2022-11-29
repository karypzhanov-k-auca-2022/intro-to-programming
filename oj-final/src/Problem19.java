import java.util.Scanner;

public class Problem19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int m = scanner.nextInt();
        int n = 1;

        while ((x * n) % m != 1 && n < m) {
            n++;
        }
        System.out.println(n < m ? n : "No such integer exists.");
    }
}
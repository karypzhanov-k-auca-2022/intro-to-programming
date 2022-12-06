import java.util.Scanner;

public class Problem50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMessages = scanner.nextInt();
        int[] messages = new int[numberOfMessages];
        for (int i = 0; i < numberOfMessages; i++) {
            messages[i] = (scanner.next()).length();
        }

        int numberOfCentres = scanner.nextInt();
        int[] centres = new int[numberOfCentres];

        for (int i = 0; i < numberOfMessages; i++) {
            int index = indexOfMin(centres);
            System.out.println(index + 1);
            centres[index] += messages[i];
        }
    }


    public static int indexOfMin(int[] a) {
        int index = 0;
        int minNumber = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < minNumber) {
                minNumber = a[i];
                index = i;
            }
        }

        return index;
    }
}

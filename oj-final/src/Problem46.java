import java.util.Scanner;

public class Problem46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStations = scanner.nextInt();
        scanner.nextLine();

        String[] stations = new String[numberOfStations];
        boolean isBessarionNearByLeslie = false;
        boolean isBessarionNearByBayview = false;

        for (int i = 0; i < numberOfStations; i++) {
            stations[i] = scanner.nextLine();
        }

        for (int i = 1; i < stations.length - 1; i++) {
            if (stations[i].equals("Bessarion")) {
                isBessarionNearByLeslie = isBessarionNearByLeslie || stations[i - 1].equals("Leslie");
                isBessarionNearByLeslie = isBessarionNearByLeslie || stations[i + 1].equals("Leslie");
                isBessarionNearByBayview = isBessarionNearByBayview || stations[i - 1].equals("Bayview");
                isBessarionNearByBayview = isBessarionNearByBayview || stations[i + 1].equals("Bayview");
            }
        }

        System.out.println(isBessarionNearByLeslie && isBessarionNearByBayview ? "Y" : "N");
    }
}

import java.util.Scanner;

public class Problem37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daytime = scanner.nextInt();
        int eveningTime = scanner.nextInt();
        int weekend = scanner.nextInt();

        int planACost = Math.max(daytime - 100, 0) * 25 + eveningTime * 15 + weekend * 20;
        int planBCost = Math.max(daytime - 250, 0) * 45 + eveningTime * 35 + weekend * 25;

        System.out.printf("Plan A costs %.2f%n", planACost / 100.0);
        System.out.printf("Plan B costs %.2f%n", planBCost / 100.0);

        if (planACost == planBCost) {
            System.out.println("Plan A and B are the same price.");
        } else if (planACost > planBCost) {
            System.out.println("Plan B is cheapest.");
        } else
            System.out.println("Plan A is cheapest.");
    }
}

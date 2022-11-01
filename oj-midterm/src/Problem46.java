import java.util.Scanner;

public class Problem46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int buyingPower = 0;

        buyingPower += scanner.nextInt() * 3;
        buyingPower += scanner.nextInt() * 2;
        buyingPower += scanner.nextInt();

        String maxVictoryCard = "";
        String maxTreasureCard = "";

        if (buyingPower >= 8) {
            maxVictoryCard = "Province";
        } else if (buyingPower >= 5) {
            maxVictoryCard = "Duchy";
        } else if (buyingPower >= 2) {
            maxVictoryCard = "Estate";
        }

        if (buyingPower >= 6) {
            maxTreasureCard = "Gold";
        } else if (buyingPower >= 3) {
            maxTreasureCard = "Silver";
        } else if (buyingPower >= 0) {
            maxTreasureCard = "Copper";
        }

        System.out.println(maxVictoryCard
                + (maxVictoryCard.length() * maxTreasureCard.length() > 0 ? " or " : "")
                + maxTreasureCard);
    }
}

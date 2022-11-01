import java.util.Locale;

public class Problem10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int rank = (int) ((Math.random() * 13) + 1);
        String rankName = null;

        switch (rank) {
            case 1:
                rankName = "Ace";
                break;
            case 2:
                rankName = "2";
                break;
            case 3:
                rankName = "3";
                break;
            case 4:
                rankName = "4";
                break;
            case 5:
                rankName = "5";
                break;
            case 6:
                rankName = "6";
                break;
            case 7:
                rankName = "7";
                break;
            case 8:
                rankName = "8";
                break;
            case 9:
                rankName = "9";
                break;
            case 10:
                rankName = "10";
                break;
            case 11:
                rankName = "Jack";
                break;
            case 12:
                rankName = "Queen";
                break;
            case 13:
                rankName = "King";
                break;
        }

        int suit = (int) ((Math.random() * 4) + 1);
        String suitName = null;

        switch (suit) {
            case 1:
                suitName = "Clubs";
                break;
            case 2:
                suitName = "Diamonds";
                break;
            case 3:
                suitName = "Hearts";
                break;
            case 4:
                suitName = "Spades";
                break;
        }

        System.out.println("The card you picked is " + rankName + " of " + suitName);
    }
}

public class Problem07 {
    public static void main(String[] args) {
        System.out.println("a    a^2   a^3");
        for (int i = 1; i <= 3; i++) {
            System.out.printf("%d    %d     %d%n", i, i * i, i * i * i);
        }
        System.out.println(4 + "    " + 4 * 4 + "    " + 4 * 16);
    }
}


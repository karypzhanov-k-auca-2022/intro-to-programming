public class Problem09 {
    public static void main(String[] args) {

        double p = 1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11;
        double p1 = 4 * (p);
        double p2 = 4 * (p + 1.0 / 13);
        System.out.println(p1);
        System.out.println(p2);
    }
}

public class Problem10 {
    public static void main(String[] args) {


        double oneBirth = 7.0;
        double oneDeath = 13.0;
        double oneImmigrant = 45.0;
        double currentPopulation = 312032486;

        double secondsInOneYear = 60 * 60 * 24 * 365;

        double births = secondsInOneYear / oneBirth;
        double deaths = secondsInOneYear / oneDeath;
        double immigrants = secondsInOneYear / oneImmigrant;


        currentPopulation += births + immigrants - deaths;
        System.out.println(Math.round(currentPopulation));

        currentPopulation += births + immigrants - deaths;
        System.out.println(Math.round(currentPopulation));

        currentPopulation += births + immigrants - deaths;
        System.out.println(Math.round(currentPopulation));

        currentPopulation += births + immigrants - deaths;
        System.out.println(Math.round(currentPopulation));

        currentPopulation += births + immigrants - deaths;
        System.out.println(Math.round(currentPopulation));
    }
}

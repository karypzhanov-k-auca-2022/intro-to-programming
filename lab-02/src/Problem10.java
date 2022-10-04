import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double oneBirth = 7.0;
        double oneDeath = 13.0;
        double oneImmigrant = 45.0;
        double currentPopulation = 312032486;
        double secondsInOneYear = 60 * 60 * 24 * 365;
        double births = secondsInOneYear / oneBirth;
        double deaths = secondsInOneYear / oneDeath;
        double immigrants = secondsInOneYear / oneImmigrant;
        System.out.print("Enter the number of years: ");
        int year = scanner.nextInt();
        double d = Math.round(currentPopulation + ((births + immigrants - deaths) * year));
        System.out.println("The population in " + year + " years is " + (int) d);
    }
}

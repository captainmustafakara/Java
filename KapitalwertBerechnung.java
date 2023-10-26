import java.util.Scanner;

public class KapitalwertBerechnung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Startkapital eingeben: ");
        double startkapital = scanner.nextDouble();

        System.out.print("Zinssatz eingeben: ");
        double zinssatz = scanner.nextDouble();

        int jahr = 0;
        double kapital = startkapital;

        do {
            jahr++;
            kapital = kapital * (1 + zinssatz/100);
        } while (kapital < 2 * startkapital);

        System.out.println("Kapitalwert: " + kapital);
        System.out.println("Anzahl Jahre: " + jahr);
    }
}

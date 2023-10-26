import java.util.Scanner;

public class UrlaubsanspruchProgramm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie das Alter des Beschäftigten ein:");
        int alter = scanner.nextInt();

        System.out.println("Geben Sie die Betriebszugehörigkeit des Beschäftigten in Jahren ein:");
        int betriebszugehoerigkeit = scanner.nextInt();

        String minderjaehrigAntwort = "";
        boolean minderjaehrig = false;

        while (!minderjaehrigAntwort.equalsIgnoreCase("ja") && !minderjaehrigAntwort.equalsIgnoreCase("nein")) {
            System.out.println("Ist der Beschäftigte minderjährig? (ja/nein)");
            minderjaehrigAntwort = scanner.next();

            if (minderjaehrigAntwort.equalsIgnoreCase("ja")) {
                minderjaehrig = true;
            } else if (minderjaehrigAntwort.equalsIgnoreCase("nein")) {
                minderjaehrig = false;
            } else {
                System.out.println("Bitte antworten Sie mit 'ja' oder 'nein'.");
            }
        }

        System.out.println("Geben Sie den Behinderungsgrad des Beschäftigten ein (in Prozent):");
        int behinderungsgrad = scanner.nextInt();

        int urlaubsanspruch = berechneUrlaubsanspruch(alter, betriebszugehoerigkeit, minderjaehrig, behinderungsgrad);
        System.out.println("Der Urlaubsanspruch beträgt: " + urlaubsanspruch + " Tage");

        scanner.close();
    }

    public static int berechneUrlaubsanspruch(int alter, int betriebszugehoerigkeit, boolean minderjaehrig, int behinderungsgrad) {
        int urlaubsanspruch = 26; // Grundanspruch

        if (minderjaehrig) {
            urlaubsanspruch = 30;
        } else if (alter > 55) {
            urlaubsanspruch = 28;
        }

        if (behinderungsgrad >= 50) {
            urlaubsanspruch += 5;
        }

        if (betriebszugehoerigkeit > 10) {
            urlaubsanspruch += 2;
        }

        return urlaubsanspruch;
    }
}
import java.util.Scanner;

public class TaschenRechnerSwitchCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie die erste Zahl ein");
		double zahl1 = scanner.nextDouble();
		
		System.out.println("Bitte geben Sie die zweite Zahl ein");
		double zahl2 = scanner.nextDouble();
		
		System.out.println("Bitte geben Sie den Operator ein (+,-,*,/: ");
		String operator = scanner.next();
		
		double ergebnis = 0;
		
		switch (operator) {
		case "+":
			ergebnis = zahl1+zahl2;
			break;
		case "-":
			ergebnis = zahl1 - zahl2;
			break;
		case "*":
			ergebnis = zahl1 * zahl2;
			break;
		case "/":
			ergebnis = zahl1 / zahl2;
			break;
		default:
			System.out.println("Ungültiger Operator!");
			return;
		}
		System.out.println("Das Ergebnis ist: " + ergebnis);
		
		System.out.println("Möchten Sie eine weitere Berechnung durchführen? (ja/nein)");
		String antwort = scanner.next();
		
		//boolean weitermachen = antwort.equalsIgnoreCase("ja");
		
		if (antwort.equalsIgnoreCase("ja")) {
			main(args);
		}else if(antwort.equalsIgnoreCase("nein")){
			System.out.println("Das Programm wurde beendet.");
		}else {
			System.out.println("Bitte geben Sie eine gültige Antwort ein.");
		}	
	}
}

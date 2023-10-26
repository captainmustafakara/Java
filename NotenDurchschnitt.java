import java.util.Scanner;

public class NotenDurchschnitt {

	public static void main(String[] args) {
		double quiz, vize, ffinal;
		double ortalama;
		
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.println("Geben Sie Quiz Note ein: ");
		quiz = inputScanner.nextDouble();
		System.out.println("Geben Sie Vie Note ein: ");
		vize = inputScanner.nextDouble();
		System.out.println("Geben Sie Final Note ein: ");
		ffinal = inputScanner.nextDouble();
		
		ortalama = (quiz*0.2) + (vize*0.35) + (ffinal*0.45);
		System.out.println("Not ortalamaniz:" + ortalama);
		String ergebnis = (ortalama >= 50) ? "Bestanden" : "nicht Bestanden";
		System.out.println(ergebnis);
		

	}

}

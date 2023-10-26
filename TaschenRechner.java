import java.util.Scanner;

public class TaschenRechner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nummer1, nummer2 , auswahl;
		System.out.println("Geben Sie erste Zahl ein : ");
		nummer1 = scanner.nextInt();
		System.out.println("\nGeben Sie zweite Zahl ein :");
		nummer2 = scanner.nextInt();
		System.out.println("\nBitte wählen Sie ihre Mathematische Operation aus :");
		System.out.println("\n1-Addieren\2-Subtraktion\3-Mal\4-Dividieren");
		System.out.println("Ihre Auswahl : ");
		auswahl = scanner.nextInt();
		
		if(auswahl == 1) {
			System.out.println("Addieren : " + (nummer1+nummer2)) ;
		}else if (auswahl == 2) {
			System.out.println("Subtraktion : " + (nummer1-nummer2)) ;		
		}else if (auswahl == 3) {
			System.out.println("Mal : " + (nummer1*nummer2)) ;
		}else if (auswahl == 4) {
			if (nummer2 == 0) {
			System.out.println("2. Zahl ist gleich 0 und das Ergebnis ist unbestimmt!");
		}else {
			System.out.println("Diviederen : " + (nummer1/nummer2)) ;
		}}else {
			System.out.println("Ungültige Rechen Methode oder Operator, bitte versuchen Sie nochmal! ");
		}
	}}


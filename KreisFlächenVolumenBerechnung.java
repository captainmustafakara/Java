import java.util.Scanner;

public class KreisFlächenVolumenBerechnung {

	public static void main(String[] args) {
		int r;
		double fläche,volume, pi =3.14;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte geben Sie r Wert ein: ");
		r = input.nextInt();
		fläche = (2*pi*r);
		System.out.println("Kreis Fläche ist: " + fläche);
		
		volume = pi*(r*r);
		System.out.println("Kreis Volume ist: " + volume);
		

	}

}

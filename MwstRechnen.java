import java.util.Scanner;

public class MwstRechnen {

	public static void main(String[] args) {
		double preis, mwstPreis, mwst = 0.19;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Geben Sie Produkt Preis ein ");
		preis = input.nextDouble();
		mwstPreis = preis + (preis*mwst);
		System.out.println("Endpreis: " + mwstPreis);
		
		

	}

}

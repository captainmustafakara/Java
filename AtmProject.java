import java.util.Scanner;

public class AtmProject {
	
	//23.10.2023

	public static void main(String[] args) {
		int restbestand = 1000, input, betrag;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hallo Herzlichwillkommen Java Bank! ");
		System.out.println("Ihre Aktuel Limit" + restbestand + "€");
		
		while (restbestand > 0) {
			System.out.println("0-) Menu\n");
			System.out.println("1-) Geld einzahlen");
			System.out.println("2-) Geld abheben");
			System.out.println("3-) Restbestand Nachfrage");
			System.out.println("4-) System Abmelden");
			System.out.println("5-) Bitte wählen Sie Ihre Prozess aus: ");
			input = scanner.nextInt();
			
			if (input == 1) {
				System.out.println("Ihre Gewünschte Einzahlungsbetrag:  ");
				betrag = scanner.nextInt();
				restbestand += betrag;				
			}else if(input==2){
				System.out.println("Ihre Gewünschte Abhebungssbetrag:  ");
				betrag = scanner.nextInt();
				if(betrag > restbestand) {
					System.out.println("Unreichende Restbestand!! ");	
				}else {
					restbestand -= betrag;
				}
			}else if(input ==3) {
				System.out.println("Aktuelle Restbestand: " + restbestand + "€");
			}else if(input ==4) {
				System.out.println("Abmelde Prozess läuft !!.........." + restbestand + "€");
				break;
			}else {
				System.out.println("Ungültige Aktion eingegeben!!! ");
			}
		}
		
		System.out.println("Aufwiedersehen!");

	}

}

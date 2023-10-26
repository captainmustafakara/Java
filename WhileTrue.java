import java.util.Scanner;

public class WhileTrue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int zahl;
		while(true) {
			System.out.println("Bitte geben Sie ein Zahl ein:  ");
			zahl = input.nextInt();
			if(zahl==0) {
				break;
			}
			System.out.println("Loop ist ende. Programm läuft......");
			
		}

	}

}

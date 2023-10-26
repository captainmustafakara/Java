import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int zahl;
		do {
			System.out.println("Bitte geben Sie ein Zahl ein: ");
			zahl = input.nextInt();
		}while(zahl != 0);

	}

}

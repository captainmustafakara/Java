import java.util.Scanner;

public class SchüleAnzahl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Anzahl der Schüle als Ganzzahl eingeben: ");
        int schülerAnzahl = scanner.nextInt();
        
        System.out.println("Anzahl der Schüler: " + schülerAnzahl);
        
        scanner.close();

	}

}

 
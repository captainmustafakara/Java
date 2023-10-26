import java.util.Scanner;

public class ArrayAndWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] text = {'_', '_', '_', '_', '_'};
		System.out.println(text);
		
		int i = 0;
		while (i < 4) {
			System.out.println("Bitte Eingabe machen: ");
			int position = scanner.nextInt();
			
			if (text[position] == '_') {
				text[position] = (char) (i + 48); // 48 is the ASCII value for '0'
				i++;
			}
			
			System.out.println(text);
		}
	}
}

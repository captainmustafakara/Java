import javax.xml.transform.Templates;

public class Palindrom {
	
	static boolean isPalindrom(int input) {
		int tmp, reverseZahl = 0,rest;
		tmp = input;
		
		while(tmp != 0) {
			rest = tmp % 10;
			reverseZahl = reverseZahl*10 +rest;
			tmp /=10;
		}
		if(input == reverseZahl)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		//123321 Zahlen, deren Umkehrwerte sich selbst gleich sind
		
		//121 % 10 = 1 neue Zahl=1, 121 / 10 = 12,1 int 12
		//12 % 10  = 2 neue Zahl= neue Zahl * 10+2=12, 12/10 = 1
		//1%10=1, neue Zahl neue Zahl * 10 + 1 = 121
		
		System.out.println(isPalindrom(123321));
		

	}

}

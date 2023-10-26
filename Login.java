import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner((System.in));
		
		String userName, passwort;
		
		System.out.print("Geben Sie username ein : ");		
		userName = scan.nextLine();
		
		System.out.println("geben Sie passwort ein : ");
		passwort = scan.nextLine();
		
		if(userName.equals("admin") && passwort.equals("123geheim")) {
			System.out.println("Erfolgreich Eingelogged ! ");
		}else {
			System.out.println("userName oder passwort ist Falsch");
		}

	}

}

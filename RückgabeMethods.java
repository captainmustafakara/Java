
public class RückgabeMethods {
	
	public static double durchschnitt(int zahl1, int zahl2) {
		int addieren = zahl1 + zahl2;
		double durchschnitt = addieren/2;
		return durchschnitt;
	}

	public static void main(String[] args) {
		durchschnitt(45, 70);
		System.out.println(durchschnitt(45, 70));
		System.out.println(durchschnitt(10, 100));

	}

}

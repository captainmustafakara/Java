
public class Rekursiv1 {

	public static void main(String[] args) {
		System.out.println("faktoriyel (4) =" + Faktoriyel(4));

	}

	public static int Faktoriyel(int n) {
		if (n ==1)
			return 1;
		return n * Faktoriyel(n-1);
	}

}

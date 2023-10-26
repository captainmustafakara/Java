
public class Overloading {
	
	//add (int,int)
	static int add(int a, int b ) {
		System.out.println("1.Method");
		return a+b;
	}
	static int add(int a, int b, int c ) {
		System.out.println("2.Method");
		return a+b+c;
	}
	static double add(int a, int b, double c ) {
		System.out.println("3.Method");
		return a+b+c;
	}
	static double add(int a, double b, int c ) {
		System.out.println("4.Method");
		return a+b+c;
	}

	public static void main(String[] args) {
		System.out.println(add(1, 2));
		System.out.println(add(1, 2, 5));
		System.out.println(add(1, 2, 9.0));
		//System.out.println(add(1, 2.0, 7.0));
		
	}

}

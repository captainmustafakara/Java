
public class ReturnMethods {
	
	static int power(int a, int b) {
		int result =1;
		
		for(int i=1; i <=b; i++) {
			result*=a;
		}
		return result;
	}
	
	static void power2(int a, int b) {
		int result = 1;
		for (int i=1; i<=b; i++) {
			result *=a;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		int r2 = power(3, 3);
		System.out.println(r2);
		
		//color of green
		

	}

}


public class Arrays {

	public static void main(String[] args) {
		// Gleiche Datentyp zusammen behalten
		
		/*int[] zahlen = new int[5];
		zahlen [0] = 20;
		zahlen [1] = 40;
		zahlen [2] = 70;
		zahlen [3] = 50;
		zahlen [4] = 60;*/
		
		int[] zahlen = {20,40,60,70,20};
		
		String[] studenten = {"Bahadir", "Omer", "Buse", "Musti", "Sami"};
		
		//System.out.println(zahlen[4]);
		//System.out.println(studenten[4]);
		
		for (int j=0; j <4; j++) {
			System.out.println(studenten[j]);
		
		}
		
		for(int i=0; i<4; i++) {
			System.out.println(zahlen[i]);
		}
		
	}

}

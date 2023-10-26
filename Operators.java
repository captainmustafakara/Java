
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 5;
		int toplam = a+b;
		int cikarma = a-b;
		int carpma = a*b;
		int bölme = a/b;
		int mod = a%b;
		
		System.out.println("Toplam : " + toplam);
		System.out.println("Cikarma : "  + cikarma);
		System.out.println("Carpma : " + carpma);
		System.out.println("Bolme : " +  bölme);
		System.out.println("Mod : " + mod);
		toplam++;
		System.out.println(toplam);
		cikarma--; //10-5=5-1=4
		System.out.println(cikarma);
		int sonuc = ++ a+ b--;
		System.out.println(sonuc);
		System.out.println(a);
		System.out.println(b);
		
		int sayi1 =10;
		int sayi2 =5;
		
		boolean kosul =(sayi1 / sayi2) == 2;
		System.out.println(kosul);
		
		boolean kosul1 = (sayi1 > sayi2);
		boolean kosul2 = (sayi1 < sayi2);
		
		boolean sonuc2 = kosul1 && kosul2;
		System.out.println(sonuc2);
		
		sonuc2 = kosul1 || kosul2; 
		System.out.println(sonuc2);
		
		String sonuc3 = (kosul1==sonuc2) ? "Dogru" : "Yanlis";
		System.out.println(sonuc3);
		
		sayi1 = sayi2  ;
		System.out.println(sayi1);
		sayi1 += 2;
		System.out.println(sayi1);
		
	}

}

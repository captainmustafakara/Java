
public class StringGleichheit {

	public static void main(String[] args) throws Exception {
        String text1 = "JAVA-IST-TOLL";
        String text2 = "JAVA-IST-TOLL";
        String text3 = "Java-ist-toll";

        boolean gleich12 = text1.equals(text2);
        boolean gleich13 = text1.equals(text3);
        System.out.println("(1.1) Gleich: " + gleich12);
        System.out.println("(1.2) Gleich: " + gleich13);

        boolean b1 = (text1 == text2);
        boolean b2 = (text1 == text3);
        System.out.println("(2.1) Gleich: " + b1);
        System.out.println("(2.2) Gleich: " + b2);

        Float f1 = new Float(Float.NaN);
        Float f2 = new Float(Float.NaN);
        System.out.println(" " + (f1 == f2) + " " + f1.equals(f2) + " " + (Float.NaN == Float.NaN));
    }

}






//boolean b1 gleich = text1.equals(text2);
/* System.out.println("Gleich: " + gleich);
*
*boolean 
*/
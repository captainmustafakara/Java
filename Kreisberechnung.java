
/**
 *
 * @author Günter Kolbe
 * LF11a 1. Tag
 */
import javax.swing.*;

public class Kreisberechnung {

    /**
     * @param args the command line arguments
     * Rheinwerk - Java ile Programlamayı Öğrenin Sayfa 59
     */
    public static void main(String[] args) {
        double radius, umfang, flaeche;
//        radius = 5.0;
        String einheit ,eingabe;
        eingabe = JOptionPane.showInputDialog("Geben Sie den Radius ein");
        radius = Double.parseDouble(eingabe);
        einheit = JOptionPane.showInputDialog("Geben Sie die Maßeinheit ein");
        umfang = 2 * radius * Math.PI;
        flaeche = radius * radius * Math.PI;
        System.out.println("-- Kreisberechnung --");
        System.out.println("PI = " + Math.PI);
        System.out.println("Radius: " + radius + " " + einheit);
        System.out.println("Umfang: " + umfang + " " + einheit);
        System.out.print("Fläche: " + flaeche);
        System.out.println(" " + einheit + '²');
        String ausgabe = "Umfang: " + umfang + einheit + "\nFläche: " + flaeche + einheit + '²';
        JOptionPane.showMessageDialog(null, ausgabe);
    }
    
}

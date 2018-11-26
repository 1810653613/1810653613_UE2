import com.sun.xml.internal.fastinfoset.util.CharArrayString;
import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import javax.swing.*;
import java.nio.charset.Charset;

public class Aufgabe3_1810653613
{
    public static void main(String[] args)
    {
     String eingabe=(JOptionPane.showInputDialog("Geben sie einen double-Wert ein"));
     double alter= Double.parseDouble(eingabe)  ;
      JOptionPane.showMessageDialog(null, alter);
/* bei gültigen Angaben gibt wandelt das programm den String wert in einen double wert um und gibt diesen aus
bei ungültigen jedoch kann der string wert nicht in einen Double wert umgewandelt werden z.b. eingabe "Hallo"
-> exeption in thread.
 */
/* Der Wertebereich sind Fließkommazahlen mit doppelter Genauigkeit  */

        String eingabe2=(JOptionPane.showInputDialog("Geben sie einen int-Wert ein"));
        int alter2= Integer.parseInt(eingabe2)  ;
        JOptionPane.showMessageDialog(null, alter2);
        /* Der Wertebereich sind ganze Zahlen von ca. -2Mrd. bis 2Mrd. */

        String eingabe3=(JOptionPane.showInputDialog("Geben sie einen Boolean-Wert ein"));
        boolean alter3= Boolean.parseBoolean(eingabe3)  ;
        JOptionPane.showMessageDialog(null, alter3);
        /* Der Wertebereich sind Wahrheitswerte true oder false  */

        String eingabe4=(JOptionPane.showInputDialog("Geben sie einen Long-Wert ein"));
        long alter4= Long.parseLong(eingabe4)  ;
        JOptionPane.showMessageDialog(null, alter3);
        /* Der Wertebereich sind ganze Zahlen von -2^63 bis 2^63-1  */

        String eingabe5=(JOptionPane.showInputDialog("Geben sie einen Char-Wert ein"));
        char alter5= eingabe5.charAt(0);
        JOptionPane.showMessageDialog(null, alter5);
        /* Der Wertebereich sind Zeichen/Unicodes  */

        String eingabe6=(JOptionPane.showInputDialog("Geben sie einen Byte-Wert ein"));
        Byte alter6= Byte.parseByte(eingabe6)  ;
        JOptionPane.showMessageDialog(null, alter6);
        /* Der Wertebereich sind ganze Zahlen von -128 bis 127 */

        String eingabe7=(JOptionPane.showInputDialog("Geben sie einen short-Wert ein"));
        Short alter7= Short.parseShort(eingabe7)  ;
        JOptionPane.showMessageDialog(null, alter7);
        /* Der Wertebereich sind ganze Zahlen von -32768 bis 32767  */

        String eingabe8=(JOptionPane.showInputDialog("Geben sie einen float-Wert ein"));
        float alter8= Float.parseFloat(eingabe8)  ;
        JOptionPane.showMessageDialog(null, alter8);
        /* Der Wertebereich sind Fließkommezahlen mit einfacher Genauigkeit */

        String neueeingabe=String.valueOf(alter);
        System.out.println(neueeingabe);


    }
}

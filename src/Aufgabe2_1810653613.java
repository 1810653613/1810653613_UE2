import javax.swing.*;
import java.sql.SQLOutput;

public class Aufgabe2_1810653613 {

    public static void main(String[] args)
    {
        int var1= Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie eine Zahl ein"));
        int var2= Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie eine eine zweite Zahl eine"));
        System.out.println(var1);
        System.out.println(var2);

        if (var1==var2)
        {
            System.out.println("Die Zahlen sind gleich");
        }
        else if (var1>var2)
        {
            System.out.println("Schritte notwendig: " + (var1 - var2));
            while(var2<var1)
            {
            var2++;
            }
            System.out.println("Wert var2: " + var2);

        }
        else
            {
                System.out.println("Schritte notwendig: " + (var2 - var2));
            while(var1<var2)
            {
            var1++;
            }
            System.out.println("Wert var1: "+ var1);
        }




    }
}

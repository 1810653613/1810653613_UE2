import javax.swing.*;

public class Aufgabe5_1810653613
{
    public static void main(String[] args){
        forschleife(20);
        forschleife(300);

        whileschleife(10);
        whileschleife(46);

        nutzerschleife();

    }
    /*Die Methoden können nicht in meiner main geschrieben werden da ich sonst nicht auf diese zugreifen kann, da main schon eine methode ist */
    /*Eine statische Methode ist ein Merkmal der Klasse, nicht der Objekte, die sie erzeugt hat. */

        static void forschleife(int a)
        {
        for(int i=0; i<=a; i++)
        {
            System.out.println("Der Schleifenzähler ist: " +i);
        }
        }

        static void whileschleife(int b) {
            int x=0;

            while (x<=b)
            {
                System.out.println("Der Schleifenzähler ist: " +x);
                x+=2;
            }
        }


        static void nutzerschleife ()
        {
            int var1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie eine Zahl ein"));
            int var2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie eine zweite Zahl ein"));

            int Durchlauf=0;   /* Definieren des Durchlaufszählers */

            for( int y= 0;y<var1;y++)
            {
                System.out.println(y);
                for(int z= 0;z<var2;z++ )
                {
                    Durchlauf++;
                    System.out.println("Das ist der "+ Durchlauf +". Druchlauf der inneren Schleife!");
                }
            }
        }
}

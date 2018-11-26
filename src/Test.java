import javax.swing.*;

public class Test {
    public static void main(String[] args){

        nutzerschleife();

    }

    static void nutzerschleife () {
        int var1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie eine Zahl ein"));
        int var2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben sie eine zweite Zahl ein"));
        int durchlauf=0;

        for (int y = 0; y < var1; y++)
        {
            for (int z = 0; z<=var2; z++)
            {
                durchlauf++;
                System.out.println("Das ist der" + durchlauf + ". Druchlauf der inneren Schleife!");
            }


        }
    }
}

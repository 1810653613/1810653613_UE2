public class Aufgabe4_1810653613
{
    public static void main(String[] args)
    {
        int i = 0;

        while (i <10  )
        {
            i++;
            System.out.println("Der Schleifenzähler ist: " + i);
        }

        System.out.println("------------------------------------------");

        int x= 1;

        for (; x<10; x++)
        {
            System.out.println("Der Schleifenzähler ist: " +x);
        }
        System.out.println("Der Schleifenzähler ist: " +x);

        System.out.println("------------------------------------------");

        int y=0;

        do {
            y++;
            System.out.println("Der Schleifenzähler ist: " +y);
        }while(y<10);

        System.out.println("------------------------------------------");
    }
}

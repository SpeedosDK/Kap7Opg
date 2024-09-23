import java.util.Scanner;

public class Kap7Opg5
{
    public static void main(String[] args)
    {
        String[] names;

        names = new String[5];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < names.length; i++)
        {
            System.out.println("Skriv navn" + i);
            names[i] = input.nextLine();
        }

        int antalNavn = 0;
        for (int i = 0; i < names.length; i++)
        {
            System.out.println("Navn " + antalNavn);
            System.out.println(names[i]);
            antalNavn++;
        }

        int overFive = overFive(names);

        System.out.println("Så mange er over 5 eller over bogstaver:  " + overFive);
    }

    public static int overFive(String[] names)
    {
        int count = 0;
        for (int i = 0; i < names.length; i++)
        {
            if (names[i].length() >= 5)
            {
                count++;
            }
        }
        return count;
    }
}

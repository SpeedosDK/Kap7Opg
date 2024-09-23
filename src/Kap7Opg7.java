import java.util.ArrayList;

public class Kap7Opg7
{
    public static void main(String[] args)
    {
        //ArrayList<Integer> numbers = new ArrayList<>();
        int numbers[] = {2, 5, 6, 7, 3};
        int[] number;
        number = new int[2];

          number = evenNumbers(numbers, numbers.length);

        System.out.println("2222" + number.length);
        for (int i = 0; i < number.length; i++)
        {
            System.out.println("tal" + number[i]);
            System.out.println();
        }






    }

    public static int[] evenNumbers(int[] numbers, int length)
    {

        //int[] result = new int[numbers.length];
        int count = 0;

        for (int i = 0; i < length; i++)
        {
            if (numbers[i] % 2 == 0)
            {
                count++;

            }
        }
        System.out.println(count);
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < length; i++)
        {
            if (numbers[i] % 2 == 0)
            {
                result[index++] = numbers[i];
                System.out.println("boawraf " + result[i]);
            }
        }
        System.out.println("22223" + result.length);
        return result;


    }
}

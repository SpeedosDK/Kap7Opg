import java.util.Arrays;
import java.util.Scanner;

public class Kap7Opg1B
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[] numbers;
        numbers = new int[5];
        int sum = 0;

        //numbers = new int[0];

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Indtast tal");
            numbers[i] = input.nextInt();
            sum+=numbers[i];

        }
        System.out.println(sum);
        double average = sum / numbers.length;
        System.out.println(average);
        System.out.println(Arrays.stream(numbers).max().getAsInt());
        System.out.println(Arrays.stream(numbers).min().getAsInt());







    }
}

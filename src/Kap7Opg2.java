import java.util.Arrays;

public class Kap7Opg2
{
    public static void main(String[] args)
    {
        double numbers[] = {2, 4, 6, 4};
        double number = Average(numbers, numbers.length);
        System.out.println(number);
        double number1 = lowNumber(numbers, numbers.length);
        System.out.println("Det laveste tal er");
        System.out.println(number1);
        double number2 = maxNumber(numbers, numbers.length);
        System.out.println("Det største tal er");
        System.out.println(number2);
    }



    public static double Average(double[] heltal, int tal)
    {
        double sum = 0;
        for (int i = 0; i < heltal.length; i++)
        {
            sum += heltal[i];
        }
        sum = sum / heltal.length;
        return sum;

        //int[] result = new int[heltal.length];
    }

    public static double lowNumber(double[] heltal, int tal)
    {
        double low = Arrays.stream(heltal).min().getAsDouble();

        return low;
    }
    public static double maxNumber(double[] heltal, int tal)
    {
        double max = Arrays.stream(heltal).max().getAsDouble();

        return max;
    }
}

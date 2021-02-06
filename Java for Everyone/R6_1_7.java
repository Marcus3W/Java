import java.util.Arrays;

/** Write code that fills an array values with each set of numbers below.
 *  0 1 2 3 4 0 1 2 3 4
 *
 */

public class R6_1_7 {

    public static void main (String[] args)
    {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++)
        {
            array[i] = i % 5;
        }

        System.out.println(Arrays.toString(array));
    }
}

import java.util.Arrays;

/** Write code that fills an array values with each set of numbers below.
 *  1 4 9 16 25 36 49 64 81 100
 */

public class R6_1_3 {

    public static void main (String[] args)
    {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++)
        {
            int k = i + 1;        // ensure it starts from 1 instead of zero
            array[i] = k * k;
        }
        
        System.out.println(Arrays.toString(array));
    }
}

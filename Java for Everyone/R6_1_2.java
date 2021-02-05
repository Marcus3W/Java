import java.util.Arrays;

/** Write code that fills an array values with each set of numbers below.
 *  0 2 4 6 8 10 12 14 16 18 20
 */

public class R6_1_2 {

    public static void main (String[] args)
    {
        int[] array = new int[11];
        
        for (int i = 0; i < array.length; i++)
            array[i] = i * 2;

        System.out.println(Arrays.toString(array));
    }
}

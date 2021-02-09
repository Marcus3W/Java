import java.util.Arrays;

/** Rewrite the following loops, using the enhanced for loop construct. Here, values is an array of floating-point numbers.
 *  1. for (int i = 0; i < values.length; i++) { total = total + values[i]; }
 *  2. for (int i = 1; i < values.length; i++) { total = total + values[i]; }
 *  3. for (int i = 0; i < values.length; i++)
 *      {
 *         if (values[i] == target) { return i; }
 *      }
 */

public class R6_9 {

    public static void main(String[] args)
    {
            // Set up initial array
            double[] array = { 20, 22.5, 30.5, 36.1, 2.0 };
            System.out.println(("Original Array: ") + (Arrays.toString(array)));

        System.out.print("\n" + "Part 1 - Total of the array is: " + total( array ));
        System.out.print("\n" + "Part 2 - Total of the array is: " + total_plus_1( array ));
        System.out.print("\n" + "Part 3 - Index of target number is: " + find_target( array, 22.5 ));
    }

    // Part 1 - for (int i = 0; i < values.length; i++) { total = total + values[i]; }
    public static double total(double[] array)
    {
        double total = 0;
        for (double x : array)
        {
            total += x;
        }
        return total;
    }

    // Part 2 - for (int i = 1; i < values.length; i++) { total = total + values[i]; }
    public static double total_plus_1(double[] array)
    {
        double total = 0;
        int i = 0;
        for (double x : array)
        {
            total += x;
            if( i == 0 ) total = total - x;
            i++;
        }
        return total;
    }

    //Part 3 - for (int i = 0; i < values.length; i++)
    public static Integer find_target(double[] array, double target)
    {
        int i = 0;
        for (double x : array)
        {
            if (x == target)
            {
                return i;
            }
            i++;
        }
        return null;
    }
}

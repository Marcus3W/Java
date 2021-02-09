import java.util.Arrays;

/** Rewrite the following loops without using the enhanced for loop construct.
 *  Here, values is an array of floating-point numbers.
 *  1. for (double x : values) { total = total + x; }
 *  2. for (double x : values) { if (x == target) { return true; } }
 *  3. int i = 0;
 *     for (double x : values) { values[i] = 2 * x; i++; }
 */

public class R6_8 {
    public static void main(String[] args)
    {
        // Set up initial array
        double[] array = { 20, 22.5, 30.5, 36.1, 2.0 };
        System.out.println(("Original Array: ") + (Arrays.toString(array)));

        System.out.print("\n" + "Part 1 - Total of the array is: " + total( array ));
        System.out.print("\n" + "Part 2 - Was target in array? " + findTarget( array, 22.5));
        System.out.print("\n" + "Part 3 - " + (Arrays.toString(multiple_element_by_factor( array, 5))));
    }

    // Part 1 - for (double x : values) { total = total + x;
    public static double total(double[] array)
    {
        double total = 0;
        for (int i = 0; i < array.length; i++) {
            double x = array[i];
            total += x;
        }
       return total;
    }

    // Part 2 - for (double x : values) { if (x == target) { return true; } }
    public static boolean findTarget(double[] array, double target)
    {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }

    // Part 3 - int i = 0;
    //          for (double x : values) { values[i] = 2 * x; i++; }
    public static double[] multiple_element_by_factor (double[] array, double factor)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = 2 * factor;
        }
        return array;
    }
}

import java.util.Arrays;

/** Chapter 6.3 - COMMON ARRAY ALGORITHMS
 *
 * Work in progress..........
 *
 */

public class Chapter6_3 {

    public static void main(String[] args)
    {
        // Set up initial array
        int[] array = {20, 22, 30, 36, 2};
        System.out.println(("Original Array: ") + (Arrays.toString(array)));

        System.out.print("\n" + "Filling array with Squares: " + (Arrays.toString(filling(array))) + "... etc");
        System.out.print("\n" + "Get total and return average: " + (sum_and_average(array)));

    }
        /* 6.3.1 - FILLING
        * This loop fills an array with squares (0, 1, 4, 9, 16,…).
        * Note that the element with index 0 contains 0^2, the element with index 1 contains 1^2, and so on.
        */
        public static int[] filling(int[] array)
        {
            for (int i = 0; i < array.length; i++) {
                array[i] = i * i;
            }
            return array;
        }

        /* 6.3.2 SUM AND AVERAGE VALUE
        */
        public static double sum_and_average(int[] array) {

            double total = 0;
            for (double element : array) {
                total = total + element;
            }

            double average = 0;
            if (array.length > 0) {
                average = total / array.length;
            }
            return average;
        }



        
}

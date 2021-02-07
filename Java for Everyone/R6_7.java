import java.util.Arrays;

/** Write enhanced for loops for the following tasks.
 *  Part 1 - Printing all elements of an array in a single row, separated by spaces.
 *  Part 2 - Computing the product of all elements in an array.
 *  Part 3 - Counting how many elements in an array are negative.
 */

public class R6_7 {

    public static void main(String[] args)
    {
        // Set up initial array
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100 + 1);
        }
        System.out.println(("Original Array: ") + (Arrays.toString(array)));


        // Part 1 - Printing all elements of an array in a single row, separated by spaces.
        System.out.print("\n" + "Print all elements of the array on a single line: ");
        for (int element : array )
        {
            System.out.print(element + " ");
        }


        // Part 2 - Computing the product of all elements in an array.
        int total = 0;
        for (int element : array )
        {
            total += element;
        }
        System.out.print("\n" + "Total of array: " + total);


        // Part 3 - Counting how many elements in an array are negative.
        int[] neg_array = { -1 , 1, 2, 0, -5 };
        int count = 0;
        for (int element : neg_array )
        {
            if ( element < 0 )
            {
                count++;
            }
        }
        System.out.print("\n" + "Number of negative elements: " + count);
    }
}

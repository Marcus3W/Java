import java.util.Arrays;

/*Write a program that initializes an array with ten random integers and then prints four lines of output, containing;
•    Every element at an even index.
•    Every even element.
•    All elements in reverse order.
•    Only the first and last element.*/

public class P6_1
{
    public static void main(String[] args) {

        // Set up initial array
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100 + 1);
        }
        System.out.println(("Original Array: ") + (Arrays.toString(array)));

        // Print even index elements
        System.out.println("\n" + "Every even index element");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("");

        // Print even elements
        System.out.println("\n" + "Every even element");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("");

        // Print elements in reverse order
        System.out.println("\n" + "All elements in reverse order");
        for (int i = array.length - 1 ; i > -1 ; i--)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        // Print only the first and last elements
        System.out.println("\n" + "Only the first and last elements");
        {
            System.out.print(array[0] + " ");
            System.out.print(array[array.length - 1] + " ");
        }
        System.out.println("");
        
    }
}

package Week1_labs;

import java.util.ArrayList;
import java.util.Scanner;

public class week2 {

    /**
     * QUESTION 1 - Computes the sum of two arguments.
     * Do the assignments made in the method body have side effects in the main program?
     *
     * ANSWER = the input of x and y is meaningless as once they are in the method 'sum' they are simple overridden.
     * The return of 'sum' will ALWAYS be 11.
     *
     * @param a an int operand to be added
     * @param b another int operand
     * @return the sum of a and b
     */
    public static int sum(int a, int b) {
        a = 5;
        b = 6;
        return a + b;
    }

    
    /**
     * QUESTIONS 2 - Calculate the area of a rectangle
     *
     * @param length an int to be added
     * @param width an int to be added
     * @return the sum of length and width (the area)
     */
    public static double areaOfRectangle(double length, double width) {
        return (length * width);
    }

    
    /**
     * QUESTION 3 - Credit card number validation
     * Notes -
     * if digit odd = return digit
     * if digit even = double it. if result is < 10 return it - else, add two digits in number and return sum
     *
     * @param number individual number of the card to be 'checked'
     * @param position whether the index of the card number is odd or even (true = even position, false = odd position)
     * @return number after it has been decoded
     */
    public static int decode(int number, boolean position) {
        // if the position is odd
        if (!position) {
            return number;
        }
        // if the position is even and less that 10 after doubling
        int sum = number + number;
        if (sum < 10) {
            return sum;
        }
        // if the position is even and more than 10 after doubling
        return (sum / 10) + (sum % 10);
    }
    /**
     * QUESTION 4 - check card number that is passed. Reuse Q3 decode method
     *
     * @param num the full card number
     * @return whether the card number is valid or invalid
     */
    public static String checkDigits(int num) {
        // get card number length
        int card_length = getCardNumberLength(num);

        int sum = 0;
        int result;
        boolean check;

        for (int i= 1; i <= card_length; i++) {
            check = i % 2 == 0; // check if true or false (even or odd)
            result = decode((num % 10), check); // get number from decode check
            num = num / 10; // remove last digit from card number
            sum += result; // add result to total
        }
        // if the result modulo 2 equals zero - return valid, else invalid
        if (sum % 2 == 0){
            return "valid";
        }
        return "Invalid";
    }
    /**
     * QUESTION 3 & 4 Auxiliary function to get the length of the card number.
     *
     * @param cardNumber takes the full card number
     * @return the length of the card number
     */
    public static int getCardNumberLength(int cardNumber) {
        int card_length = 0;
        while (cardNumber > 0) { cardNumber /= 10; card_length++; }
        return card_length;
    }

    
    /**
     * QUESTION 5 - Perform a series of tasks
     *
     * (a) Create an array x of doubles with an initializer list (see also the code for Question 6) that contains the following values: 8, 4, 5, 21, 7, 9, 18, 2, and 100.
     * (b) Print the number of items in the array by using an expression of the form x.length.
     * (c) Print the first array item, x[0].
     * (d) Print the last array item. Be careful to choose the right index.
     * (e) Print the expression x[x.length - 1].
     * (f) Use a standard for loop to print all the values in the array without labels.
     * (g) Use a standard for loop to print all the values in the array with labels ("x[0]", "x[1]", . . . ) to indicate what each element is.
     * (h) Use a standard for loop to print all the values in the array in reverse order with labels to indicate what each element is.
     * (i) Use an enhanced for loop to print all the values in the array without labels.
     */
    public static void questionFive() {
        double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};   //a)
        System.out.println(x.length);                   //b)
        System.out.println(x[0]);                       //c)
        System.out.println(x[x.length-1]);              //d)
        System.out.println(x[x.length-1]); ;            //e)
        for (int i = 0; i < x.length; i++) {            //f)
            System.out.println(x[i] + ", ");
        }
        for (int i = 0; i < x.length; i++) {            //g)
            System.out.println("x["+i+"] = " + x[i]);
        }
        for (int i = x.length-1; i >= 0; i--) {         //h)
            System.out.println("x["+i+"] = " + x[i]);
        }
        for (double element : x) {
            System.out.println(element);
        }
    }

    
    /**
     * QUESTION 6 - Move the the elements of an array to the left 'n' places
     *
     * @param n integer to rotate array digits by
     * @param x array of doubles
     * @return array with elements moved 'n' positions left
     */
    public static double[] rotate(double[] x, int n) {
        double[] arr2 = new double[x.length];   // Create new array
        boolean flag = false;                   // set flag to false to escape inner loop

        for (int i = 0; i <= n; i++) {          // loop 'n' number of times
            if ( !flag ) {                      // add elements to new array from 'n' minus the length of the array
                for (int j = 0; j < x.length-n; j++) {
                    arr2[j] = x[j+n];
                }
                flag = true;                    // once actioned '6' times (n - array length) - leave loop.
            }
            arr2[x.length-(n-i)] = x[i];        // Re-add the first 3 elements to the end
        }
        return arr2;
    }

    
    /**
     * QUESTION 7 - SEE NEW CLASS CustomerLister
     *
     * package Week1_labs;
     *
     * import java.util.Arrays;
     *
     * public class CustomerLister {
     *
     *     public static void main(String[] args) {
     *         String[] customerName = new String[5];
     *         customerName[0] = "Cathy";
     *         customerName[1] = "Ben";
     *         customerName[2] = "Jorge";
     *         customerName[3] = "Wanda";
     *         customerName[4] = "Freddie";
     *         System.out.println(Arrays.toString(customerName));
     *     }
     * }
     */

    
    /**
     * QUESTION 8 - SEE NEW CLASS ArrayListRunner
     */
    public static void ArrayListRunner() {
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Original array: " + names);
        // a)
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        System.out.println("a) Add names: " + names);
        // b)
        System.out.println("b) First name: " + names.get(0)
                + " & Second name : " + names.get(7));
        // c)
        System.out.println("c) Size of array: " + names.size());
        // d)
        System.out.println("d) Last name using .size(): " +  names.get(names.size()-1));
        // e)
        names.set(0, "Anna");
        System.out.println("e) Replaced Alice with Anna. Print name[0]: " + names.get(0));
        // f)  array_name.add(index, String)
        names.add(4, "Doug");
        System.out.println("f) Added Doug after David - this inserts a new name: " + names.get(4));
        // g)
        System.out.println("g) Enhanced for loop print all names: ");
        for (String name : names) {
            System.out.println("-- " + name);
        }
        // h)
        ArrayList<String> names2 = new ArrayList<>(names);
        System.out.println("h) Create new array from first array: " + names2);
        // i) .remove
        System.out.println("i) Remove Anna (name(0)) from the array: ");
        names.remove(0);
        System.out.println("Print names: " + names);
        System.out.println("Print names2: " + names2);
    }

    
    /**
     * QUESTION 9 - Write a program to:
     * (a) number of items entered before -1,
     * (b) the average of the input numbers,
     * (c) the standard deviation of the even numbers,
     * (d) the sum of the odd numbers.
     */
    public static void question9() {
        int sum = 0;
        int element = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (element != -1) {
            System.out.println("Enter a positive integers, enter -1 to quit:");
            while (in.hasNext()) {
                element = in.nextInt();
                if (element == -1) {
                    break;
                }
                numbers.add(element);
                sum += element;
            }
        }
        // GET ODD & EVEN ARRAYS
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evens.add(num);
            } else
                { odds.add(num);
            }
        }
        // PRINT STATEMENTS
        for (int num : numbers) {
            System.out.println("Entered number: " + num);
        }
        System.out.println("# of items: " + numbers.size());
        System.out.println("Average: " + sum / numbers.size());
        System.out.println("Standard deviation of even numbers: +" + calculateStandardDeviation(evens));
        System.out.println("Sum of odd numbers: " + sumOfOdds(odds));
    }
    /**
     * QUESTION 9 - AUXILIARY FUNCTION #1
     * Calculate the sum of all odd elements in the Array
     * @param oddNumbers Array of odd elements only
     * @return sum of odd elements
     */
    public static int sumOfOdds(ArrayList<Integer> oddNumbers) {
        int sum = 0;
        for (int num : oddNumbers) {
            sum += num;
        }
        return sum;
    }
    /**
     * QUESTION 9 - AUXILIARY FUNCTION #2
     * Calculate the standard deviation of the EVEN elements of the array only
     * @param evenNumbers Array of even elements only
     * @return standard deviation
     */
    public static double calculateStandardDeviation(ArrayList<Integer> evenNumbers) {
        double sum = 0.0;
        double standardDeviation = 0.0;
        int length = evenNumbers.size();

        for (double num : evenNumbers) {
                sum += num;
        }
        double mean = sum/length;

        for (double num : evenNumbers) {
                standardDeviation += Math.pow(num - mean, 2);
        }
        return Math.sqrt(standardDeviation/length);
    }


    
    
    public static void main(String[] args) {

        /* Q1
        int x = 100000;
        int y = 3;
        System.out.println("x: " + x + " y: " + y + " Sum: " + sum(x, y));
        */

        /* Q2
        double length = 3.4;
        double width = 8.4;
        System.out.println("Area of the rectangle with a length of "
                + length +" and width of "
                + width + " is: "
                + areaOfRectangle(length, width)); //Q2
        */

        /*Q3 & 4
        int num = 2315778;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        num = 1234567;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        num = 7654321;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        num = 1111111;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        */

        /* QUESTION 5
        questionFive();
         */

        /* QUESTION 6
                double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
                System.out.println("Before rotation: ==============================");
                for (int i = 0; i < x.length; i++) {
                    System.out.println("x[" + i + "]: " + x[i]);
                }
                x = rotate(x, 3);
                System.out.println("After rotation: ==============================");
                for (int i = 0; i < x.length; i++) {
                    System.out.println("x[" + i + "]: " + x[i]);
                }
        // should print { 21, 7, 9, 18, 2, 100, 8, 4, 5 };
        */

        /* QUESTION 7 - SEE NEW CLASS CustomerLister  */

        /* QUESTION 8
        ArrayListRunner();
        */

        /* QUESTION 9
        question9();
         */
    }
}

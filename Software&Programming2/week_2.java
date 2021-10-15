package Week1_labs;

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


    }



}

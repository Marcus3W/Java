package Week1_labs;

import java.util.*;

public class week1 {

    /**
     * QUESTION 3
     * Execute the program shown below. Each invocation of println outputs the result of an arithmetic expression.
     * The first two println commands are followed by comments that describe the operations that occur in each expression.
     * Complete the program by adding a comment after each println statement that describes all the arithmetic -
     * - operations that occur when evaluating the expression that is printed.
     */
    public static void expressions() {
        int a = 3;
        int b = 4;
        int c = 5;
        int d = 17;
        System.out.println((a + b) / c);
        // 3 and 4 are added with sum 7
        // 7 is divided by 5 with quotient 1
        System.out.println(a + b / c);
        // 4 is divided by 5 with quotient 0
        // 3 is added to 0 with sum 3
        System.out.println(a + 1);
        // 1 + a (a=3)
        // Answer is 4
        System.out.println(d % c);
        // d mod c (17 mod 5)
        // Answer is 2
        System.out.println(d / c);
        // d divided c (17 / 5)
        // Answer is 3
        System.out.println(d % b);
        // d mod c (17 mod 4)
        // Answer is 1
        System.out.println(d / b);
        // d divided c (17 / 4)
        // Answer is 4
        System.out.println(d + a / d + b);
        // a divided by d, then left to right, a + answer + b
        // (17 + (3 / 17) + 4) = 21.176
        // Answer is 21.176
        System.out.println((d + a) / (d + b));
        // a divided by d, a + answer + b
        // (17 + 3) / (17 + 4) = 20 / 21 = 0.95
        // Answer is 0.95
        System.out.println(Math.sqrt(b));
        // Squared root of 4
        // Answer is 2
        System.out.println(Math.pow(a, b));
        // a to the power b ( 3^4 )
        // Answer is 81
        System.out.println(Math.abs(-a));
        // abs makes a number positive -3 = 3
        // Answer is 3
        System.out.println(Math.max(a, b));
        // Find the max of two numbers = 3 or 4
        // Answer is 4
    }
    /**
     * QUESTION 4
     * Write a program that prompts the user to enter two integers.
     * Print the smaller of the two numbers entered. You'll need to use a Scanner and a Math method.
     */
    public static void printSmallest() {
        int largest;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        while (in.hasNextInt()) {
            int first = in.nextInt();
            int second = in.nextInt();
            if (first > second) {
                largest = first;
            }
            else {
                largest = second;
            }
            System.out.println("Largest is " + largest);
        }
    }
    /**
     * QUESTION 5
     * Use the first approach to increment x in the program below. Print the value of x after incrementing.
     * Use the ++ operator to increment y in the program below. Print the value of y after incrementing.
     */
    public static void incrementDemo() {
        int x = 10;
        int y = -3;
        x++;
        System.out.println(x);
        y++;
        System.out.println(y);
    }
    /**
     * QUESTION 6
     * What is the output of the following program and why?
     * Output = 147 / 4 = 36.75 = Therefore 36.0 is the output as it is a DOUBLE, but still rounds down
     */
    public static void AverageCalculator() {
        int age1 = 18;
        int age2 = 35;
        int age3 = 50;
        int age4 = 44;
        double averageAge = (age1 + age2 + age3 + age4) / 4;
        System.out.println(averageAge);
    }
    /**
     * QUESTION 7
     * Fix the program in the previous question so that it yields the correct result.
     * Make all the variables doubles means it will give the whole figure including decimals
     */
    public static void AverageCalculatorFixed() { // change all variables to double from int
        double age1 = 18;
        double age2 = 35;
        double age3 = 50;
        double age4 = 44;
        double averageAge = (age1 + age2 + age3 + age4) / 4;
        System.out.println(averageAge);
    }
    /**
     * QUESTION 8
     * What is the output of the following program and why?
     * It prints 869 - which is incorrect as we expect 870. This a rounding error from double to int's
     */
    public static void PercentagePrinter() {
        double rate = 8.70;
        int percentage = (int) (100 * rate);
        System.out.println(percentage);
    }
    /**
     * QUESTION 9
     * Fix the program from the previous question so that it displays the correct result.
     * Remember that you can use Math.round to convert a floating-point value to its closest integer
     */
    public static void PercentagePrinterFixed() {
        double rate = 8.70;
        int percentage = (int) (Math.round(100 * rate)); // Math.round fixes this
        System.out.println(percentage);
    }
    /**
     * QUESTION 10
     * The if statement is used to implement a decision. The simplest form of an if statement has two parts:
     * a condition and a body. If the condition is true, the body of the statement is executed.
     * The body of the if statement consists of a statement block.
     *
     *     How many * will be printed when the code is executed
     *             (a) with n = 6? ******
     *             (b) with n = 20? ***************
     *             (c) with n = 2? ***
     *             (d) with n = -1? *
     */
     public static void question10 () {
         int n = -1;
         if (n > 10) System.out.print("*****");
         if (n > 7) System.out.print("****");
         if (n > 4) System.out.print("***");
         if (n > 1) System.out.print("**");
         System.out.println("*");
     }
    /**
     * QUESTION 11
     * An alternate form for an if statement has multiple parts: a condition that evaluates to true or false,
     * a statement that is executed if the condition is true, the word else, and finally a statement that is executed
     * when the condition is false.
     * Each statement can be a simple statement consisting of a single Java instruction, a "complex" statement
     * (such as another if statement), or a compound (or block) statement (matching braces {}
     * that surround one or more Java statements). We suggest using the brace notation in every case.
     *
     * Consider the code below that prompts the user to input a value for x and for y.
     * It then prints the smallest value contained in the variables x and y.
     */
     public static void SmallestInt() {
         Scanner scan = new Scanner(System.in);

         System.out.println("Enter a value for x:");
         int x = scan.nextInt();
         System.out.println("Enter a value for y:");
         int y = scan.nextInt();
         System.out.println("Enter a value for z:");
         int z = scan.nextInt();

         if (x <= y && x <= z) {
             System.out.println("The smallest value was " + x);
         }
         else if (y <= z) {
            System.out.println("The smallest value was " + y);
         }
         else {
             System.out.println("The smallest value was " + z);
         }
     }
    /**
     * QUESTION 12
     * The code below is a more efficient solution to the previous problem.
     *
     * Modify the code so that it prompts the user for four integers (w, x, y, and z)
     * and prints the smallest value contained in those variables.
     *
     * How hard would it be to modify the version of the program you wrote in the previous question to solve the four-variable problem?
     */
     public static void SmallestInt2() {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter a value for x:");
         int x = scan.nextInt();
         int smallest = x; // x is the smallest value so far

         System.out.println("Enter a value for y:");
         int y = scan.nextInt();
         if (y < smallest) {
             smallest = y; // Update smallest if necessary
         }
         System.out.println("Enter a value for z:");
         int z = scan.nextInt();
         if (z < smallest) {
             smallest = z; // Update smallest if necessary
         }
         System.out.println("Enter a value for w:");
         int w = scan.nextInt();
         if (w < smallest) {
             smallest = w; // Update smallest if necessary
         }
         System.out.println("The smallest value was " + smallest);
     }
    /**
     * QUESTION 13
     * 'Act first, decide later' strategy

        //original code
        String colour;
        if (x < 10)
            colour = "red";
        else
            colour = "blue";

        // better solution
        String colour = "blue";
        if (x < 10)
            colour = "red";
    */
    /**
     * QUESTION 14
     * The relational operators in Java are ==, !=, <, >, <=, and >=. Assume x and y are integers.
     * Using relational operators, formulate the following conditions in Java:
     *    (a) x is positive           (x > 0)
     *    (b) x is zero or negative   (x <= 0)
     *    (c) x is at least 10        (x >= 10)
     *    (d) x is less than 10       (x < 10)
     *    (e) x and y are both zero   (x == 0 && y == 0)
     *    (f) x is even               (x % 2 == 0)
     */
    public static void relationalOperators() {
        int x = 0;
        int y = 0;
        if ((x > 0)  ||  (x <= 0)  ||  (x >= 10)  ||  (x < 10)  ||  (x == 0 && y == 0)  ||  (x % 2 == 0)) {
            System.out.println("One worked");
        }
    }
    /**
     * QUESTION 15
     * Explain how the program compares the two strings.
     * How can you modify the program so that str2 and str3 are equal when they are compared?
     *
     * THIS IS INCORRECT. You should use .equals otherwise compareTo wants to return an int
     */
    public static void StringEqual() {
        String str1 = "abcd";
        String str2 = "abcdefg";
        String str3 = str1 + "efg";
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        if (str2.equals(str3)) {
            System.out.println("The strings are equal");
        }else{
            System.out.println("The strings are not equal");
        }
    }
    /**
     * QUESTION 16
     *
     * THIS ISN'T WORKING
     *
     * Write a program that prompts the user to enter three strings.
     * Compare the String objects lexicographically (similar to the order in a lexicon) and print the middle-valued string.
     * To compare two String objects lexicographically, you can write s1.compareTo(s2) and get an int value as a result.
     *
     * • If the result is negative, then s1 is smaller.
     * • If the result is positive, then s2 is smaller.
     * • If the result is 0, then s1 and s2 are equal.
     */
    public static void compareStringsLex() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string number 1: ");
        String first = scan.next();
        System.out.println("Enter string number 2: ");
        String second = scan.next();
        System.out.println("Enter string number 3: ");
        String third = scan.next();

        if (first.compareTo(second) <= first.compareTo(third)) {
            System.out.println(first);
        }
        else if (first.compareTo(third) <= second.compareTo(third)) {
            System.out.println(second);
        }
        else {
            System.out.println(third);
        }
    }
    /**
     * QUESTIONS 17
     * Rewrite the previous program using the boolean operator && to simplify the logical structure.
     *
     * THIS ISN'T WORKING
     */
    public static void compareStringsLexReworked() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string number 1: ");
        String first = scan.next();
        System.out.println("Enter string number 2: ");
        String second = scan.next();
        System.out.println("Enter string number 3: ");
        String third = scan.next();

        if ((first.compareTo(second) <= first.compareTo(third)) && ((first.compareTo(second) <= second.compareTo(third)))) {
            System.out.println("Mid =" + second);
        } else if ((first.compareTo(third) <= first.compareTo(second)) && ((first.compareTo(third) >= second.compareTo(third)))) {
            System.out.println("Mid =" + third);
        } else {
            System.out.println("Mid =" + first);
        }
    }
    /**
     * QUESTION 18
     * Fix the indentations and the curly brackets
     */
    public static void badIfs() {
        int x = 9;
        int y = 3;
        int z = 7;

        if (x < y) {
            System.out.println("aaa");
        }
        if (x < z) {
            System.out.println("bbb");
        } else {
            System.out.println("ccc");
        }
        System.out.println("ddd");

        if (y > z) {

            if (z > x) {
                System.out.println("eee");
            } else {
                System.out.println("fff");
            }
        } else {
            System.out.println("ggg");
        }
    }
    /**
     * QUESTION 19
     * According to the following program, what colour results when using the following
     * inputs?
     *    (a) Y N Y   - PURPLE   (Correct)
     *    (b) Y Y N   - YELLOW   (Correct)
     *    (c) N N N   - BLACK    (Correct)
     *
     */
    public static void ColourMixer() {
        {
            String mixture = "";
            boolean red = false;
            boolean green = false;
            boolean blue = false;
            Scanner in = new Scanner(System.in);
            System.out.print("Include red in mixture? (Y/N) ");
            String input = in.next();
            if (input.toUpperCase().equals("Y"))
                red = true;
            System.out.print("Include green in mixture? (Y/N) ");
            input = in.next();
            if (input.toUpperCase().equals("Y"))
                green = true;
            System.out.print("Include blue in mixture? (Y/N) ");
            input = in.next();
            if (input.toUpperCase().equals("Y"))
                blue = true;
            if (!red && !blue && !green)
                mixture = "BLACK";
            else if (!red && !blue)
                mixture = "GREEN";
            else if (red)
                if (green || blue)
                    if (green && blue)
                        mixture = "BLACK";
                    else if (green)
                        mixture = "YELLOW";
                    else
                        mixture = "PURPLE";
                else
                    mixture = "BLACK";
            else if (!green)
                mixture = "BLUE";
            else
                mixture = "WHITE";
            System.out.println("Your mixture is " + mixture);
        }
    }

    /**
     * QUESTION 20
     * Loops provide a mechanism for repeating a block of code called the loop body.
     * Many loops are controlled with a single variable, which we will refer to as the loop control variable or the loop index.
     * Consider the code below. What is the output the program produces?
     *
     * it will print out 0,1,2,3,4,5
     */
    public static void SimpleLoop() {
        int i = 0;
        int limit = 6;
        while (i < limit) {
            System.out.println("i = " + i);
            i++;
        }
    }
    /**
     * QUESTION 21
     * Consider again the code in the previous question. What happens if you comment out the line that increments i?
     *
     * Answer === INFINITE LOOP
     */

    /**
     * QUESTION 22
     * Manipulating the loop control variable is a critical skill in learning to write code with loops.
     * Modify the program in Question 20 so that it produces the following output:
     *
     * i = 6 i = 8 i = 10 i = 12 i = 14 i = 16 i = 18 ... i = 98
     */
    public static void SimpleLoopModified() {
        int i = 6;
        int limit = 99;
        while (i < limit) {
            System.out.println("i = " + i);
            i += 2;
        }
    }
    /**
     * QUESTION 23
     * Write a program that computes the above sum in a while loop and then prints the sum.
     * After you have the program working, rewrite it so you can compute 1 + 2 + ... + n where n is any positive integer.
     *
     */
    public static void sumLoop() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int start = 1;
        int sum = 0;
        while (start <= n) {
            sum = sum + start;
            start++;
        }
        System.out.println("The total sum of the numbers of 1 to " + n + " is " + sum);
    }
    /**
     * QUESTION 24
     * Rewrite the program from Question 23 using a for loop. Repeat the exercise again but this time use a do-while loop.
     *
     */
    public static void sumDoWhileLoop() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int start = 1;
        int sum = 0;
        do  {
            sum = sum + start;
            start++;
        } while (start <= n);

        System.out.println("The total sum of the numbers of 1 to " + n + " is " + sum);
    }
    /**
     * QUESTION 25
     * Write a program that uses a while loop. During each iteration of the loop, prompt the user to enter a number -- positive, negative, or zero.
     * Keep a running total of the numbers the user enters and also keep a count of the number of entries the user makes.
     * The program should stop whenever the user enters "q" to quit
     */
    public static void inputSumWhileLoop() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive, negative integer or zero: ");
        int sum = 0;
        while (in.hasNextInt()) {
            int number = in.nextInt();
            sum += number;
        }
        System.out.println("The sum total of what you entered was: " + sum);
    }
    /**
     * QUESTION 26
     * Use nested 'for loops' to produce the following output:
     * X
     * XX
     * XXX
     * XXXX
     * XXXXX
     */
    public static void forLoopX() {
        for (int i = 0; i < 5; i++) {
            if (i > 0) {
                System.out.println("");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("X");
            }
        }
    }
    /**
     * QUESTION 27
     * Convert the following while loop to a do loop.
     *
     *     public static void PrintSumOG() {
     *         Scanner in = new Scanner(System.in);
     *         int sum = 0;
     *         int n = 1;
     *         while (n != 0) {
     *             System.out.print("Please enter a number, 0 to quit: ");
     *             n = in.nextInt();
     *             if (n != 0) {
     *                 sum = sum + n;
     *                 System.out.println("Sum = " + sum);
     *             }
     *         }
     *     }
     */
    public static void PrintSum() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n = 1;
        do {
            System.out.print("Please enter a number, 0 to quit: ");
            n = in.nextInt();
            if (n != 0) {
                sum += n;
                System.out.println("Sum = " + sum);
            }
        }
        while (n!= 0);
    }
    /**
     * QUESTION 28
     *
     * Is the do loop in the previous question an improvement over the while loop? Why or why not?
     *
     * ANSWER =
     */

    /**
     * QUESTION 29
     *
     * Convert this while loop to a for loop.
     *
     *        public static void CountPowerOf2OG() {
     *             Scanner in = new Scanner(System.in);
     *             System.out.print("Please enter a number, 0 to quit: ");
     *             int n = in.nextInt();
     *             int i = 1;
     *             while (n * n > Math.pow(2, i))
     *                 i++;
     *             System.out.println("2 raised to " + i + " is the first power of two greater than " + n + " squared");
     *         }
     */

    public static void CountPowerOf2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number, 0 to quit: ");
        int n = in.nextInt();
        int answer = 1;

        for (int i = 1; n * n > Math.pow(2, i); i++) {
            answer = i;
        }
        System.out.println("2 raised to " + answer + " is the first power of two greater than " + n + " squared");
    }

    /**
     * QUESTION 30
     *
     * Convert this for loop to a while loop:
     *
     *         public static void forToWhileOG() {
     *         for (int i = 1; i <= 10; i++)
     *             System.out.println(i + " squared equals " + i * i);
     *     }
     */
    public static void forToWhile() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " squared equals " + i * i);
            i++;
        }
    }

    public static void main(String[] args) {
        //incrementDemo(); // Q5
        //AverageCalculator(); // Q6
        //AverageCalculatorFixed(); // Q7
        //PercentagePrinter(); // Q8
        //PercentagePrinterFixed(); // Q9
        //question10(); //Q10
        //SmallestInt(); //Q11
        //SmallestInt2(); //Q12
        //relationalOperators(); //Q14
        //StringEqual(); //Q15
        //compareStringsLex(); //Q16         THIS ISN'T WORKING
        //compareStringsLexReworked(); //Q17   THIS ISN'T WORKING
        //badIfs(); //Q18
        //ColourMixer(); //Q19
        //SimpleLoop(); //Q20
        //SimpleLoopModified(); //Q22
        //sumLoop(); //Q23
        //sumDoWhileLoop(); //Q24
        //inputSumWhileLoop(); //Q25
        //forLoopX(); //Q26
        //PrintSum(); //Q27
        //CountPowerOf2(); //Q29
        //forToWhile();//Q30
    }
}









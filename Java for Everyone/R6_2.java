public class R6_2 {

    public static void main (String[] args)
    {
        /* R6.2.1 */
        int[] a = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
        int total = 0;

            for (int i = 0; i < 10; i++) { total = total + a[i]; }

        System.out.println("R6.2.1 - Total is: " + total); // Answer is 25

        //--------------------------------------------------------------------//

        /* R6.2.2 */
        int[] b = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
        total = 0;

        for (int i = 0; i < 10; i = i + 2) { total = total + b[i]; }

        System.out.println("R6.2.2 - Total is: " + total); // Answer is 13

        //--------------------------------------------------------------------//

        /* R6.2.3 */
        int[] c = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
        total = 0;

        for (int i = 1; i < 10; i = i + 2) { total = total + c[i]; }

        System.out.println("R6.2.3 - Total is: " + total); // Answer is 12

        //--------------------------------------------------------------------//

        /* R6.2.4 */
        int[] d = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
        total = 0;

        for (int i = 2; i <= 10; i++) { total = total + d[i]; }

        System.out.println("R6.2.4 - Total is: " + total); // * Out of Bounds Error *

        //--------------------------------------------------------------------//

        /* R6.2.5 */
        int[] e = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
        total = 0;

        for (int i = 1; i < 10; i = 2 * i) { total = total + e[i]; }

        System.out.println("R6.2.5 - Total is: " + total); // Answer is 11

        //--------------------------------------------------------------------//

        /* R6.2.6 */
        int[] f = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
        total = 0;

        for (int i = 9; i >= 0; i--) { total = total + a[i]; }

        System.out.println("R6.2.6 - Total is: " + total); // Answer is 25

        //--------------------------------------------------------------------//

        /* R6.2.7 */
        int[] g = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
        total = 0;

        for (int i = 9; i >= 0; i = i - 2) { total = total + a[i]; }

        System.out.println("R6.2.7 - Total is: " + total); // Answer is 12

        //--------------------------------------------------------------------//

        /* R6.2.8 */
        int[] h = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0 };
        total = 0;

        for (int i = 0; i < 10; i++) { total = a[i] - total; }

        System.out.println("R6.2.8 - Total is: " + total); // Answer is -1

    }
}


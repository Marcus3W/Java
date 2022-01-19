package Problems;

public class isPalindrome {

    public static boolean isPalindrome(int x) {

        if ( x < 10 ) {
            int last = x % 10;
            int first = x;
            if (last == first) {
                return true;
            }
        }
        x /= 10;
        return isPalindrome(x);

    }

    public static void main(String[] args) {

        int is_a_palindrome = 323;
        int is_NOT_a_palindrome = 122;

        System.out.println(isPalindrome(is_a_palindrome));
        System.out.println(isPalindrome(is_NOT_a_palindrome));



    }


}

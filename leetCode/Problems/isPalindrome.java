package Problems;

public class isPalindrome {

    public static boolean isPalindrome(int x) {
        if (x < 10 && x >= 0) {
            return true;
        }
        if (x < 0) {
            return false;
        }
        int temp = x;
        int reversedNum = 0;
        while (temp > 0) {
            reversedNum = reversedNum * 10 + temp % 10;
            temp /= 10;
        }
        return x == reversedNum;
    }

    public static void main(String[] args) {
        int is_a_palindrome = 121;
        int is_NOT_a_palindrome = 122;
        System.out.println(isPalindrome(is_a_palindrome));
        System.out.println(isPalindrome(is_NOT_a_palindrome));
    }
}

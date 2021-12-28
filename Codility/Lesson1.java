public class Lesson1 {

    public static int solution(int n) {
        String binary = getBinary(n);

        while (binary.length() > 0) {

        }
        return -1;

    }

    public static String getBinary(int n) {
        String s = "";
        while (n > 0) {
            s = ((n % 2) == 0 ? "0" : "1") + s;
            n = n / 2;
        }
        return s;
    }

    public static void main(String[] args) {
        solution(32);
    }
}

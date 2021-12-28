public class Exercise1 {

    public static int solution(String S) {
        int longest = -1;
        String[] seperateWords = S.split(" ");
        if (!S.equals("")) {
            for (String word:seperateWords) {
                if (word.matches("^[a-zA-Z0-9]*$")) {
                    if (word.length() > longest) {
                        longest = word.length();
                    }
                }
            }
        }
        return longest;

    }

    public static void main(String[] args) {

        String S = "test 5 a0A pass007 ?xy1";
        System.out.println(solution(S));

        String S1 = "?@E";
        System.out.println(solution(S1));

    }
}

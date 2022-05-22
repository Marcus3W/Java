package Problems;

public class _14_LongestCommonPreFix {


    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        // should print "fl"
        System.out.println(longestCommonPrefix(strs));
    }


    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        String first = strs[0];

        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(first) != 0) {
                first = first.substring(0, first.length() - 1);

                if (first.isEmpty()) {
                    return "";
                }
            }
        return first;
    }


}

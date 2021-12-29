import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class Lesson1 {
    public static int solution(int n) {
        int finalGap = 0;
        if (n <= 1) {
            return 0;
        }
        char[] binaryRep = Integer.toBinaryString(n).toCharArray();
        int tempGap = 0;
        for (char c : binaryRep) {
            if (c == '0') {
                tempGap++;
            } else if (c == '1') {
                if (tempGap > finalGap) {
                    finalGap = tempGap;
                }
                tempGap = 0;
            }
        }
        return finalGap;
    }

    public static void verifySolution(int pInput, int expectedBinaryGap) {
        Assert.assertEquals(solution(pInput), expectedBinaryGap);
    }

    public static void main(String[] args) {
        verifySolution(0, 0);
        verifySolution(9, 2);
        verifySolution(15, 0);
        verifySolution(32, 0);
        verifySolution(529, 4);
        verifySolution(1041, 5);
        verifySolution(65536, 0);
        verifySolution(65537, 15);
        verifySolution(100000, 4);
        verifySolution(2147483, 5);
        verifySolution(2147483637, 1);
        verifySolution(2147483646, 0);
        verifySolution(2147483647, 0);

    }
}

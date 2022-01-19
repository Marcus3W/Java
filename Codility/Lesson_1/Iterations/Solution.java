package Lesson_1.Iterations;

//import org.testng.Assert;

/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by
 * ones at both ends in the binary representation of N.
 *
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
 * The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
 * The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary
 * representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
 *
 * Write a function:
 * class Solution { public int solution(int N); }
 * that, given a positive integer N, returns the length of its longest binary gap.
 * The function should return 0 if N doesn't contain a binary gap.
 *
 * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001
 * and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary
 * representation '100000' and thus no binary gaps.
 *
 * Write an efficient algorithm for the following assumptions:
 * N is an integer within the range [1..2,147,483,647].
 */
public class Solution {
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
        //Assert.assertEquals(solution(pInput), expectedBinaryGap);
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

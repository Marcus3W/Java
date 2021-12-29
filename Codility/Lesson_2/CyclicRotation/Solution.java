package Lesson_2.CyclicRotation;

import java.util.Arrays;

/**
 * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index,
 * and the last element of the array is moved to the first place.
 *
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]
 * (elements are shifted right by one index and 6 is moved to the first place).
 *
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 *
 * Assume that:
 * N and K are integers within the range [0..100];
 * each element of array A is an integer within the range [−1,000..1,000].
 */
public class Solution {

    public static int[] solution(int[] A, int K) {

        int[] tempArray = new int[A.length];

        // Copy array to new temporary array from K to end
        for (int i = K; i < A.length; i++) {
            tempArray[i] = A[i-K];
        }

        // Fill in start of array to K
        int temp = 0;
        while (K != 0) {
            tempArray[temp] = A[A.length-K];
            temp++;
            K--;
        }
        return tempArray;
    }




    public static void main(String[] args) {

        int[] A = {3,8,9,7,5};
        //System.out.println(solution(A, 1));
        //System.out.println(Arrays.toString(solution(A, 2)));
        //System.out.println(Arrays.toString(solution(A, 4)));

    }

}
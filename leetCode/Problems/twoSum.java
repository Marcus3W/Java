package Problems;

import java.util.Arrays;

public class twoSum {

    public static int[] twoSum(int[] nums, int target) {

        int[] newArr = new int[2];

        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    newArr[0] = i;
                    newArr[1] = j;
                    break;
                }
            }
        }
        return newArr;
    }


    public static void main(String[] args) {

        int[] arrayTest1 = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arrayTest1, target)));

    }
}

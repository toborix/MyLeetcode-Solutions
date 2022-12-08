package Levels.Easy.SquaresOfSortedArray;

import java.util.Arrays;

public class SquaresOfAsortedArray {
    public int[] sortedSquares(int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;

    }

    public static void main(String[] args) {
        SquaresOfAsortedArray sqr = new SquaresOfAsortedArray();
        System.out.println(Arrays.toString(sqr.sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }

}

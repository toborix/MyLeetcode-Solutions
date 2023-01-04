package Matvey_Solutions.Levels.Easy.LargestNumberAtLeastTwice;

import java.util.Arrays;

public class Solution_1 {
    public int dominantIndex(int[] nums){
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }
        for (int i = 0; i < nums.length ; i++) {
            if(maxIndex != i && nums[maxIndex] < 2 * nums[i]) return -1;
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        Solution_1 sol = new Solution_1();
        System.out.println(sol.dominantIndex(new int[]{0,0,0,3}));
        System.out.println(sol.dominantIndex(new int[]{1,2,3,4}));
        System.out.println(sol.dominantIndex(new int[]{3,6,1,0}));
    }
}

package Matvey_Solutions.Levels.Hard.MaximumGap_164;

import java.util.Arrays;

public class Solution_1 {
    public int maximumGap(int[] nums) {
        int max = Integer.MIN_VALUE;
        if(nums.length<2)
        {
            return 0;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i+1] - nums[i] > max){
                max = nums[i+1] - nums[i];
            }

        }
        return max;
    }
}

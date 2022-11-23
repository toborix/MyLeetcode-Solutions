package Levels.Easy.TwoSum;
/**
 * Решение с выводом значения, а не идекса
 */

/*
Example_1:
                   0,1,2,3
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example_2:

    Input: nums = [3,2,4], target = 6
    Output: [1,2]


    [1,2,3,5,2]     target = 8


Example_3:

    Input: nums = [3,3], target = 6
    Output: [0,1]
 */

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target){
        Arrays.sort(nums);
        int left = 0; // first element of array
        int right = nums.length - 1; // last element of array
        while(left < right)
        {
            if(nums[left] + nums[right] == target){
                return new int[]{nums[left], nums[right]};
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else{
                right--;
            }

        }
        return new int[]{};
    }
    }



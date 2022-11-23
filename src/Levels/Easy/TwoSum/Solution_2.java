package Levels.Easy.TwoSum;
/**
 * Решение с выводом массива индексов,
 * котоыре дают сумму значений соотвестивующих target
 */

public class Solution_2 {
    public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length ; i++) {
            for (int j = nums.length - 1 ; j > 0; j--) {
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }

            }

        }
        return nums;
    }
}

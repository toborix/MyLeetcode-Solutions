package Matvey_Solutions.Levels.Medium.MaxConsecutiveOnesII;

public class Solution_1 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        int current = 0;
        for(int i = 0; i < nums.length; i++){
            count++;
            if(nums[i] == 0){
                current = count;
                count = 0;
            }
            maxCount = Math.max(maxCount, count + current);
        }
        return maxCount;
    }
}

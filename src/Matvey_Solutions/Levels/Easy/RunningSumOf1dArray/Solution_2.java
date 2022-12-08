package Matvey_Solutions.Levels.Easy.RunningSumOf1dArray;

public class Solution_2 {
    public int[] runningSum(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];

        }
        return nums;
    }

    public static void main(String[] args) {
        Solution_2 sol = new Solution_2();
        System.out.println(sol.runningSum(new int[]{3,1,2,10,1}));
    }
}

package Matvey_Solutions.Levels.Easy.FindPivotIndex;

public class Solution_1 {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int left_sum = 0;

        for (int x: nums) {
            sum += x ;
        }
        for (int i = 0; i < nums.length; i++) {
            if(left_sum == sum - left_sum - nums[i]){
                return i;
            }
            left_sum += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution_1 sol = new Solution_1();
        System.out.println(sol.pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}

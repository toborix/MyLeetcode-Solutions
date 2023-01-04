package Matvey_Solutions.Levels.Medium.MaxConsecutiveOnesIII;

public class Solution_1 {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right;
//        Если ноль включаеться, мы уменьшаем значение k
//        Потому что k - максимальное кол-во нулей
        for (right = 0; right < nums.length; right++) {
            if(nums[right] == 0){
                k--;
            }
            if (k < 0) {
                k += 1 - nums[left];
                left++;
            }

        }
        return right - left;
    }
}

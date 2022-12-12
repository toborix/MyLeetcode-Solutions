package Matvey_Solutions.Levels.Easy.SortArrayByParity;

public class Solution_1 {
    public int[] sortArrayByParity(int[] nums){
        int[] new_array = new int[nums.length];
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                new_array[counter++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] % 2 == 1){
                new_array[counter++] = nums[i];
            }

        }
        return new_array;
    }

//    Time complexity: O(n)
//    Space complexity: O(n)

}

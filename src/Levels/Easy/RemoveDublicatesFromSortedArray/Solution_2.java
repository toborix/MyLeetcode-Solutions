package Levels.Easy.RemoveDublicatesFromSortedArray;

public class Solution_2 {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;

        if (size == 0 || size == 1){
            return size;
        }
        int[] temp = new int[size];
        int j = 0;

        for (int i = 0; i < size - 1; i++) {
            if (nums[i] != nums[i+1]){
                temp[j++] = nums[i];
            }

        }
        temp[j++] = nums[size - 1];
        for (int i = 0; i < j; i++) {
            nums[i] = temp[i];
        }
        return j;

    }

}


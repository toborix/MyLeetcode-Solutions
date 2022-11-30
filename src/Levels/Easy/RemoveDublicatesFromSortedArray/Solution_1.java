package Levels.Easy.RemoveDublicatesFromSortedArray;

// NOT WORKING!!!

public class Solution_1 {
    public int removeDuplicates(int[] nums){
        int size = nums.length;
        int maxElInArray = 0;

        for (int i = 0; i < size; i++) {
            maxElInArray = Math.max(maxElInArray, nums[i]);

        }
        int[] frec_array = new int[maxElInArray + 1];

        for (int i = 0; i < size; i++) {
            System.out.println(frec_array[nums[i]]++);
        }
        int i;
        for ( i = 0  ; i < maxElInArray + 1; i++) {
            if(frec_array[i] > 1){
                return i;
            }
        }



        return i;
    }

    public static void main(String[] args) {
        Solution_1 solution = new Solution_1();
        solution.removeDuplicates(new int[]{1, 1, 2});
    }
}

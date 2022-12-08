package Matvey_Solutions.Levels.Easy.SearchInsertPosition;

public class Solution_1 {
    public int searchInsert(int[] nums, int target){
        int sizeOfArray = nums.length;

        for (int i = 0; i < sizeOfArray; i++)
        {
            if(nums[i] == target)
            {
                return i;

            }

            // если target элемент меньше элемента nums[i]
            // то верни индекс этого элемента;
            else if(target < nums[i]){
                return i;
            }

        }

        return sizeOfArray;
    }

    public static void main(String[] args) {
        Solution_1 sol = new Solution_1();
        System.out.println(sol.searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println(sol.searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(sol.searchInsert(new int[]{1,3,5,6}, 7));
    }
}

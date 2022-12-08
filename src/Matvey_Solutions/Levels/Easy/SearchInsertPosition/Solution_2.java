package Matvey_Solutions.Levels.Easy.SearchInsertPosition;

public class Solution_2 {
    public int searchInsert(int[] nums, int target) {
        int sizeOfArray = nums.length;
        int start = 0;
        int end = sizeOfArray - 1;

        while (start <= end)
        {
            int mid = (start + end) / 2;

            if(nums[mid] == target)
            {
                return mid;
            }
            else if (nums[mid] < target)
            {
                start = mid + 1;
            }
            else
                end = mid - 1;
        }
        return end + 1;

    }

    public static void main(String[] args) {
        Solution_2 sol = new Solution_2();
        System.out.println(sol.searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println(sol.searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(sol.searchInsert(new int[]{1,3,5,6}, 7));
    }

}

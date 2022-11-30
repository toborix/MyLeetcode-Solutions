package Levels.Easy.RemoveDublicatesFromSortedArray;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class Solution_3 {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Boolean> mp = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {

            // Print the element if it is not
            // present there in the hash map
            // and Insert the element in the hash map
            if (mp.get(nums[i]) == null)
            {
                mp.put(nums[i], true);
            }
        }

        return nums.length;
    }
}

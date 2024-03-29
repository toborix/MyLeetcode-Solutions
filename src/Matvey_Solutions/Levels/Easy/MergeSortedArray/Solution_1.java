package Matvey_Solutions.Levels.Easy.MergeSortedArray;

import java.util.Arrays;

public class Solution_1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n ; i++) {
            nums1[i + m] = nums2[i];

        }
        Arrays.sort(nums1);
    }

//    Time complexity: O((n+m)log(n+m))
//    Space complexity: O(n)
}

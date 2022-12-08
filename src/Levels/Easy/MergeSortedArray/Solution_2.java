package Levels.Easy.MergeSortedArray;

public class Solution_2 {
    /*
        m - кол-во эдементов в массиве nums1
        n - кол-во элементов в массиве nums2
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        //
        for (int i = 0; i < m ; i++) {
            nums1Copy[i] = nums1[i];
        }
        // pointers
        int p1 = 0;
        int p2 = 0;

        for (int p = 0; p < m + n; p++){
            if (p2 >= n || (p1 < m && nums1Copy[p1] < nums2[p2])) {
                nums1[p] = nums1Copy[p1++];
            } else {
                nums1[p] = nums2[p2++];
            }
        }
    }
}

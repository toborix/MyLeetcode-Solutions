package Matvey_Solutions.Levels.Easy.IntersectionofTwoArrays_349;

import java.util.HashSet;
import java.util.Set;

public class Solution_1 {
    public int[] intersection(int[] nums1, int[] nums2){
        if(nums1 == null || nums1.length == 0) return nums1;

        Set<Integer> mySet_1 = new HashSet<>();
        for (Integer n: nums1
             ) mySet_1.add(n); {
        }
        Set<Integer> mySet_2 = new HashSet<>();
        for (Integer n:
             nums2) mySet_2.add(n); {

        }

        mySet_1.retainAll(mySet_2);

        int[] output = new int[mySet_1.size()];
        int idx = 0;
        for (int s: mySet_1
             ) output[idx++] = s; {

            return output;
        }


    }
}

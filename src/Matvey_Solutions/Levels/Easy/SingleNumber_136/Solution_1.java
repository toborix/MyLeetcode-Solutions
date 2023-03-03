package Matvey_Solutions.Levels.Easy.SingleNumber_136;

import java.util.HashSet;
import java.util.Set;

public class Solution_1 {
    public int singleNumber(int[] nums) {
        int sumOfSet = 0, sumOfNums = 0;
        Set<Integer> mySet = new HashSet<>();

        for (int num: nums) {
            if (!mySet.contains(num)) {
                mySet.add(num);
                sumOfSet += num;
            }
            sumOfNums += num;


        }
        return 2 * sumOfSet - sumOfNums;
    }

}

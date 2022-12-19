package Matvey_Solutions.Levels.Easy.ThirdMaximumNumber;

import java.util.Arrays;
import java.util.TreeSet;

public class Solution_1 {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> sortedNums = new TreeSet<>();

        for(int num : nums){
            if(sortedNums.contains(num)){
                continue;
            }
            if(sortedNums.size() == 3){
                if (sortedNums.first() < num){

                    sortedNums.pollFirst();
                    sortedNums.add(num);
                }
            }
            else {
                sortedNums.add(num);
            }
        }
        if (sortedNums.size() == 3){
            return sortedNums.first();
        }
        return sortedNums.last();
    }

    public static void main(String[] args) {
        Solution_1 sol = new Solution_1();
        System.out.println((sol.thirdMax(new int[]{3,2,1})));
    }
}

package Matvey_Solutions.Levels.Easy.LargestNumberAtLeastTwice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Solution_2 {
    public int dominantIndex(int[] nums_){
        int maxElement = 0;
        List<Integer> nums = Arrays.stream(nums_)
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i < nums.size(); i++) {
            if(maxElement < nums.get(i)){
                maxElement = nums.get(i);
            }
            //TODO: решить через stack(найти второй максимум и сравнить с первым максимуом)
            if(maxElement!= nums.get(i) && maxElement < 2 * nums.get(i)){
                return -1;
            }
        }



        return nums.indexOf(maxElement);
    }


    public static void main(String[] args) {
        Solution_2 sol = new Solution_2();
        System.out.println(sol.dominantIndex(new int[]{3,6,1,0}));
        System.out.println(sol.dominantIndex(new int[]{0,0,0,3})); // output:0 expexted: 3
        System.out.println(sol.dominantIndex(new int[]{1,2,3,4}));
    }
}


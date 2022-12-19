package Matvey_Solutions.Levels.Easy.HeightChecker;

import java.util.Arrays;

public class Solution_1 {
    public int heightChecker(int[] heights){
        int[] sortedArray = heights;

        Arrays.sort(sortedArray);

        int counter = 0;

        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != sortedArray[i]){
                counter++;
            }

        }
        return counter;
    }

    public static void main(String[] args) {
        Solution_1 solution_1 = new Solution_1();
        System.out.println(solution_1.heightChecker(new int[]{5,1,2,3,4}));
    }
}

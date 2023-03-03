package Matvey_Solutions.Levels.Easy.MinimumAbsoluteDifference_1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_1 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> answer = new ArrayList<>();

        int minPairDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; ++i) {
            minPairDiff = Math.min(minPairDiff, arr[i+1] - arr[i]);

        }

        for(int i = 0; i < arr.length - 1; ++i){
            if (arr[i+1] - arr[i] == minPairDiff){
                answer.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return answer;
    }
}

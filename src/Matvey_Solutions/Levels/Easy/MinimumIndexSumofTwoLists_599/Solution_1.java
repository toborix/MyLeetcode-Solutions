package Matvey_Solutions.Levels.Easy.MinimumIndexSumofTwoLists_599;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution_1 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap < String, Integer > map = new HashMap<>();
        for (int i = 0; i < list1.length; i++)
            map.put(list1[i], i);
        List< String > res = new ArrayList< >();
        int min_sum = Integer.MAX_VALUE;
        int sum;
        for (int j = 0; j < list2.length && j <= min_sum; j++) {
            if (map.containsKey(list2[j])) {
                sum = j + map.get(list2[j]);
                if (sum < min_sum) {
                    res.clear();
                    res.add(list2[j]);
                    min_sum = sum;
                } else if (sum == min_sum)
                    res.add(list2[j]);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}


/*
Time complexity : O(l1+l2)

Space complexity : O(l1∗x)
 */
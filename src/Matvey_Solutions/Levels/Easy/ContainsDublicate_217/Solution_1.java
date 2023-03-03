package Matvey_Solutions.Levels.Easy.ContainsDublicate_217;

import java.util.HashSet;
import java.util.Set;

public class Solution_1 {
    public boolean containsDublicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
}

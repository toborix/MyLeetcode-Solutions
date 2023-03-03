package Matvey_Solutions.Levels.Easy.FirstUniqueCharacter_387;

import Matvey_Solutions.Levels.Easy.TwoSum.Solution;

import java.util.HashMap;
import java.util.Map;

public class Solution_1 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
//            System.out.println("This is charAt(i): " + ch);
            if (map.containsKey(ch)) map.put(ch, map.get(ch) + 1);
            else map.put(ch, 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        Solution_1 sol = new Solution_1();
        System.out.println(sol.firstUniqChar("loveleetcode"));
    }
}

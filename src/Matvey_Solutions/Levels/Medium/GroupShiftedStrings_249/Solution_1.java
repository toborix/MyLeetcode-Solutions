package Matvey_Solutions.Levels.Medium.GroupShiftedStrings_249;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution_1 {
    public List<List<String>> groupStrings(String[] strings) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strings) {
            StringBuilder sb = new StringBuilder();
            // suppose we have two strings "abc" and "bcd"
            // p will be 'a' and 'b'
            char p = s.charAt(0);
            // "abc" will be mapped to: "0|1|2|"
            // "bcd" will be mapped to: "0|1|2|"
            for (char c : s.toCharArray()) {
                sb.append((c - p + 26) % 26).append("|");
            }
            String k = sb.toString();
            map.putIfAbsent(k, new ArrayList<>());
            map.get(k).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

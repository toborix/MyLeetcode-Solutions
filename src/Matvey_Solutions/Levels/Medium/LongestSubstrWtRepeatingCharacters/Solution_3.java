package Matvey_Solutions.Levels.Medium.LongestSubstrWtRepeatingCharacters;

public class Solution_3 {
    public int lengthOfLongestSubstring(String s){
        int maxLength = 0;

        for (int right = 0, left = 0; right < s.length(); right++) {
           int indexlocationOfFirstApperanceInSubstring = s.indexOf(s.charAt(right), left);
           if  (indexlocationOfFirstApperanceInSubstring != right){
               left = indexlocationOfFirstApperanceInSubstring + 1;
           }
            maxLength = Math.max(maxLength, right - left + 1);
        }


        return maxLength;
    }

}

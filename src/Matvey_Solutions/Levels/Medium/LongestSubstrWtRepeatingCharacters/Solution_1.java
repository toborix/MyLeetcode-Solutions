package Matvey_Solutions.Levels.Medium.LongestSubstrWtRepeatingCharacters;

/**
 * Используем Вложенные - это O(n^2)
 * Алгоритм Слишком медленный
 */

public class Solution_1 {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder currentSubstring = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if(currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1){
                    break;
                }
                currentSubstring.append(s.charAt(j));
                maxLength = Math.max(maxLength, currentSubstring.length());

                /*
                кусок код ниже вопляет те же действия,
                что строчка ниже
                 */
    //                if(currentSubstring.length() > maxLength){
    //                    maxLength = currentSubstring.length();
    //                }

            }

        }
        return maxLength;

    }

}



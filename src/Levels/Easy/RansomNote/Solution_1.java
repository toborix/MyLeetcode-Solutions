package Levels.Easy.RansomNote;

public class Solution_1 {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int matchingIndex = magazine.indexOf(r);

            if (matchingIndex == -1) {
                return false;
            }

            magazine = magazine.substring(0,i) + magazine.substring(i + 1);
        }
        return true;
    }

    // time complexity: O(nm)
    // space complexity: O(m)

}

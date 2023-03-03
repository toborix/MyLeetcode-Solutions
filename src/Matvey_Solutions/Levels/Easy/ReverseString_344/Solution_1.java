package Matvey_Solutions.Levels.Easy.ReverseString_344;

public class Solution_1 {
    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;
        char temp;

        for (left = 0; left < right; left++, right--) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }

    }

}

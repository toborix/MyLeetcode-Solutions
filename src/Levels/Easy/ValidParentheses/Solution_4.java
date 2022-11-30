package Levels.Easy.ValidParentheses;

public class Solution_4 {
    public boolean isValid(String s) {

        if(s.isEmpty()) {
            return true;
        }

        else {
            for (int i = 0; i < s.length() - 1; i++) {
                if ((s.charAt(i) == '(' && s.charAt(i + 1) == ')') ||
                        (s.charAt(i) == '{' && s.charAt(i + 1) == '}') ||
                        (s.charAt(i) == '[' && s.charAt(i + 1) == ']')) {
                    s = s.substring(0, i) + s.substring(i + 2);
                    return isValid(s);
                }
            }
            return false;
        }
    }

}

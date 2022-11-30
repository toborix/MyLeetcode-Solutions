package Levels.Easy.ValidParentheses;

/**
 * Решение проходит не все тесты(особенно кейс: "[")
 */

import java.util.Stack;

public class Solution_3 {
    public boolean isValid(String s) {

        if (s.isEmpty()) {
            return true;
        } else {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char current = s.charAt(i);
                if (current == '(' || current == '[' || current == '{') {
                    stack.push(current);
                } else {
                    if(stack.isEmpty()) {
                        return false;
                    }
                    char peekChar = stack.peek();
                    if ((current == ')' && peekChar != '(')
                            || (current == '}' && peekChar != '{')
                            || (current == ']' && peekChar != '[')) {
                        return false;  // for a valid input, a close brackets must have an open brackets
                    } else {
                        stack.pop();
                    }
                }
            }
            return true;
        }
    }
}

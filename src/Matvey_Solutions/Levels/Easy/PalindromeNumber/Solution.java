package Matvey_Solutions.Levels.Easy.PalindromeNumber;

/*
Example_1:

    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.


Example_2:

   Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
    Therefore it is not a palindrome.

Example_3:

    Input: x = 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */


public class Solution {
    /**
     * Моя идея заключаеться в том, чтобы сравнивать два вида строк
     * Прямой вид строки сравнивать с обратным, если строки совпадают, то вернуть true
     * если нет - false
     */
    public boolean isPalindrome(int x){
        String input = Integer.toString(x);
        StringBuffer sbr = new StringBuffer(input);
        String reverse_input = String.valueOf(sbr.reverse());

        return input.equals(reverse_input);

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isPalindrome(-123);
    }
}

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


public class Solution_2 {
    /**
     * Моя идея заключаеться в том, чтобы сравнивать два вида строк
     * Прямой вид строки сравнивать с обратным, если строки совпадают, то вернуть true
     * если нет - false
     */
    public boolean isPalindrome(int x){

        if (x < 0){
            return false;
        }

        int number = x;
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return  x == reverse;
    }

    public static void main(String[] args) {
        Matvey_Solutions.Levels.Easy.PalindromeNumber.Solution solution = new Matvey_Solutions.Levels.Easy.PalindromeNumber.Solution();
//        solution.isPalindrome(-121);

    }
}



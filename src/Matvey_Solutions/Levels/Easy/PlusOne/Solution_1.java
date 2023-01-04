package Matvey_Solutions.Levels.Easy.PlusOne;

import java.util.Arrays;

public class Solution_1 {
    public int[] plusOne(int[] digits){
        int size = digits.length;

        for (int index = size - 1; index >= 0; --index) {
            if(digits[index] == 9){
                digits[index] = 0;
            } else {
                digits[index]++;
                return digits;
            }
        }
        digits = new int[size + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        Solution_1 sol = new Solution_1();
        System.out.println(Arrays.toString(sol.plusOne(new int[]{9})));
        System.out.println(Arrays.toString(sol.plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(sol.plusOne(new int[]{8,9})));

    }
}

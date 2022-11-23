package Levels.Easy.RomanToInt;

public class Solution2 {
    public static int romanToInt(String S) {
        int ans = 0, num = 0;
        for (int i = S.length()-1; i>=0 ; i--)
        {
            switch (S.charAt(i)) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
            }
            if(4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }

}

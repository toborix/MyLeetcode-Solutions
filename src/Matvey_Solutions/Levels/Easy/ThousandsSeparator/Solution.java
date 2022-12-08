package Matvey_Solutions.Levels.Easy.ThousandsSeparator;

public class Solution {
    public String thousandSeparator(int n) {
        String str = String.format("%,d", n).replace(",", ".");
        return str;
    }
}

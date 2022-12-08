package Matvey_Solutions.Levels.Easy.LongestCommonPrefix;

import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] a)
    {
        int size = a.length;

        if (size == 0) return "";

        if (size == 0) return a[0];
        Arrays.sort(a);

        int end = Math.min(a[0].length(), a[size-1].length());

        int i = 0;
        while (i < end && a[0].charAt(i) == a[size-1].charAt(i)) i++;

        return a[0].substring(0,i);
    }

    public static void main(String[] args) {
        Solution gfg = new Solution();
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println( "The longest Common Prefix is : " +
                gfg.longestCommonPrefix(input));
    }
}


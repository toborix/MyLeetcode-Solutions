package Matvey_Solutions.Levels.Easy.ReverseWordsInString_lll_557;

import java.util.Arrays;

public class Solution_1 {
    public String reverseWords(String s) {
        if(s == null || s. length() == 0)
            return s;
        StringBuilder result = new StringBuilder();
        String[] splittedWords = s.split(" ");

        for(String word : splittedWords){
            StringBuilder wordSp = new StringBuilder();

            wordSp.append(word);

            wordSp.reverse();

            result.append(wordSp.toString() + " ");

        }
        result.setLength(result.length() - 1);

        return result.toString();

    }

}

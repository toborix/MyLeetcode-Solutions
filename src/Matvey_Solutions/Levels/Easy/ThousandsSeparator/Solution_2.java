package Matvey_Solutions.Levels.Easy.ThousandsSeparator;

public class Solution_2 {
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Thousand Separator.
    public String thousandSeparator(int n) {
        String num = String.valueOf(n); //first get num as string
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {//for all digits
            if (i != 0 && (num.length() - i) % 3 == 0) { //if the digit index divisible to three add seperator
                sb.append(".");
            }
            sb.append(num.charAt(i)); //always add the number
        }
        return sb.toString();
    }
}

package Matvey_Solutions.Levels.Easy.ImplementstrStr;

public class Solution_1 {
    public int strStr(String haystack, String needle){

        int needleLenght = needle.length();
        int haystackLenght = haystack.length();

        if (haystack == null || needle == null){
            return -1;
        }
        if(haystack.equals(needle)){
            return 0;
        }
        for (int i = 0; i < haystackLenght - needleLenght + 1; i++) {
            if (haystack.substring(i, i + needleLenght).equals(needle)) {
                return i;
            }

        }
        return -1;
    }
}

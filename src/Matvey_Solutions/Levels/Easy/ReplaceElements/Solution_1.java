package Matvey_Solutions.Levels.Easy.ReplaceElements;

import java.util.Arrays;


public class Solution_1 {
    public int[] replaceElements(int[] arr){

        int sizeOfArray = arr.length;
        int max = arr[sizeOfArray - 1];
        // change the last element of the array to -1
        arr[sizeOfArray - 1] = -1;
        for (int i = sizeOfArray - 2; i >= 0 ; i--) {
            int temp = arr[i];
            arr[i] = max;
            if(max < temp){
                max = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution_1 rep = new Solution_1();
        System.out.println(Arrays.toString(rep.replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
    }
}


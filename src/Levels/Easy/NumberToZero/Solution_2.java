package Levels.Easy.NumberToZero;

public class Solution_2 {
    public int numberOfSteps(int num){
        int steps = 0;

        while(num > 0){
            if((num &  1) == 0){
                num = num >> 1;
            } else {
                num--;
            }
            steps++;
        }
        return steps;
    }
}


// Time Complexity = O(lon n)
// Space Complexity = O(1)
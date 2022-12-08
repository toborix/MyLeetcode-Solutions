package Matvey_Solutions.Levels.Easy.NumberToZero;

public class Solution_1 {
    public int numberOfSteps(int num){
        int steps = 0;

        while(num > 0){
            if(num % 2 == 0){
                num /=2;
            } else{
                num--;
            }
            steps++;
        }
        return steps;
    }
    // Time Complexity = O(lon n)
    // Space Complexity = O(1)
}

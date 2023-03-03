package Matvey_Solutions.Levels.Easy.HappyNumber_202;

public class Solution_1 {

    public int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            n = getNext(n);
        }
        return n == 1;
    }

}

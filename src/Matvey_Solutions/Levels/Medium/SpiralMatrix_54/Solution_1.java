package Matvey_Solutions.Levels.Medium.SpiralMatrix_54;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int rows = matrix.length;
        int columns = matrix[0].length;
        int up = 0, down = rows - 1, left = 0, right = columns - 1;
        System.out.println("Up " + up);
        System.out.println("down " + down);
        System.out.println("left " + left);
        System.out.println("right " + (right - 1));


        while(result.size() < rows * columns) {
//            left to right
            for (int col = left; col <= right ; col++) {
                result.add(matrix[up][col]);
            }
//            downwards
            for (int row = up + 1; row <= down; row++) {
                result.add(matrix[row][right]);
            }

            if(up != down) {
                for(int col = right - 1; col >= left; col--){
                    result.add(matrix[down][col]);
                }
            }
            if(left != right) {
                for (int row = down - 1; row > up; row--){
                    result.add(matrix[row][left]);
                }
            }
            left++;
            right--;
            up++;
            down--;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution_1 sol = new Solution_1();
        sol.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}

// Time complexity: O(m⋅n)
// Space complexity: O(1)

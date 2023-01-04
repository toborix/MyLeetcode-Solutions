package Matvey_Solutions.Levels.Medium.DiagonalTraverse_498;

public class Solution_1 {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0 ) return new int[]{};
        if(mat[0].length == 0) return new int[]{};

        int row = mat.length, col = mat[0].length;
        int y = 0, x = 0;
        int[] arr = new int[row * col];
        int index = 0;
        while(index < arr.length){
            arr[index++] = mat[y][x];
            int sum = y + x;
            boolean isEven = sum % 2 == 0;
            if(isEven){
                if(x < col - 1 && y > 0){
                    x++;
                    y--;
                } else if(x < col -1){
                    x++;
                }
                else{
                    y++;
                }

            }else {
                if(y < row - 1 && x > 0){
                    x--;
                    y++;
                } else if(y < row - 1){
                    y++;
                } else{
                    x++;
                }

            }

        }
        return arr;
    }
}

// Time complexity: O(m*n)
// Space complexity: O(m*n)

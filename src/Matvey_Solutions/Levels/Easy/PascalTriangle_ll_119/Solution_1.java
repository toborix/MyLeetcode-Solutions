package Matvey_Solutions.Levels.Easy.PascalTriangle_ll_119;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
            result.add(1);
            for (int j = i; j >=0 ; j--) {
                if(j != 0 && j != i){
                    result.set(j, result.get(j) + result.get(j - 1));
                }

            }

        }

        return result;
    }
}

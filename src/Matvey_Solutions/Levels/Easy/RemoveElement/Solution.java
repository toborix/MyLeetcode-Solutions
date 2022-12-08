package Matvey_Solutions.Levels.Easy.RemoveElement;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<>();

        a1.add(10);
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(10);
        a1.add(4);

        System.out.println(a1);

        for (int i = 0; i < a1.size() - 1 ; i++) {
            for (int j = a1.size() - 1; j > 0 ; j--) {
                if (a1.get(i).equals(10) || a1.get(j).equals(10)) {
                    a1.remove(Integer.valueOf(10));
                }
            }
        }



        System.out.println(a1);


    }

}

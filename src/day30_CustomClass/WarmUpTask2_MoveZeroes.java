package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask2_MoveZeroes {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 0, 2, 1, 3, 4, 5, 1, 1, 2, 2, 0, 3, 0, 4, 0));

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j) == 1) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
        System.out.println(list);
    }
}

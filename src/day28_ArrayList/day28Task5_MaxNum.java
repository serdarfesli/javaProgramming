package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class day28Task5_MaxNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 6, 4, 5));
        Integer maxNum = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > maxNum) {
                maxNum = list.get(i);
            }
        }
        System.out.println(maxNum);

    }
}

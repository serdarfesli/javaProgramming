package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class day28Task6_MinNum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(5, 2, 3, 4, 55, 63));
        Integer min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min > list.get(i)) {
                min = list.get(i);
            }
        }
        System.out.println(min);
    }
}

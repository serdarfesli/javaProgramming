package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class day28Task7_FirstDuplicated {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> duplicated = new ArrayList<>();
        list.addAll(Arrays.asList(1, 3, 2, 3, 4, 4, 5, 6, 7, 7));

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                duplicated.add(list.get(i));
            }
        }
        System.out.println(duplicated.get(0));
    }
}

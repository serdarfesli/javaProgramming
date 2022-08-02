package day28_ArrayList;

import java.util.ArrayList;

public class day28Task1_SetZero {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.set(4, 0);
        System.out.println(list);
    }
}

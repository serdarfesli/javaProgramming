package day28_ArrayList;

import java.util.ArrayList;

public class day28Task2_Swap {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Integer temp= list.get(0);
        list.set(0, list.get(4));
        list.set(4,temp);
        System.out.println(list);
    }
}

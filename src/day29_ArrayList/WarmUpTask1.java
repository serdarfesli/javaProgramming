package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTask1 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(9, 5, 6, 78, 5, 5, 1, 1, 2, 2, 4, 4, 5, 7, 9, 3));

        ArrayList<Integer> uniques = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int i1 = 0; i1 < list.size(); i1++) {
                if (list.get(i).equals(list.get(i1))) {
                    count++;
                }
            }
            if (count == 1) {
                uniques.add(list.get(i));
            }
        }
        System.out.println(uniques.get(0));
    }
}
/*
1. Write a program that can return the first unique elements from an arraylist

			Do not use indexOf & lastIndexOf methods
 */
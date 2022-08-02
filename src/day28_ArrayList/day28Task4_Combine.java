package day28_ArrayList;

import java.util.ArrayList;

public class day28Task4_Combine {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        String[] arr = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        for (String each1 : arr) {
            list.add(each1);
        }
        for (String each2 : arr2) {
            list.add(each2);
        }
        System.out.println(list);
    }
}
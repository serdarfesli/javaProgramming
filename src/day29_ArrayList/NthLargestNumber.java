package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {
        int n = 3;

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4,6,8,99,8,77,55,44,66,3,2,22, 5, 6));
     /*   int max = 0;
       for (int i = 1; i <= n; i++) {
            max = list.get(0);
            for (Integer each : list) {
                if (each > max) {
                    max = each;
                }
            }
            if (!(i == n)) {
                int finalMax = max;
                list.removeIf(p -> p == finalMax);
            }
        }
        System.out.println(n + "st/rd/th max number is:" + max);*/
        for (int i = 1; i <n ; i++) {
            list.removeIf(p->p==Collections.max(list));
        }
        System.out.println( Collections.max(list) );





    }
}






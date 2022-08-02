package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTask2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(4, 5, 5, 6, 6, 8, 8, 9, 9, 7, 7, 12, 7, 155, 2, 3));
        Integer max = list.get(0);
        Integer min = list.get(0);
        Integer sum = 0;
        Integer average = 0;
        for (Integer each : list) {
            if (each > max) {
                max = each;
            }
            if (each < min) {
                min = each;
            }
            sum += each;
        }
        average = sum / list.size();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average);
    }
}
/*
2. Write a program that can find the maximum, minimum and average number from an arrayList of integers
 */
package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask3 {
    public static void main(String[] args) {
        String str="ABCD123+%&/456EFG!";
        char[] arr= str.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (char each : arr) {
            list.add(each);
        }

        ArrayList<Character> list1 = new ArrayList<>(list);
        ArrayList<Character> list2 = new ArrayList<>(list);
        ArrayList<Character> list3 = new ArrayList<>(list);

        list1.removeIf(p-> !Character.isDigit(p));
        list2.removeIf(p-> !Character.isUpperCase(p));
        list3.removeIf(p-> Character.isLetterOrDigit(p));

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("list3 = " + list3);
    }
}

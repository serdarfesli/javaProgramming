package day29_ArrayList;

import myUtilities.MyArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmet", "Hasan", "Mahmut", "David", "James", "David", "Ali", "Alper"));
        employees.retainAll(Arrays.asList("Ahmet", "David"));
        System.out.println(employees);

        System.out.println("-------------------------------");

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));
        list.removeIf(p -> p.startsWith("M"));
        System.out.println(list);
        String[] names2 = {};
        names2 = list.toArray(new String[0]);
        MyArraysUtility.printWholeArray(names2);
    }
}

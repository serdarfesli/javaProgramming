package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        for (int i = 0; i <list.size() ; i++) {
            list.set(i, list.get(i)*2);
        }
        System.out.println(list);

        System.out.println("-----------------------------------");
        ArrayList<String> employees= new ArrayList<>();
        employees.add("Ali");
        employees.add("Veli");
        employees.add("Deli");
        employees.add("Alex");
        employees.add("James");
        employees.add("Cameron");
        employees.add("Tony");
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
    }
}
/*

 */
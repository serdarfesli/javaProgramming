package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers.get(3));

        System.out.println("-----------------------------------");

        for (int i = 0; i <numbers.size() ; i++) {
            System.out.print(  numbers.get(i));
        }

        System.out.println("-----------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java"); //0
        list.add ("Python"); //1
        list.add("Java");  //2
        list.add ("C#"); //3
        list.add("Ruby"); //4
        list.set(2,"JavaScript");
        System.out.println(list);
        list.set(3,"C++");
        System.out.println(list);


    }
}

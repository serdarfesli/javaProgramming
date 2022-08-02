package day35_Encapsulation.tasks.carpet;

import day35_Encapsulation.tasks.carpet.Carpet;

public class CarpetObjects {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(4, 3, 10, true);
        carpet1.setWidth(5);
        carpet1.setLength(5);
        System.out.println(carpet1);

    }
}
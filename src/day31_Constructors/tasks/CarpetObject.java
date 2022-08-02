package day31_Constructors.tasks;

import day30_CustomClass.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject {
    public static void main(String[] args) {
        Carpet carpet1 = new Carpet(3,2,100,true);
        Carpet carpet2= new Carpet(2,2,75,false);
        Carpet carpet3 = new Carpet(4,3,120,true);

        ArrayList<Carpet> carpetList = new ArrayList<>();
        carpetList.addAll(Arrays.asList(carpet1,carpet2,carpet3));
        System.out.println(carpetList);
    }
}

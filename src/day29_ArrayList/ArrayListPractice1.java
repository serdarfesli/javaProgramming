package day29_ArrayList;

import myUtilities.MyArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        String[] countries = {"Japan", "United States", "Turkey", "United Kingdom", "Canada"};
        ArrayList<String> listCountry = new ArrayList<>(Arrays.asList(countries));
        listCountry.removeIf(p -> p.length() > 10);
        System.out.println(listCountry);
        String[] country2 = listCountry.toArray(new String[0]);

        MyArraysUtility.printWholeArray(country2);
    }
}







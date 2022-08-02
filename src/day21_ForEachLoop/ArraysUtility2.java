package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
       String [] students = {"Elif","Ahmet","James","Nelson","Daniel","Aeron"};
String[] earlyBirds = Arrays.copyOf(students,5);
        System.out.println(Arrays.toString(earlyBirds));
        Arrays.copyOfRange(students,2,4);

        earlyBirds= Arrays.copyOfRange(students,2,4);
        System.out.println(Arrays.toString(earlyBirds));

        int[] scores= {10,20,30,40,50,60,70,80,90,100};
        int[] result = Arrays.copyOfRange(scores,4,8);
        System.out.println(Arrays.toString(result));


    }
}

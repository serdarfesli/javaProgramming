package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str ="Java";
        for (char each: str.toCharArray()){
            System.out.println(each);
        }

        System.out.println("----------------------------");

        String sentence= "I love learning Java Programming Language.";
        String [] elements = sentence.split(" "); //—>[I, love, learning, Java, Programming, Language.]
        System.out.println(Arrays.toString(elements));


    }


}

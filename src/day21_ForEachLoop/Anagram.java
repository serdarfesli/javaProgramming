package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

String str1 = "dbca";
String str2 = "cbda";
char [] ch = str1.toCharArray();
char [] ch2 = str2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
   boolean isArraysSame= Arrays.equals(ch,ch2);
        System.out.println(isArraysSame);


    }
}

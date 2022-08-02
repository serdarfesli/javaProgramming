package day13_String;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter word1");
        String word1 = input.next();
        System.out.println("please enter word2");
        String word2 = input.next();
        System.out.println("please enter word3");
        String word3 = input.next();
        String result = "";
        int lenghtWord1 = word1.length();
        int lenghtWord2 = word2.length();
        int lenghtWord3 = word3.length();
        if (lenghtWord1 == lenghtWord2 && lenghtWord3 == lenghtWord2) {
            result = "All words are same length";
        } else if (lenghtWord1 != lenghtWord2 && lenghtWord1 != lenghtWord3 && lenghtWord2 != lenghtWord3) {
            result = "All different length";
        } else {
            result = "Not Same nor Different lengths";
        }
        System.out.println("result = " + result);
    }
}
/*
Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */
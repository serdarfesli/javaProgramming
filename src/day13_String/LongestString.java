package day13_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease enter sentence1");
        String sentence1 = scan.nextLine();
        System.out.println("PLease enter sentence2");
        String sentence2 = scan.nextLine();
        if (sentence1.length() > sentence2.length()) {
            System.out.println("sentence1 = " + "\"" + sentence1 + "\"" + " is the longest");
        } else if (sentence1.length() < sentence2.length()) {
            System.out.println("sentence2 = " + "\" " + sentence2 + "\"" + " is the longest");
        } else {
            System.out.println("They have equal length");
        }
    }
}

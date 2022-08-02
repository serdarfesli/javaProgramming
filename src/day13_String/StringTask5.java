package day13_String;

import java.util.Scanner;

public class StringTask5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please write something");
        String s1 = input.nextLine();
        int lenghts1 = s1.length();

        String result;
        if (lenghts1 == 0) {
            result = "string is empty";
        } else if (lenghts1 > 3) {
            char theLastThirdChar = s1.charAt(s1.length() - 3);
            char theLastSecondChar = s1.charAt(s1.length() - 2);
            char theLastChar = s1.charAt(s1.length() - 1);
            result = "" + theLastThirdChar + theLastSecondChar + theLastChar;
        } else {
            result = s1;
        }
        System.out.println("result = " + result);
    }
}

/*
Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */
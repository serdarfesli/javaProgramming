package day14_Strings;

import java.util.Scanner;

public class Day14_Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word1 = input.next();
        if ((word1.charAt(0) > 47) && (word1.charAt(0) < 58)) {
            System.out.println("first character is digit");
        } else if ((word1.charAt(0) >= 65) && (word1.charAt(0) <= 90)) {
            System.out.println("first character is uppercase letter");
        } else if ((word1.charAt(0) >= 97) && (word1.charAt(0) <= 122)) {
            System.out.println("first character is lowercase letter");
        } else {
            System.out.println("first character is special character");

        }
        input.close();
    }
}

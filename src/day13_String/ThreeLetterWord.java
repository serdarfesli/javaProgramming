package day13_String;

import java.util.Scanner;

public class ThreeLetterWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please write a 3 letter word");
        String s1 = scan.next();
        String result = "";
        int lenghtS1 = s1.length();
        if (lenghtS1 == 3) {
            char middleLetter = s1.charAt(1);
            result = (middleLetter == 'a') ? "Cool word" : "okay word";

        } else if (lenghtS1 > 3) {
            result = "\"Word is too long\"";
        } else {
            result = "\"Word is too short\"";
        }
        System.out.println("result = " + result);
    }
}
/*
write a program that asks the user enter a three letter word. Check if the middle character of the given word is 'a'.
 In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
 */
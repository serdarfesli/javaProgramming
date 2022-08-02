package day13_String;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "";
        System.out.println("Please enter a 5 letters word");
        String word = scan.next();
        int lenght = word.length();
        if (lenght > 5) {
            result = "Too long!";
        } else if (lenght<5) {
            result="Too short!";
        }else {
            result = ""+ word.charAt(4) + word.charAt(3)+ word.charAt(2)+word.charAt(1)+word.charAt(0);
        }
        System.out.println("result = " + result);
    }
}
/*
Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.

 */
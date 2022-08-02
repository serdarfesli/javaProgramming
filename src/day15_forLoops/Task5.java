package day15_forLoops;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String givenWord = scan.next();
        String letters="";
        String digits="";
        String specialChars = "";

        for (int i = 0; i <= givenWord.length()-1 ; i++) {
            char charGiven= givenWord.charAt(i);
            if ((charGiven>=65 && charGiven<=90) ||
            (charGiven>=97 && charGiven<=122)){
                letters=letters + charGiven;
            } else if (charGiven>=48 && charGiven<=57) {
                digits="" + digits + charGiven;
            } else {
                specialChars="" + specialChars +charGiven;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }
}

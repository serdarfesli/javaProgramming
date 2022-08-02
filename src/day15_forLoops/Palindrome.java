package day15_forLoops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String givenWord = scan.next();
        String newWord="";
        for (int i = 0; i <=givenWord.length()-1 ; i++) {
             if((givenWord.toLowerCase().charAt(i)) == givenWord.toLowerCase().charAt(givenWord.length()-1-i)){
                 newWord = newWord + givenWord.charAt(i);
             }
             }
        boolean palindrome = givenWord.equals(newWord);
        System.out.println(palindrome);
        }
    }


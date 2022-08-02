package day15_forLoops;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String givenWord = scan.nextLine();
        String newWord="";
        for (int i = givenWord.length()-1 ; i >= 0 ; i--) {
            newWord= newWord + givenWord.charAt(i);
        }
        System.out.println(newWord);
    }
}

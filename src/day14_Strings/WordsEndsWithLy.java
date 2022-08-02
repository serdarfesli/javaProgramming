package day14_Strings;

import java.util.Scanner;

public class WordsEndsWithLy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String str = input.next();
        int lenght = str.length();
        char lastSecond = str.charAt(lenght - 2);
        char last = str.charAt(lenght - 1);
        if ((lastSecond == 'l' && last == 'y')) {
            System.out.println("really???");
        } else{
            System.out.println("never mind");
        }
    }
}
/*
2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */
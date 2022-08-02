package day16_ForLoopsStringPractice;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.next();
        System.out.println("Please enter a character");
        char givenchar = scan.next().charAt(0);
        int numberOfFrequecy = 0;

        for (int i = 0; i <= word.length()-1 ; i++) {
            if(word.charAt(i) == givenchar){
                numberOfFrequecy += 1;
            }
        }
        System.out.println(numberOfFrequecy);
    }
}

/*
Write a program that asks user to entera string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
 */
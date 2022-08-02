package day18_NestedLoop;

import java.util.Scanner;

public class FrequencyOfChars {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word = scan.next(); //aabbcca
        String container = "";
        String unChangedWord = word;
        int frequency = 0;
        for (int i = 0; i <= unChangedWord.length() - 1; i++) {
            word = unChangedWord;
            frequency = 0;
            String letter = "" + word.charAt(i);

            if (!(container.contains(letter))) { //if container doesn't contain the letter -> add it to the container
                container += letter;  //a

                while (word.contains(letter)) {     // if container contains the letter -> remove from the string and take it to the container
                    word = word.replaceFirst(letter, "");
                    frequency++;
                }
                container += frequency;
            }
        }
        System.out.println("container = " + container);
    }
}

/*
Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
 */






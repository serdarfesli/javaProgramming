package day16_ForLoopsStringPractice;

import java.util.Scanner;

public class FrequencyOfJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please write a sentence");
        String sentence = scan.nextLine();
        String wordJava = "Java";
        int frequencyOfJava = 0;
        for (int i = 0; i < sentence.length()-1 ; i++) {
            if(wordJava.charAt(0) == sentence.charAt(i) &&
                    wordJava.charAt(1) == sentence.charAt(i+1) &&
            wordJava.charAt(2) == sentence.charAt(i+2) &&
            wordJava.charAt(3) == sentence.charAt(i+3)) {
                frequencyOfJava += 1;
            }
        }
        System.out.println(frequencyOfJava);
    }
}

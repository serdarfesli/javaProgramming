package day13_String;

import java.util.Scanner;

public class EnterASentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();
        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(sentence.length() - 1);
        System.out.println("" + firstChar + lastChar);
        scan.close();
    }
}

package day16_ForLoopsStringPractice;

import java.util.Scanner;

public class CatAndDog {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = scan.nextLine();
        int catsNumber=0;
        int dogsNumber =0;
        for (int i = 0; i < sentence.length()-3 ; i++) {
            if(sentence.substring(i,i+3).equalsIgnoreCase("cat")){
                catsNumber++;
            } else if(sentence.substring(i,i+3).equalsIgnoreCase("dog")){
                dogsNumber++;
            }
        }
        boolean isDogAndCatSame = catsNumber==dogsNumber;
        System.out.println(isDogAndCatSame);
    }
}

package day14_Strings;

import java.util.Scanner;

public class LastLetterFirstLetterSame {
    public static void main(String[] args) {


        Scanner input =new Scanner(System.in);
        System.out.println("Enter word1");
        String word1=input.next();
        System.out.println("Enter word2");
        String word2=input.next();
        String word3="";
        int lenght1= word1.length();
        if((word1.charAt(lenght1-1))==word2.charAt(0)){
          word3 = word1 + word2.substring(1);
        } else {
            word3= word1 + word2;
        }
        System.out.println(word3);
    }
}

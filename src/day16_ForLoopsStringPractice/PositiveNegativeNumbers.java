package day16_ForLoopsStringPractice;

import java.util.Scanner;

public class PositiveNegativeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positiveNumber = 0;
        int negativeNumbers = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number");
            int givenNumber = scan.nextInt();
            if(givenNumber > 0){
              positiveNumber += 1;
            } else if (givenNumber<0) {
                negativeNumbers += 1;
            }
        }
        System.out.println(positiveNumber + " positive and " + negativeNumbers + " negative" );
    }
}

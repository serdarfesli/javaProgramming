package day15_forLoops;

import java.util.Scanner;

public class SumOfAllNumbersBetween1ToGivenNumber {
    public static void main(String[] args) {

        int sum =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int givenNumber = input.nextInt();
        for (int i = 1; i <= givenNumber ; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}

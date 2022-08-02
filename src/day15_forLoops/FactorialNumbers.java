package day15_forLoops;

import java.util.Scanner;

public class FactorialNumbers {
    public static void main(String[] args) {
        int result = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int givenNumber = scan.nextInt();
        for (int i = givenNumber; i > 0; i--) {
            result *= i;
        }
        System.out.println("result = " + result);
    }
}

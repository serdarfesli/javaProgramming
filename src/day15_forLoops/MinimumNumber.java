package day15_forLoops;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minNumber = 2_147_483_647; //any user entered number will be less than this number.

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number");
            int number = input.nextInt();

            if (number<minNumber){
                minNumber=number;
            }
        }
        System.out.println("minNumber = " + minNumber);
    }
}

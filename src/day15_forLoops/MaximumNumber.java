package day15_forLoops;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max= -2147483648; //any user entered number will be greater than this number.
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter a number");
            int number = input.nextInt();

            if(number>max){
                max=number;
            }
        }
        System.out.println("max = " + max);

input.close();
    }
}
/*
        Write a number that asks the user to enter a number for 5 times.
         */

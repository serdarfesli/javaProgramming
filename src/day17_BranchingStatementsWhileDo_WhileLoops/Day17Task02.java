package day17_BranchingStatementsWhileDo_WhileLoops;

import java.util.Scanner;

public class Day17Task02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 new numbers");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        while (num1>0 && num2>0){
           int result=  num1 + num2;
            System.out.println(result);
            System.out.println("Enter 2 new numbers");
            num1= scan.nextInt();
            num2= scan.nextInt();
        }
    }
}
/*
Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop
 */
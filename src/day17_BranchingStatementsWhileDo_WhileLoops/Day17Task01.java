package day17_BranchingStatementsWhileDo_WhileLoops;

public class Day17Task01 {
    public static void main(String[] args) {
        int num1 = 80;
        int num2 = 6;
        int resultOfRemainder = 0;
        int quotient=0;
        while (num1 > num2) {
            resultOfRemainder = num1 - num2;
            num1 = resultOfRemainder;
            quotient++;
        }
        System.out.println("resultOfRemainder = " + resultOfRemainder);
        System.out.println("quotient = " + quotient);

        System.out.println("--------------------------------------");

        int num3=9;
        int num4 =8;
        int resultOfMultiplication=0;
        for (int i = 1; i <num4 ; i++) {
            num3+=9;
            resultOfMultiplication= num3;
        }
        System.out.println("resultOfMultiplication = " + resultOfMultiplication);



    }
}
/*
        1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
         */
package day17_BranchingStatementsWhileDo_WhileLoops;

import java.util.Scanner;

public class day17TAsk03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result =0;
        System.out.println("Enter num1");
        int num1 = scan.nextInt();
        System.out.println("Enter num2");
        int num2 = scan.nextInt();
        System.out.println("Enter a valid operator +-*/ ");
        char operator = scan.next().charAt(0);
        while (!(operator == '+' || operator == '*' || operator == '/' || operator == '-')) {
            System.err.println("Re-Enter a valid operator +-*/ ");
            operator = scan.next().charAt(0);
        }
        if (operator == '+') {
             result = num1 + num2;
        } else if (operator == '-') {
             result = num1 - num2;
        } else if (operator == '*') {
             result = num1 * num2;
        } else {
             result = num1 / num2;
        }
        System.out.println("result = " + result);
    }
}
/*
3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */
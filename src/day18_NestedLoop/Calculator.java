package day18_NestedLoop;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double result = 0.0;
        while (true) {
            System.out.println(" Enter first number");
            int num1 = scan.nextInt();
            System.out.println(" Enter operator");
            char operator = scan.next().charAt(0);
            while (!(operator == '+' || operator == '-' || operator == '*' || operator == '/')) {
                System.err.println("invalid operator, please re-enter");
                operator = scan.next().charAt(0);
            }
            System.out.println(" Enter second number");
            int num2 = scan.nextInt();

            if (operator == '+') {
                result = (num1 + num2);
            } else if (operator == '-') {
                result = (num1 - num2);
            } else if (operator == '*') {
                result = (num1 * num2);
            } else {
                result = num1 / num2;
            }
            System.out.println("result = " + result);

            System.out.println("Would you like to repeat the steps?");
            String answerContinue = scan.next().toLowerCase();
            while (!(answerContinue.equals("yes") || answerContinue.equals("no"))) {
                System.err.println("invalid Entry please re-enter");
                answerContinue = scan.next().toLowerCase();
            }

            if (answerContinue.equals("no")) {
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }
        }
                scan.close();
    }
}

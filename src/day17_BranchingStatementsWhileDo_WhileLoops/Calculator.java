package day17_BranchingStatementsWhileDo_WhileLoops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = scan.nextInt();
        System.out.println("Enter your first number");

        int num2 = scan.nextInt();
        System.out.println("Enter your math operator");
        char operator = scan.next().charAt(0);

        while (!(operator=='+' || operator=='-')){
            System.out.println("Invalid Operator, Please re-enter");
            operator=scan.next().charAt(0);
        }
        System.out.println( (operator=='+')? num1+num2 : num1-num2 );
    }
}

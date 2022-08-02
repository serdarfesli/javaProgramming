package day09_IfElse;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 20;
        double n2 = 30;
        char mathOperator = '+';

        if (mathOperator == '+') {
            System.out.println(n1 + n2);
        } else if (mathOperator == '-') {
            System.out.println(n1 - n2);
        } else if (mathOperator == '*') {
            System.out.println(n1 * n2);
        } else if (mathOperator == '/') {
            System.out.println(n1 / n2);
        } else {
            System.out.println("invalid operator");
        }
    }
}


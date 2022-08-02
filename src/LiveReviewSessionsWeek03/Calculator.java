package LiveReviewSessionsWeek03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result1;
        result1=0;
        char operator;
        System.out.println("Please enter two double numbers");
        num1 = input.nextDouble();
        num2 = input.nextDouble();

        System.out.println("Enter the arithmetic operator (+,-,*,/,%");
        operator = input.next().charAt(0);
        switch (operator){
            case '+':
                result1=num1+num2;
                break;
            case '-':
                if(num1>=num2){
                    result1=num1-num2;
                }else {
                    result1=num2-num1;
                }
                break;
            case '/':
                if(num1>=num2 && num2!=0){
                    result1=num1/num2;
                }else if (num2>=num1 && num1!=0){
                    result1=num2/num1;
                }else{
                System.out.println("numbers are not suitable");
            }
                break;
            case '*':
                    result1=num1*num2;
                break;
            case '%':
                if(num1>=num2 && num2!=0){
                    result1=num1%num2;
                }else if (num2>=num1 && num1!=0){
                    result1=num2%num1;
                }else{
                    System.out.println("your numbers are not appropriate");
                }
                break;
        }
        input.close();
        System.out.println("result1 = " + result1);
    }
}

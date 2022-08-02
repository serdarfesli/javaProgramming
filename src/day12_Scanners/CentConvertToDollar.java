package day12_Scanners;

import java.util.Scanner;

public class CentConvertToDollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the cent number");
        int cent = input.nextInt();
        int dollar = cent / 100;
        int changeRemain = cent % 100;
        if (changeRemain > 0) {
            System.out.println(cent + " cents equal to " + dollar + " dollars and " + changeRemain + " cents");
        } else {
            System.out.println(cent + " cents equal to " + dollar + " dollars");
        }
        input.close();
    }
}
/*
3. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */
package day15_forLoops;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String givenWord = scan.next();
        int sum=0;
        for (int i = 0; i <=givenWord.length()-1 ; i++) {
            char givenChar = givenWord.charAt(i);

            if (givenChar>=48 && givenChar<=57){
                int number = givenChar-48;
                sum+=number;
            }
        }
        System.out.println("sum = " + sum);
    }
}
/*
6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...

 */
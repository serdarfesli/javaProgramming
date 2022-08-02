package day20_Arrays;


import java.util.Scanner;

public class MinNumberOfArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter");
        int howManyNumbers = scan.nextInt();
        if (howManyNumbers<=0){
            System.exit(0);
        }
        int [] numbers = new int [howManyNumbers];
        int minNumber=12345678;
        for (int i = 0; i <howManyNumbers ; i++) {
            System.out.println("Please enter number " + (i+1));
            numbers[i]= scan.nextInt();
            if (numbers[i]<minNumber){
                minNumber=numbers[i];
            }
        }
        System.out.println("minNumber = " + minNumber);




    }

    }


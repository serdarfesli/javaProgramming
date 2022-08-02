package day20_Arrays;

import java.util.Scanner;

public class AverageNumberOfArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number do you want to enter?");
        int howManyNumbers = scan.nextInt();
        if (howManyNumbers<=0){
            System.exit(0);
        }
        int [] numbers = new int[howManyNumbers];
        int sum =0;
        int average =0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("PLease enter number " + (i+1));
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }
        average=sum/howManyNumbers;
        System.out.println("average = " + average);

    }
}

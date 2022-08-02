package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter");
        int howManyNumbers = scan.nextInt();
        if (howManyNumbers <= 0) {
            System.err.println("Invalid Number");
            System.exit(0);
        }

        int[] number = new int[howManyNumbers];
        for (int i = 0; i <howManyNumbers ; i++) {
            System.out.println("PLease enter number " + (i+1));
            number[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(number));
        scan.close();
    }
}

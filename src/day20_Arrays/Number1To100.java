package day20_Arrays;

import java.util.Arrays;

public class Number1To100 {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        int num1 =100;
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i]=num1;
            num1--;
        }
        System.out.println(Arrays.toString(numbers));

    }
}

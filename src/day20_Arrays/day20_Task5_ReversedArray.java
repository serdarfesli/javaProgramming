package day20_Arrays;

import java.util.Arrays;

public class day20_Task5_ReversedArray {
    public static void main(String[] args) {

        int[]  numbers= {1,2,3,4,5};
        int [] reversednumber= new int[numbers.length];
        for (int i = 0; i <= numbers.length-1 ; i++) { //1 2
                 reversednumber[numbers.length-1-i] =  numbers[i];
        }
        System.out.println(Arrays.toString(reversednumber));
        }
    }

/*
Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */
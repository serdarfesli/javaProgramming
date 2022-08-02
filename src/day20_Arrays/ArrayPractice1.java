package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {
        String[] months = {"January", "February", " March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        int number = 9;
        System.out.println(months[number - 1]);
        System.out.println(Arrays.toString(months));

        int[] numbers = {10, 20, 50, 70};
        System.out.println(Arrays.toString(numbers));


        int[] scores = new int[5];
        scores[1] = 85;
        scores[scores.length - 1] = 95;
        scores[2] = 65;
        System.out.println(Arrays.toString(scores));


        System.out.println("--------------------");


        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        System.out.println("-------------------------");
        for (int j = months.length - 1; j >= 0; j--) {
            System.out.println(months[j]);


        }
    }
}

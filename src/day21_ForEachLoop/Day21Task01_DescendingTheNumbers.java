package day21_ForEachLoop;

import java.util.Arrays;

public class Day21Task01_DescendingTheNumbers {
    public static void main(String[] args) {

        int[] numbers = {4, 5, 8, 13, 45, 6, 0, 12, 3};
        Arrays.sort(numbers);

        int[] descendingNumbers = new int[numbers.length];
        int i = numbers.length-1;
        for (int each : numbers) {
            descendingNumbers[i--]=each;
        }
        System.out.println(Arrays.toString(descendingNumbers));
    }
}

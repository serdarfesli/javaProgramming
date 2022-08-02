package day21_ForEachLoop;

public class Day21Task02_OddAndEvenNumbers {
    public static void main(String[] args) {

        int oddNumbers = 0;
        int evenNumbers = 0;

        int[] numbers = {1, 5, 6, 8, 7, 9, 89, 65, 4655, 78};

        for (int each : numbers) {
            if (each % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }
        System.out.println("evenNumbers = " + evenNumbers);
        System.out.println("oddNumbers = " + oddNumbers);

    }
}
/*
2. Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

 */
package day20_Arrays;
import java.util.Arrays;
public class day20_Task6_MoveAllZeroes {
    public static void main(String[] args) {

        int[] numbers = {0,0, 10, 1, 5,};
        int realNumJ = 0;
        for (int i = 0; i < numbers.length - 1; i++) {

            for (int j = 0; j < numbers.length - 1; j++) {
                realNumJ = numbers[j];
                if (numbers[j] == 0) {
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = realNumJ;
                }

            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */
package day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {
        int []numbers = {1,2,8,4,5};
        int maxNum = numbers[0];
/*
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxNum){
                maxNum = numbers[i];
*/
        for (int number : numbers) {
            if (number>maxNum){
                maxNum=number;
            }
        }

        System.out.println(maxNum);
    }

}

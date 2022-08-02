package day25_CustomMethods_Overloading;

public class WarmUpTask1_Sum {
    public static void main(String[] args) {
        System.out.println(sumOfTwoNumbers(20,50));
        System.out.println(sumOfThreeNumbers(20,50,80));
        System.out.println(sumOfFourNumbers(20,50,80,70));
    }

    public static int sumOfTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int sumOfThreeNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sumOfFourNumbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
}

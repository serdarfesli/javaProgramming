package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloadTask4_ReverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new double[]{10, 20, 30, 5})));
    }

    public static int[] reverseArray(int[] intArr) {
        int[] reversedArr = new int[intArr.length];
        for (int i = intArr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = intArr[i];
        }
        return reversedArr;
    }

    public static double[] reverseArray(double[] doubleArr) {
        double[] reversedArr = new double[doubleArr.length];
        for (int i = doubleArr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = doubleArr[i];
        }
        return reversedArr;
    }

    public static char[] reverseArray(char[] charArr) {
        char[] reversedArr = new char[charArr.length];
        for (int i = charArr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = charArr[i];
        }
        return reversedArr;
    }

    public static String[] reverseArray(String[] StringArr) {
        String[] reversedArr = new String[StringArr.length];
        for (int i = StringArr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = StringArr[i];
        }
        return reversedArr;
    }
}

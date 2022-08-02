package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class MethodOverloadTask1_MergeArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(mergeArrays(new String[]{"ali", "veli"}, new String[]{"deli"})));
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);
        return mergedArr;
    }

    public static double[] mergeArrays(double[] arr1, double[] arr2) {
        double[] mergedArr = new double[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);
        return mergedArr;
    }

    public static char[] mergeArrays(char[] arr1, char[] arr2) {
        char[] mergedArr = new char[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);
        return mergedArr;
    }

    public static String[] mergeArrays(String[] arr1, String[] arr2) {
        String[] mergedArr = new String[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);
        return mergedArr;
    }
}

package day27_WrapperClasses;

import myUtilities.MyArraysUtility;

public class Day27Task01InsertElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        MyArraysUtility.printWholeArray(insertElement(arr, 0, 300));
        MyArraysUtility.printWholeArray( insertElement(new String[]{"a","b"},1,"new"));
        MyArraysUtility.printWholeArray( insertElement(new char[]{'a','b','d'},2,'c'));
    }
    public static int[] insertElement(int[] arr, int indexNum, int element) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < indexNum; i++, j++) {
            newArr[j] = arr[i];
        }
        newArr[indexNum] = element;
        for (int i = indexNum, j = indexNum + 1; i < arr.length; j++, i++) {
            newArr[j] = arr[i];
        }

        return newArr;
    }
    public static double[] insertElement(double[] arr, int indexNum, double element) {

        double[] newArr = new double[arr.length + 1];
        for (int i = 0, j = 0; i < indexNum; i++, j++) {
            newArr[j] = arr[i];
        }
        newArr[indexNum] = element;
        for (int i = indexNum, j = indexNum + 1; i < arr.length; j++, i++) {
            newArr[j] = arr[i];
        }

        return newArr;
    }
    public static char[] insertElement(char[] arr, int indexNum, char element) {

        char[] newArr = new char[arr.length + 1];
        for (int i = 0, j = 0; i < indexNum; i++, j++) {
            newArr[j] = arr[i];
        }
        newArr[indexNum] = element;
        for (int i = indexNum, j = indexNum + 1; i < arr.length; j++, i++) {
            newArr[j] = arr[i];
        }

        return newArr;
    }
    public static String[] insertElement(String[] arr, int indexNum, String element) {

        String[] newArr = new String[arr.length + 1];
        for (int i = 0, j = 0; i < indexNum; i++, j++) {
            newArr[j] = arr[i];
        }
        newArr[indexNum] = element;
        for (int i = indexNum, j = indexNum + 1; i < arr.length; j++, i++) {
            newArr[j] = arr[i];
        }

        return newArr;
    }
}
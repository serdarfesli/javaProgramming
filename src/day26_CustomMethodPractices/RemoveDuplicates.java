package day26_CustomMethodPractices;

import myUtilities.MyArraysUtility;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 2, 3, 4, 5, 5, 5, 6, 7, 7, 7, 7};
        String[] arr2={"java","java","hello","hi","hi","hello","python"};
        MyArraysUtility.printWholeArray(removeDuplicates(arr2));
    }


    public static int[] removeDuplicates(int[] intArr) {
        int[] result = {};
        for (int i = 0; i < intArr.length; i++) {
            if (!MyArraysUtility.contains(result, intArr[i])) {
                result = MyArraysUtility.addElement(result, intArr[i]);
            }
        }
        return result;
    }
    public static double[] removeDuplicates(double[] doubleArr) {
        double[] result = {};
        for (int i = 0; i < doubleArr.length; i++) {
            if (!MyArraysUtility.contains(result, doubleArr[i])) {
                result = MyArraysUtility.addElement(result, doubleArr[i]);
            }
        }
        return result;
    }
    public static String[] removeDuplicates(String[] stringArr) {
        String[] result = {};
        for (int i = 0; i < stringArr.length; i++) {
            if (!MyArraysUtility.contains(result, stringArr[i])) {
                result = MyArraysUtility.addElement(result, stringArr[i]);
            }
        }
        return result;
    }
    public static char[] removeDuplicates(char[] charArr) {
        char[] result = {};
        for (int i = 0; i < charArr.length; i++) {
            if (!MyArraysUtility.contains(result, charArr[i])) {
                result = MyArraysUtility.addElement(result, charArr[i]);
            }
        }
        return result;
    }




}
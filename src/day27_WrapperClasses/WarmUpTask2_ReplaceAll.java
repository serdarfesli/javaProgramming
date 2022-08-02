package day27_WrapperClasses;

import myUtilities.MyArraysUtility;

public class WarmUpTask2_ReplaceAll {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 4, 4, 5, 2, 5};
        String[] arr2 = {"java", "java", "pyhton", "if", "else", "c++"};
        MyArraysUtility.printWholeArray(replaceAll(arr1, 4, 9));
        MyArraysUtility.printWholeArray(replaceAll(arr2, "java", "what"));
    }

    public static int[] replaceAll(int[] intArr, int oldElement, int newElement) {
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == oldElement) {
                intArr[i] = newElement;
            }
        }
        return intArr;
    }

    public static double[] replaceAll(double[] doubleArr, double oldElement, double newElement) {
        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] == oldElement) {
                doubleArr[i] = newElement;
            }
        }
        return doubleArr;
    }

    public static String[] replaceAll(String[] stringArr, String oldElement, String newElement) {
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].equals(oldElement)) {
                stringArr[i] = newElement;
            }
        }
        return stringArr;
    }

    public static char[] replaceAll(char[] charArr, char oldElement, char newElement) {
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == oldElement) {
                charArr[i] = newElement;
            }
        }
        return charArr;
    }
}

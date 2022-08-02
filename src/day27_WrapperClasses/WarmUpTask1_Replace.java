package day27_WrapperClasses;

import myUtilities.MyArraysUtility;

public class WarmUpTask1_Replace {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        String[] arr2 = {"java", "pyhton", "if", "else", "c++"};
        MyArraysUtility.printWholeArray(replace(arr2, 0, "Star"));
    }

    public static int[] replace(int[] intArr, int indexNum, int newNum) {
        intArr[indexNum] = newNum;
        return intArr;
    } //it replaces the number at given index with a new number

    public static double[] replace(double[] doubleArr, int indexNum, double newNum) {
        doubleArr[indexNum] = newNum;
        return doubleArr;
    } //it replaces the number at given index with a new number

    public static char[] replace(char[] charArr, int indexNum, char newCharacter) {
        charArr[indexNum] = newCharacter;
        return charArr;
    } //it replaces the char at given index with a new char

    public static String[] replace(String[] stringArr, int indexNum, String newStr) {
        stringArr[indexNum] = newStr;
        return stringArr;
    } //it replaces the string at given index with a new string
}

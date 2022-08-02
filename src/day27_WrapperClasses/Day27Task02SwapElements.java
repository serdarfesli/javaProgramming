package day27_WrapperClasses;

import myUtilities.MyArraysUtility;

public class Day27Task02SwapElements {
    public static void main(String[] args) {
  MyArraysUtility.printWholeArray( swapElement(new int[]{1,2,3,4,5},0,4));
        MyArraysUtility.printWholeArray( swapElement(new String[]{"abc","bbb","aaa","java","python"},0,4));
    }

    public static int[] swapElement(int[] arr, int i, int j) {
        int temporaryValue = arr[i];
        arr[i] = arr[j];
        arr[j] = temporaryValue;
        return arr;
    }    //swaps two elements at given index numbers
    public static double[] swapElement(double[] arr, int i, int j) {
        double temporaryValue = arr[i];
        arr[i] = arr[j];
        arr[j] = temporaryValue;
        return arr;
    }    //swaps two elements at given index numbers
    public static char[] swapElement(char[] arr, int i, int j) {
        char temporaryValue = arr[i];
        arr[i] = arr[j];
        arr[j] = temporaryValue;
        return arr;
    }    //swaps two elements at given index numbers
    public static String[] swapElement(String[] arr, int i, int j) {
        String temporaryValue = arr[i];
        arr[i] = arr[j];
        arr[j] = temporaryValue;
        return arr;
    }    //swaps two elements at given index numbers
    
}

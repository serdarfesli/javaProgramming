package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class WarmUpTask2_AddElementToArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString (addElement(new int[]{1, 2, 3}, 4)));
        System.out.println(Arrays.toString (addElement(new double[]{1.5,2.5},3.5)));
        System.out.println(Arrays.toString (addElement(new String[]{"munir","cihan"},"fesli")));
        System.out.println(Arrays.toString (addElement(new char[]{'a','b'},'c')));
    }



    public static int[] addElement (int[] arr, int number) {

        int[] newArr = new int[arr.length + 1];
        newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = number;

        return newArr;
    }
    public static double[] addElement(double[] arr, double number) {

        double[] newArr = new double[arr.length + 1];
        newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = number;

        return newArr;
    }
    public static String[] addElement(String[] arr, String word) {

        String[] newArr = new String[arr.length + 1];
        newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = word;

        return newArr;
    }
    public static char[] addElement(char[] arr, char ch) {

        char[] newArr = new char[arr.length + 1];
        newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = ch;

        return newArr;
    }
}

package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2Dtens = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
// 3 Dimensioanl Arrays contain 2D arrays.
        // int [][][] arr3D = {{{1,2,3},{4,5,6},{7,8,9}},{{7,8,9},{4,5,6},{1,2,3}}};
        int[][][] arr3D = {arr2D, arr2Dtens};
        //           index     0        1
        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr3D[1]));  //to print for multi-dimensional Array
        System.out.println(Arrays.toString(arr3D[1][1]));  // to print single dimensional Array

        for (int[][] ints : arr3D) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.print(i + " ");
                }
            }
        }














    }
}

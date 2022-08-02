package day22_MultiDimensionalArray;

import java.util.Arrays;

public class Day22Task01_Reverse2DArray {
    public static void main(String[] args) {
        int[][] array2D = {{1, 2, 3}, {4, 5, 6},{7,8,9,10}};
        int[][] array2Dreversed = new int[array2D.length][];
        for (int i = array2D.length - 1, irev = 0; i >= 0; i--, irev++) {
            for (int j = array2D[i].length - 1, jrev = 0; j >= 0; j--, jrev++) {
                array2Dreversed[irev][jrev] = array2D[i][j];
            }
        }
        System.out.println(Arrays.deepToString(array2Dreversed));
    }

}


/*


 */


/*
Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */
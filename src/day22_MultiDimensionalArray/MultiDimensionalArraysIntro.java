package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {
    public static void main(String[] args) {
//                                     0,1,2, 3, 4
int[][] arr2D = {{1,2,3} , {4,5,6,7}, {8,9,10,11,12}};
  //          indx=0          1            2

        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[2][3]); // 11
        System.out.println(Arrays.deepToString(arr2D));



    }
}


package day24_CustomMethods_Return;

import java.util.Arrays;

public class Day24Task10_removeElement {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(removeElement(new int[]{0, 1, 2, 9,9,9,9,9,9,9,9,333}, 10)));

        System.out.println("---------------------");

        System.out.println(Arrays.toString(removeElementVersion2(new int[]{0, 1, 2, 3}, 2)));
    }


    public static int[] removeElement(int[] arr, int indexNumber) {  // arr={0,1,2,3}   index:2
        int[] arrNew = new int[arr.length - 1];

        System.arraycopy(arr, 0, arrNew, 0, indexNumber);
        System.arraycopy(arr, indexNumber + 1, arrNew, indexNumber, arrNew.length - indexNumber);
        return arrNew;
    } //version1

    public static int[] removeElementVersion2(int[] arr2, int indexNum) {  ////   version 2      arr={0,1,2,3}   index:2

        int[] arrNew2 = new int[arr2.length - 1];
        for (int i = 0; i < indexNum; i++) {
            arrNew2[i] = arr2[i];
        }
        for (int i = indexNum + 1; i < arr2.length; i++) {
            arrNew2[i - 1] = arr2[i];
        }
        return arrNew2;
    }


}

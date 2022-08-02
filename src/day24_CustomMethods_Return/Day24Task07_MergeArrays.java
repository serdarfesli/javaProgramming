package day24_CustomMethods_Return;

import java.util.Arrays;

public class Day24Task07_MergeArrays {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(  mergeArrays(new int[]{1,2,3},new int[]{4,5})        ));

        System.out.println(Arrays.toString(  mergeArraysVersion2(new int[]{1,2,3},new int[]{4,5})  ));

    }

    public static int[] mergeArrays (int[] arr1, int[] arr2){

        int[] arrNew= new int[arr1.length+ arr2.length];
        System.arraycopy(arr1, 0, arrNew, 0, arr1.length);
        System.arraycopy(arr2, 0, arrNew, arr1.length, arr2.length);

return arrNew;
    }  //version1
    public static int[] mergeArraysVersion2 (int[] arr3,int[] arr4){
        int[] arrNew2 = new int[arr3.length+ arr4.length];
        int i=0;
        for (int elementsArr3 : arr3) {
            arrNew2[i++]=elementsArr3;
        }
        for (int elementArr4 : arr4) {
            arrNew2[i++]=elementArr4;
        }
return arrNew2;
    } //version2

}
/*// Method to concatenate two arrays in Java
public static String[] concatenate(String[] first, String[] second)
{
    String[] arr = new String[first.length + second.length];

    System.arraycopy(first, 0, arr, 0, first.length);
    System.arraycopy(second, 0, arr, first.length, second.length);

    return arr;

 */
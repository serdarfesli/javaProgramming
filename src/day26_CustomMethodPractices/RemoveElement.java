package day26_CustomMethodPractices;

import myUtilities.MyArraysUtility;

public class RemoveElement {
    public static void main(String[] args) {
        
       int[] arr1={1,2,3,4,5};
       String[] arr2={"hello","cydeo","welcome"};
       char[] arr3={'A','B','C','D'};
     MyArraysUtility.printWholeArray( removeElement(arr1,0) );
    MyArraysUtility.printEachElementOfArray(removeElement(arr2,2));
MyArraysUtility.printWholeArray( removeElement(arr3,1));
        
        
    }
    public static int[] removeElement(int[] intArr, int indexNum) {
        int[] newArr = new int[intArr.length - 1];
        for (int i = 0; i < indexNum; i++) {
            newArr[i] = intArr[i];
        }
        for (int i = indexNum + 1; i < intArr.length; i++) {
            newArr[i - 1] = intArr[i];
        }
        return newArr;
    }
    public static double[] removeElement(double[] doubleArr, int indexNum) {
        double[] newArr = new double[doubleArr.length - 1];
        for (int i = 0; i < indexNum; i++) {
            newArr[i] = doubleArr[i];
        }
        for (int i = indexNum + 1; i < doubleArr.length; i++) {
            newArr[i - 1] = doubleArr[i];
        }
        return newArr;
    }
    public static String[] removeElement(String[] stringArr, int indexNum) {
        String[] newArr = new String[stringArr.length - 1];
        for (int i = 0; i < indexNum; i++) {
            newArr[i] = stringArr[i];
        }
        for (int i = indexNum + 1; i < stringArr.length; i++) {
            newArr[i - 1] = stringArr[i];
        }
        return newArr;
    }
    public static char[] removeElement(char[] charArr, int indexNum) {
        char[] newArr = new char[charArr.length - 1];
        for (int i = 0; i < indexNum; i++) {
            newArr[i] = charArr[i];
        }
        for (int i = indexNum + 1; i < charArr.length; i++) {
            newArr[i - 1] = charArr[i];
        }
        return newArr;
    }
    
    
    
}

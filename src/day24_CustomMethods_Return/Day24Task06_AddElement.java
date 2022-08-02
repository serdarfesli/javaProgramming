package day24_CustomMethods_Return;

import java.util.Arrays;

public class Day24Task06_AddElement {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(addElement(new int[]{1,2,3,4},5)));

    }

    public static int[] addElement(int[] Arr1,int number){
        int[] newArray =new int[Arr1.length+1];
        newArray= Arrays.copyOf(Arr1,newArray.length);
        newArray[newArray.length-1]=number;
        return newArray;
    }

}
/*
6. create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}
 */
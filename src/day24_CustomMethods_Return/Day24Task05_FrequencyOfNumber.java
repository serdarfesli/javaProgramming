package day24_CustomMethods_Return;

public class Day24Task05_FrequencyOfNumber {
    public static void main(String[] args) {
       int[] Arr1={1,2,3,4,5};          //version1
        System.out.println(   frequencyOfNumber(Arr1,3)   );

        System.out.println("-------------");

        System.out.println(  frequencyOfNumber(new int[]{1,2,3,3,3,3,4,5},3)   );     //version2

    }
    public static int frequencyOfNumber(int[] intArray,int number){
        int frequency=0;
        for (int i : intArray) {
            if (i==number){
                frequency++;
            }
        }
        return frequency;
    }



}

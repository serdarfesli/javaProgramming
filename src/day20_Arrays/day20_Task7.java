package day20_Arrays;

public class day20_Task7 {
    public static void main(String[] args) {

      int[] number ={1,2,3,4,5};
        int[] number2 = {4,5,6,7,8};
        String commonNumbers="";
        for (int i = 0; i < number.length ; i++) {
            for (int j = 0; j < number2.length ; j++) {
                if (number[i]==number2[j]){
                    System.out.print(number[i] + " ");
                }
            }

        }

    }
}
/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */
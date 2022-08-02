package day21_ForEachLoop;

public class Day21Task03_CommonElements {
    public static void main(String[] args) {
        int[] numbers1 = {1, 5, 4, 8, 7, 9, 6, 3, 2};
        int[] numbers2 = {78, 6, 4, 88, 99, 66};

        for (int each1 : numbers1) {

            for (int each2 : numbers2) {
                if (each1 == each2) {
                    System.out.print(each1 + " ");
                }
            }
        }
    }
}
/*
3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops

 */
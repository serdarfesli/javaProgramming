package day21_ForEachLoop;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] numbers1 = {1,2,3,4};
        int[] numbers2 = {5,6};
        int[] numbersMerged = new int[numbers1.length+ numbers2.length];

        for (int i = 0; i < numbers1.length ; i++) {
            numbersMerged[i] = numbers1[i];
        }
        for (int i = 0,j= numbers1.length;  i < numbers2.length ; i++,j++) {
            numbersMerged[j]=numbers2[i];
        }
        System.out.println(Arrays.toString(numbersMerged));

        System.out.println("--------------");
char[] ch1 ={'a','b','c'};
char[] ch2 = {'d','e','f','g','h'};
char[] mergedChars = new char[ch1.length+ ch2.length];

    int i=0;
        for (char each : ch1) {
            mergedChars[i++]=each;
        }
        for (char each2 : ch2) {
            mergedChars[i++]=each2;
        }

        System.out.println(Arrays.toString(mergedChars));


    }
}

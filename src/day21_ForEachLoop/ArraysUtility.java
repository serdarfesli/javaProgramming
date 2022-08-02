package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

int [] numbers ={1,3,5,6,4,3,7,6,8};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
String [] names ={ "gşlkasdşlaksd", "dşlasdk","asdaldiş","şfidslsi"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("--------------------------------");



        char[] ch1 = {'a','c','b'};
        char[] ch2 = {'b','a','c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println(anagram);





    }
}

package day24_CustomMethods_Return;

import java.util.Arrays;

public class Day24Task02_Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("abc","bcad"));

    }

    public static boolean isAnagram(String str1,String str2){
        char[] ch1= str1.toCharArray();
        char[] ch2= str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
       boolean isAnagram= Arrays.equals(ch1,ch2);
        return isAnagram;
    }


}

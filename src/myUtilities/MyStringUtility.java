package myUtilities;

import java.util.Arrays;

public class MyStringUtility {


    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    } //prints each character of each of the given string


    public static String reverseIt(String str) {

        String reversedString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString += "" + str.charAt(i);
        }
        return reversedString;
    } // it reverses the given String,returns the reversed String

    public static boolean isPalindrome(String str) {
        return (str.equalsIgnoreCase(reverseIt(str)));
    }// checks if the string is palindrome, returns boolean

    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    } // checks whether 2 strings are anagram(made of same length and letters),returns boolean


    public static String removeDuplicates(String str) {
        String container = "";

        for (int i = 0; i < str.length(); i++) {
            if (!(container.toLowerCase().contains("" + str.toLowerCase().charAt(i)))) {
                container += "" + str.charAt(i);
            }
        }
        return container;
    } //it ignores the case sensivity and removes all the duplicated characters.
}

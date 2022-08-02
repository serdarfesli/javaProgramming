package day23_CustomMethods_Void;

import java.util.Arrays;

public class Day23Task11_17 {
    public static void main(String[] args) {

        kgToPound(25);
        isPositiveNegativeOrZero(78);

        printEachChar("Java and Selenium");

        int[] arrayscores = {1, 2, 3, 4, 5, 6};
        printEachElement(arrayscores);
        printEachElement(new int[]{10, 20, 30});

        System.out.println();

        calculator(10, 20, '-');

        fullNameRegular("mahmUT", "deMir");
        checkAnagram("java", "aavj");
    }

    public static void printEachElement(int[] integerArray) {
        for (int i : integerArray) {
            System.out.print(i + " ");
        }
    }

    public static void kgToPound(int kilo) {
        double pound = kilo * 2.20462262185;
        System.out.println("pound = " + pound);
    } //Task11

    public static void isPositiveNegativeOrZero(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }//Task12

    public static void printEachChar(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    } //Task13

    public static void calculator(int num1, int num2, char operator) {
        double result = 0;
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else {
                result = num1 / num2;
            }

        } else {
            System.out.println("Invalid Operator");
        }
        System.out.println("result = " + result);
    }

    public static void fullNameRegular(String str1, String str2) {
        String fullName = str1.substring(0, 1).toUpperCase() + str1.substring(1).toLowerCase() + " "
                + str2.substring(0, 1).toUpperCase() + str2.substring(1).toLowerCase();
        System.out.println(fullName);
    }

    public static void checkAnagram(String str1, String str2) {
        char ch1 = ' ';
        char ch2 = ' ';


        for (int i = 0; i < str1.length(); i++) {
            ch1 = str1.charAt(i);
        }

        for (int j = 0; j < str2.length(); j++) {
            ch2 = str2.charAt(j);
        }
        if (str1.length() == str2.length() && str1.contains("" + ch2) && str2.contains("" + ch1)) {
            System.out.println(str1 + " and " + str2 + " are anagram");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT anagram");
        }
    }

}

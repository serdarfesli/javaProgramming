package myUtilities;

import java.util.Arrays;

public class MyArraysUtility {

    public static void printWholeArray(int[] intArray) {
        System.out.println(Arrays.toString(intArray));
    } //prints int Array
    public static void printWholeArray(double[] doubleArray) {
        System.out.println(Arrays.toString(doubleArray));
    } // prints double Array
    public static void printWholeArray(char[] charArray) {
        System.out.println(Arrays.toString(charArray));
    }  // prints char Array
    public static void printWholeArray(String[] stringArray) {
        System.out.println(Arrays.toString(stringArray));
    }    // prints String Array


    public static void printEachElementOfArray(int[] intArr) {
        for (int each : intArr) {
            System.out.println(each);
        }
    } // prints each element of int Array in separate lines
    public static void printEachElementOfArray(String[] stringArr) {
        for (String each : stringArr) {
            System.out.println(each);
        }
    }  // prints each element of String Array in separate lines
    public static void printEachElementOfArray(char[] charArr) {
        for (char each : charArr) {
            System.out.println(each);
        }
    }   // prints each element of char Array in separate lines


    public static int maxNumberOfArray(int[] intArr) {
        int maxNum = intArr[0];
        for (int each : intArr) {
            if (each > maxNum) {
                maxNum = each;
            }
        }
        return maxNum;
    }    //it returns the max num of the integer array
    public static double maxNumberOfArray(double[] doubleArr) {
        double maxNum = doubleArr[0];
        for (double each : doubleArr) {
            if (each > maxNum) {
                maxNum = each;
            }
        }
        return maxNum;
    }   //it returns the max num of the double array


    public static int minNumberOfArray(int[] intArr) {
        int minNum = intArr[0];
        for (int each : intArr) {
            if (each < minNum) {
                minNum = each;
            }
        }
        return minNum;
    }   //it returns the min num of the integer array
    public static double minNumberOfArray(double[] doubleArr) {
        double minNum = doubleArr[0];
        for (double each : doubleArr) {
            if (each < minNum) {
                minNum = each;
            }
        }
        return minNum;
    }  //it returns the min num of the double array


    public static boolean contains(int[] intArr, int num) {
        boolean isArrayContains = false;
        for (int each : intArr) {
            if (num == each) {
                isArrayContains = true;
            }
        }
        return isArrayContains;
    }   // it returns whether the integer array contains the given number
    public static boolean contains(double[] doubleArr, double num) {
        boolean isArrayContains = false;
        for (double each : doubleArr) {
            if (num == each) {
                isArrayContains = true;
            }
        }
        return isArrayContains;
    }   // it returns whether the double array contains the given number
    public static boolean contains(String[] stringArr, String str) {
        boolean isArrayContains = false;
        for (String each : stringArr) {
            if (str.equals(each)) {
                isArrayContains = true;
            }
        }
        return isArrayContains;
    }   // it returns whether the String array contains the given string
    public static boolean contains(char[] charArr, char ch) {
        boolean isArrayContains = false;
        for (char each : charArr) {
            if (ch == each) {
                isArrayContains = true;
            }
        }
        return isArrayContains;
    }   // it returns whether the char array contains the given char


    public static int[] mergeArrays(int[] arr1, int[] arr2)  {
        int[] mergedArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);
        return mergedArr;
    }    //merge two int arrays, returns arrays
    public static double[] mergeArrays(double[] arr1, double[] arr2) {
        double[] mergedArr = new double[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);
        return mergedArr;
    }  //merge two double arrays, returns arrays
    public static char[] mergeArrays(char[] arr1, char[] arr2) {
        char[] mergedArr = new char[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);
        return mergedArr;
    }   //merge two char arrays, returns arrays
    public static String[] mergeArrays(String[] arr1, String[] arr2) {
        String[] mergedArr = new String[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);
        return mergedArr;
    }    //merge two String arrays, returns arrays


    public static int[] reverseArray(int[] intArr) {
        int[] reversedArr = new int[intArr.length];
        for (int i = intArr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = intArr[i];
        }
        return reversedArr;
    }     //reverse int array,returns int array
    public static double[] reverseArray(double[] doubleArr) {
        double[] reversedArr = new double[doubleArr.length];
        for (int i = doubleArr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = doubleArr[i];
        }
        return reversedArr;
    }     //reverse double array,returns double array
    public static char[] reverseArray(char[] charArr) {
        char[] reversedArr = new char[charArr.length];
        for (int i = charArr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = charArr[i];
        }
        return reversedArr;
    }     //reverse char array,returns char array
    public static String[] reverseArray(String[] stringArr) {
        String[] reversedArr = new String[stringArr.length];
        for (int i = stringArr.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArr[j] = stringArr[i];
        }
        return reversedArr;
    }     //reverse String array,returns String array


    public static int frequencyOfElement(int[] intArr, int num) {
        int frequency = 0;
        for (int each : intArr) {
            if (num == each) {
                frequency++;
            }
        }
        return frequency;
    }
    public static int frequencyOfElement(double[] doubleArr, double num) {
        int frequency = 0;
        for (double each : doubleArr) {
            if (num == each) {
                frequency++;
            }
        }
        return frequency;
    }
    public static int frequencyOfElement(char[] charArr, char ch) {
        int frequency = 0;
        for (int each : charArr) {
            if (ch == each) {
                frequency++;
            }
        }
        return frequency;
    }
    public static int frequencyOfElement(String[] StringArr, String str) {
        int frequency = 0;
        for (String each : StringArr) {
            if (str.equals(each)) {
                frequency++;
            }
        }
        return frequency;
    }


    public static int[] addElement (int[] arr, int number) {

        int[] newArr = new int[arr.length + 1];
        newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = number;

        return newArr;
    }
    public static double[] addElement(double[] arr, double number) {

        double[] newArr = new double[arr.length + 1];
        newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = number;

        return newArr;
    }
    public static String[] addElement(String[] arr, String word) {

        String[] newArr = new String[arr.length + 1];
        newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = word;

        return newArr;
    }
    public static char[] addElement(char[] arr, char ch) {

        char[] newArr = new char[arr.length + 1];
        newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[newArr.length - 1] = ch;

        return newArr;
    }



    public static int[] removeElement(int[] intArr, int indexNum)  {
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


    public static int[] uniqueElements (int[] intArr){
        int[] uniqueElements={};
        for (int each : intArr) {
            if (MyArraysUtility.frequencyOfElement(intArr,each)==1){
                uniqueElements= MyArraysUtility.addElement(uniqueElements,each);
            }
        }
        return uniqueElements;

    }
    public static String[] uniqueElements (String[] stringArr){
        String[] uniqueElements={};
        for (String each : stringArr) {
            if (MyArraysUtility.frequencyOfElement(stringArr,each)==1){
                uniqueElements= MyArraysUtility.addElement(uniqueElements,each);
            }
        }
        return uniqueElements;

    }
    public static char[] uniqueElements (char[] charArr){
        char[] uniqueElements={};
        for (char each : charArr) {
            if (MyArraysUtility.frequencyOfElement(charArr,each)==1){
                uniqueElements= MyArraysUtility.addElement(uniqueElements,each);
            }
        }
        return uniqueElements;

    }
        public static double[] uniqueElements (double[] doubleArr){
            double[] uniqueElements={};
            for (double each : doubleArr) {
                if (MyArraysUtility.frequencyOfElement(doubleArr,each)==1){
                    uniqueElements= MyArraysUtility.addElement(uniqueElements,each);
                }
            }
            return uniqueElements;

        }


    public static int[] replace(int[] intArr, int indexNum, int newNum) {
        intArr[indexNum]=newNum;
        return intArr;
    } //it replaces the number at given index with a new number
    public static double[] replace(double[] doubleArr, int indexNum, double newNum) {
        doubleArr[indexNum]=newNum;
        return doubleArr;
    } //it replaces the number at given index with a new number
    public static char[] replace(char[] charArr, int indexNum, char newCharacter) {
        charArr[indexNum]=newCharacter;
        return charArr;
    } //it replaces the char at given index with a new char
    public static String[] replace(String[] stringArr, int indexNum, String newStr) {
        stringArr[indexNum]=newStr;
        return stringArr;
    } //it replaces the string at given index with a new string


    public static int[] replaceAll(int[] intArr, int oldElement, int newElement) {
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == oldElement) {
                intArr[i] = newElement;
            }
        }
        return intArr;
    }
    public static double[] replaceAll(double[] doubleArr, double oldElement, double newElement) {
        for (int  i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] == oldElement) {
                doubleArr[i] = newElement;
            }
        }
        return doubleArr;
    }
    public static String[] replaceAll(String[] stringArr, String oldElement, String newElement) {
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].equals(oldElement)) {
                stringArr[i] = newElement;
            }
        }
        return stringArr;
    }
    public static char[] replaceAll(char[] charArr, char oldElement, char newElement) {
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i]==oldElement) {
                charArr[i] = newElement;
            }
        }
        return charArr;
    }


    public static int[] removeDuplicates(int[] intArr) {
        int[] result = {};
        for (int i = 0; i < intArr.length; i++) {
            if (!MyArraysUtility.contains(result, intArr[i])) {
                result = MyArraysUtility.addElement(result, intArr[i]);
            }
        }
        return result;
    }    //removes duplicated elements in the Array
    public static double[] removeDuplicates(double[] doubleArr) {
        double[] result = {};
        for (int i = 0; i < doubleArr.length; i++) {
            if (!MyArraysUtility.contains(result, doubleArr[i])) {
                result = MyArraysUtility.addElement(result, doubleArr[i]);
            }
        }
        return result;
    }    //removes duplicated elements in the Array
    public static String[] removeDuplicates(String[] stringArr) {
        String[] result = {};
        for (int i = 0; i < stringArr.length; i++) {
            if (!MyArraysUtility.contains(result, stringArr[i])) {
                result = MyArraysUtility.addElement(result, stringArr[i]);
            }
        }
        return result;
    }    //removes duplicated elements in the Array
    public static char[] removeDuplicates(char[] charArr) {
        char[] result = {};
        for (int i = 0; i < charArr.length; i++) {
            if (!MyArraysUtility.contains(result, charArr[i])) {
                result = MyArraysUtility.addElement(result, charArr[i]);
            }
        }
        return result;
    }    //removes duplicated elements in the Array


    public static int[] insertElement(int[] arr, int indexNum, int element) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < indexNum; i++, j++) {
            newArr[j] = arr[i];
        }
        newArr[indexNum] = element;
        for (int i = indexNum, j = indexNum + 1; i < arr.length; j++, i++) {
            newArr[j] = arr[i];
        }

        return newArr;
    }          //inserts new element at given index
    public static double[] insertElement(double[] arr, int indexNum, double element) {

        double[] newArr = new double[arr.length + 1];
        for (int i = 0, j = 0; i < indexNum; i++, j++) {
            newArr[j] = arr[i];
        }
        newArr[indexNum] = element;
        for (int i = indexNum, j = indexNum + 1; i < arr.length; j++, i++) {
            newArr[j] = arr[i];
        }

        return newArr;
    }          //inserts new element at given index
    public static char[] insertElement(char[] arr, int indexNum, char element) {

        char[] newArr = new char[arr.length + 1];
        for (int i = 0, j = 0; i < indexNum; i++, j++) {
            newArr[j] = arr[i];
        }
        newArr[indexNum] = element;
        for (int i = indexNum, j = indexNum + 1; i < arr.length; j++, i++) {
            newArr[j] = arr[i];
        }

        return newArr;
    }          //inserts new element at given index
    public static String[] insertElement(String[] arr, int indexNum, String element) {

        String[] newArr = new String[arr.length + 1];
        for (int i = 0, j = 0; i < indexNum; i++, j++) {
            newArr[j] = arr[i];
        }
        newArr[indexNum] = element;
        for (int i = indexNum, j = indexNum + 1; i < arr.length; j++, i++) {
            newArr[j] = arr[i];
        }

        return newArr;
    }          //inserts new element at given index


    public static int[] swapElement(int[] arr, int i, int j) {
        int temporaryValue = arr[i];
        arr[i] = arr[j];
        arr[j] = temporaryValue;
        return arr;
    }    //swaps two elements at given index numbers
    public static double[] swapElement(double[] arr, int i, int j) {
        double temporaryValue = arr[i];
        arr[i] = arr[j];
        arr[j] = temporaryValue;
        return arr;
    }    //swaps two elements at given index numbers
    public static char[] swapElement(char[] arr, int i, int j) {
        char temporaryValue = arr[i];
        arr[i] = arr[j];
        arr[j] = temporaryValue;
        return arr;
    }    //swaps two elements at given index numbers
    public static String[] swapElement(String[] arr, int i, int j) {
        String temporaryValue = arr[i];
        arr[i] = arr[j];
        arr[j] = temporaryValue;
        return arr;
    }    //swaps two elements at given index numbers
}
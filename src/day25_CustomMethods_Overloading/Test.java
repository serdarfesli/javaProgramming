package day25_CustomMethods_Overloading;

import myUtilities.MyArraysUtility;
import myUtilities.MyStringUtility;

public class Test {
    public static void main(String[] args) {

        String str1 = "kelek";
        MyStringUtility.printEachChar(str1);

        System.out.println(MyStringUtility.reverseIt(str1));
        String str2= "Cydeo School";

        System.out.println( MyStringUtility.reverseIt(str2));

        System.out.println( MyStringUtility.isPalindrome(str1));
        System.out.println( MyStringUtility.isPalindrome(str2));

        String[] names={"Anna","Java","racecar","Py thon","Mom","Cydeo"};
        int count=0;
        for (String each : names) {
            if (MyStringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("---------------------------");

        String str3="Annaiasdşilişsdflşisflsdifslfişslaşisdlasi";
        String str4 ="Naani";

        System.out.println(  MyStringUtility.isAnagram(str3,str4)  );

        System.out.println("--------------------------------");

        System.out.println( MyStringUtility.removeDuplicates(str3) );

        System.out.println("-------------------------");

        int[] arr1 ={ 10,20,30,40,50};
        String[] arr2 ={ "hello","world","java","programming","language"};
        MyArraysUtility.printWholeArray(arr1);
        MyArraysUtility.printWholeArray(arr2);

        MyArraysUtility.printEachElementOfArray(arr1);
        MyArraysUtility.printEachElementOfArray(arr2);

        System.out.println( MyArraysUtility.maxNumberOfArray(arr1)  );
        System.out.println(   MyArraysUtility.minNumberOfArray(arr1)  );

        System.out.println( MyArraysUtility.contains(arr1,70)  );
        System.out.println( MyArraysUtility.contains(arr2,"world")  );
    }
}

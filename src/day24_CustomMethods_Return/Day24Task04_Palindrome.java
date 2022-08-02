package day24_CustomMethods_Return;

public class Day24Task04_Palindrome {
    public static void main(String[] args) {
        System.out.println( isPalindrome("ava") );
    }
    public static boolean isPalindrome (String str1){
       boolean isPalindrome =str1.equalsIgnoreCase(Day24Task03_ReverseMethod.reverse(str1));
        return isPalindrome;
    }

}
/*
4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true
 */
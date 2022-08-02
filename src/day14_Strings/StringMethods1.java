package day14_Strings;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "     hello Wordl        ";
        str1.trim(); //removes the white spaces, in other words unused spaces.
        System.out.println("str1 = " + str1);/* returns "     hello Wordl        "
        because we need to re assign it.*/
        str1 = str1.trim(); /* we need to re-assign otherwise we can't use
        the new version of data.   */
        System.out.println("str1 = " + str1); // returns hello World

        System.out.println("------------------------");

        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h"); //returns integer. index number of the first "h"
        System.out.println("n1 = " + n1); // returns 8
        int n2 = str2.indexOf("ool"); /*finds "ool" in the string and returns
                                        that "o"'s index number */
        System.out.println("n2 = " + n2); // returns 9
        String str3 = " Java Programming Language";
        int n3 = str3.indexOf("a"); //it gives the first "a". starting from the left
        int n4 = str3.indexOf("ang"); //returns the 4th "a".
        System.out.println("n4 = " + n4);


    }
}

package day14_Strings;

public class StringMethods3 {
    public static void main(String[] args) {
        String word2 = "Java Programming Language";
        String s1 = word2.substring((word2.indexOf('J')), (word2.indexOf(" ")));
        System.out.println("s1 = " + s1);//s1 = Java
        String s2 = word2.substring((word2.indexOf(" ")+1), (word2.indexOf("g ") + 1));
        System.out.println("s2 = " + s2);//s2 = Programming
        String s3 = word2.substring(word2.indexOf("L"));
        System.out.println("s3 = " + s3);//s3 = Language, default:it takes up to en
                    // we don't need to specify if we want to take the rest of string

    }
}

package day13_String;

public class FirstAndLastCharsSame {
    public static void main(String[] args) {
        String s1= "Giraffe";
        char firstChar= s1.charAt(0);
        char lastChar=s1.charAt(s1.length()-1);
       String result = (firstChar==lastChar)? "same" : "not same";
        System.out.println("result = " + result);
    }
}

package day13_String;

public class StringMethods {
    public static void main(String[] args) {
        String word = "Cydeo";
        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar); // returns 'd'

        char fourthChar = word.charAt(4);
        System.out.println("tenthChar = " + fourthChar);

        System.out.println("--------------------------------");

        String s1 = "Hey, How are you?";
        int totalChars = s1.length();
char lastChar = s1.charAt(s1.length() - 1);
        System.out.println("lastChar = " + lastChar);

        System.out.println("--------------------------------");

        String lowers1 = s1.toLowerCase();
        System.out.println("lowers1 = " + lowers1);
        String uppers1 = s1.toUpperCase();
        System.out.println("uppers1 = " + uppers1);
        String sentence = "Today is a great day to learn Java";
        sentence = sentence.toUpperCase();
        System.out.println("sentence = " + sentence);

    }
}

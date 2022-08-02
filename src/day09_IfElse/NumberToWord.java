package day09_IfElse;

public class NumberToWord {
    public static void main(String[] args) {
        int number = 5;
        String Word;

        if (number == 1) {
            Word = "One";
        } else if (number == 2) {
            Word = "Two";
        } else if (number == 3) {
            Word = "Three";
        } else if (number == 4) {
            Word = "Four";
        } else if (number == 5) {
            Word = "Five";
        } else if (number == 6) {
            Word = "Six";
        } else if (number == 7) {
            Word = "Seven";
        } else if (number == 8) {
            Word = "Eight";
        } else {
            Word = "Nine";
        }

        System.out.println(Word);
    }
}

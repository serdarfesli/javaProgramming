package day21_ForEachLoop;

public class Day21Task04_NumberOfPalindrome {
    public static void main(String[] args) {
        String[] words = {"anna", "level", "Java", "Ali", "kelek","asa","cihan"};
                int numOfPalindrome=0;

        for (String each : words) {
            String reversed ="";
            for (int i = each.length()-1; i >=0 ; i--) {
                   reversed += "" + each.charAt(i);
                }
            if (each.equals(reversed)){
                numOfPalindrome++;
            }
        }
        System.out.println(numOfPalindrome);
    }
}
/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2

 */
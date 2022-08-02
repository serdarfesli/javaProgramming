package day16_ForLoopsStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str1 = "asdlşkşlkweşlweropı";
        String uniqueLetters = "";

        for (int i = 0; i <= str1.length() - 1; i++) {
            String letter = "" + str1.charAt(i);
            if (str1.indexOf(letter) == str1.lastIndexOf(letter)) { //if the first and last index numbers are same then the character is unique.
                uniqueLetters += letter;
            }
        }
        System.out.println("uniqueLetters = " + uniqueLetters);
    }
}
/*
3. Write a program that can return the unique characters from a
String
Ex:
input:
AABCCD
output:
BD
Hint: You will need indexOf() and
lastIndexOf()
  if the first and last index
numbers of the character are same, then it's unique
  indexOf('A') ==> 0
  lastIndexOf('A') ==> 1
  indexOf('B') ==>2
  lastIndexOf('B') ==> 2
 */
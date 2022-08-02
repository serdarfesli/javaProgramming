package day09_IfElse;

public class CharacterIdentity {
    public static void main(String[] args) {
        char character = '@';
        String Message;
        boolean alphabeticCharacter = (character >= 97 && character <= 122) || (character >= 65 && character <= 90);
        boolean digit = character >= 48 && character <= 57;
        if (alphabeticCharacter) {
            Message = "Alphabetic Character(A~Z or a~Z)";
        } else if (digit) {
            Message = "Digit";
        } else {
            Message = "Special Character";
        }
        System.out.println("The Character is a " + Message);
    }
}


/*
Create a class called Character Identity, and write a program that can identify if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character

		Ex:
			ch = '@'

		output:
			Special Character

		HINT: You may want to check out the numbers of the characters on ASCII table

 */
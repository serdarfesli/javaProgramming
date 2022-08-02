package day22_MultiDimensionalArray;

public class ReverseSecondWord {
    public static void main(String[] args) {
String sentence = "I Love Java";
String reversedWord="";
String newSentence="";
String [] arrSentence = sentence.split(" ");
        for (int i = arrSentence[1].length()-1 ;i >=0 ; i--) {
            reversedWord+= ""+arrSentence[1].charAt(i);
        }
sentence= sentence.replace("Love",reversedWord);
        System.out.println(sentence);




    }
}
/*
. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java
 */
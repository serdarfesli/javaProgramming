package day22_MultiDimensionalArray;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence= "Today is a good day to learn Java";
        String [] sentenceArray = sentence.split(" ");
        String reversedSentence= "";
        for (int i = sentenceArray.length - 1; i >= 0; i--) {
            reversedSentence+= sentenceArray[i] + " ";
        }

        System.out.println(reversedSentence);





    }
}
/*
Write a programme that can reverse a sentence
 */
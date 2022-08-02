package day24_CustomMethods_Return;

public class Day24Task01_FrequencyOfWord {
    public static void main(String[] args) {
        System.out.println(frequencyOfWord("Java java java cihan Asude python Asude python","python"));

    }

    public static int frequencyOfWord (String sentence,String word){
        int frequency =0;
        for (int i = 0; i <sentence.length()-word.length()+1; i++) {
            if (sentence.substring(i,i+word.length()).equalsIgnoreCase(word)){
                frequency++;
            }

        }
        return frequency;
    }

}
/*
create a method named frequencyOfWord that passes two parameters: string sentence and String word,
then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */
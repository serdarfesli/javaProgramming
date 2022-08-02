package day19_LoopPractices;

public class UniqueCharactersWithoutUsingIndexOrLastIndexVersion2 {
    public static void main(String[] args) {
        String word = "fgjajjkkklll";
        String container = "";
        int frequency;
        for (int i = 0; i < word.length(); i++) {
            frequency = 0;
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(i);
                char eachChar = word.charAt(j);
                if (ch == eachChar) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                container += word.charAt(i) + "";
            }
        }
        System.out.println(container);
    }
}
/*
2. Write a program that can find the unique characters from a string
without using indexOf() and lastIndexOf() methods
Ex:
str = "aabccdeef";
output:
bdf
 */
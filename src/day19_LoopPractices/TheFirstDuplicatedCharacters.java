package day19_LoopPractices;

public class TheFirstDuplicatedCharacters {
    public static void main(String[] args) {
        String str = "**ttyuıopgdfgdfgbcabycdefa";
        String container = "";
        String firstDuplicatedCharacter = "";
        String appearedTwice = "";
        String uniqueCharacters = "";
        char firstUniqueCharacter = ' ';
        int indexOfFirstUniqueCharacter = 0;
        for (int i = 0; i < str.length(); i++) {
            int frequency = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    frequency++;
                }
            }

            if (frequency > 1 && (!(container.contains("" + ch)))) {
                container += "" + ch;
            }
            if (frequency == 2) {
                appearedTwice += "" + ch;
            }
            if (frequency == 1) {
                uniqueCharacters += "" + ch;
            }
        }
        System.out.println("container = " + container);
        firstDuplicatedCharacter = container.substring(0, 1);
        System.out.println("firstDuplicatedCharacter = " + firstDuplicatedCharacter);
        System.out.println("Index of First Duplicated Character: " + str.indexOf(firstDuplicatedCharacter));
        System.out.println("appearedTwice = " + appearedTwice);
            firstUniqueCharacter= uniqueCharacters.charAt(0);
            indexOfFirstUniqueCharacter = str.indexOf(firstUniqueCharacter);
        System.out.println("uniqueCharacters = " + uniqueCharacters);
        System.out.println("indexOfFirstUniqueCharacter = " + indexOfFirstUniqueCharacter);
    }
}
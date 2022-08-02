package day18_NestedLoop;

import java.util.Scanner;

public class UniqueCharactersWithoutUsingIndexOrLastIndexVersion1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word"); //aab
        String word = scan.next();
        String container = "";
        for (int i = 0; i <= word.length() - 1; i++) {
            int frequency = 0;
            for (int j = 0; j <= word.length() - 1; j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                container += word.charAt(i) + "";
            }

        }
        System.out.println("container = " + container);
    }
}



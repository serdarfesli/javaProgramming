package day24_CustomMethods_Return;

public class ReturnMethodPractice3 {
    public static void main(String[] args) {

        System.out.println(frequency("Serdar",'f'));

    }

    public static int frequency(String word, char ch) {
        int frequency = 0;
        for (int i = 0; i < word.length(); i++) {
            if (ch == word.toLowerCase().charAt(i)) {
                frequency++;
            }
        }
        return frequency;
    }
}





/*
find unique characters.
 */
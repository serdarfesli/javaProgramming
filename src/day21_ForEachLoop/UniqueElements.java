package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {
        String[] words = {"Java", "Java", "C#", "Python", "Python"};
        for (String each : words) {
            int count = 0;
            for (String word : words) {
                if (word.equals("each")) {
                    count++;
                }
            }
        }

    }
}

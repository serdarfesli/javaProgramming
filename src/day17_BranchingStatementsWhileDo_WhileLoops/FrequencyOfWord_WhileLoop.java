package day17_BranchingStatementsWhileDo_WhileLoops;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String sentence = "cat cat cat dog cat dog dog cat cat";
        sentence = sentence.toLowerCase();
        int countCat = 0;
        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }
        System.out.println(countCat);
    }
}

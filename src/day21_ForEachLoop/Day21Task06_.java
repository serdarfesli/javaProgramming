package day21_ForEachLoop;

public class Day21Task06_ {
    public static void main(String[] args) {

        String sentence = " I love Java but Python is a little bit more popular. However Java is more used by SDETs.";
        String[] elements = sentence.split(" ");
        int numberOfJava = 0;
        int numberOfPython = 0;
        for (String each : elements) {
            if (each.equals("Java")) {
                numberOfJava++;
            }
            if (each.equals("Python")) {
                numberOfPython++;
            }
        }
        System.out.println("numberOfJava = " + numberOfJava);
        System.out.println("numberOfPython = " + numberOfPython);


    }
}
/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)

 */
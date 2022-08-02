package day17_BranchingStatementsWhileDo_WhileLoops;

import java.util.Scanner;

public class Day17Task04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String divisibleBy15 = "";
        String divisibleOnlyBy3 = "";
        String divisibleOnlyBy5 = "";

        int numbergiven = scan.nextInt();

        for (int i = 1; i <= numbergiven; i++) {
            if (i % 15 == 0) {
                divisibleBy15 += (i + " ");
            } else if (i % 3 == 0) {
                divisibleOnlyBy3 += (i + " ");
            }
            if (i % 5 == 0) {
                divisibleOnlyBy5 += (i + " ");
            }
        }
        System.out.println("Divisible By 15 " + divisibleBy15);
        System.out.println("Divisible By 3 " + divisibleOnlyBy3);
        System.out.println("Divisible By 5 " + divisibleOnlyBy5);


    }
}

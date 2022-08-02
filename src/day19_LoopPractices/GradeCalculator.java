package day19_LoopPractices;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your score");
            int score = scan.nextInt();
            if (!(score >= 0 && score <= 100)) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }
            String gradeByLetter = (score >= 90 && score <= 100) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D"
                    : "F";
            System.out.println("gradeByLetter = " + gradeByLetter);

            System.out.println("would you like to continue?");
            String answer = scan.next();
            if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("Invalid Entry");
                System.exit(0);
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                break;
            }
        }
    }
}


package day17_BranchingStatementsWhileDo_WhileLoops;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Will you marry me? yes/no");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.err.println("Invalid Answer, please re-enter a valid answer.");
            answer= scan.next().toLowerCase();
        }

        if(answer.equals("yes")){
            System.out.println("Congrats");
        } else {
            System.out.println("Goodbye");
        }

    }
}

package day17_BranchingStatementsWhileDo_WhileLoops;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();               //valid age 1~120
        while (!(age >= 1 && age <= 120)) {
            System.err.println("Please enter a valid age");
            age = scan.nextInt();
        }

        System.out.println("Are you a US citizen? yes/no");
        String citizen = scan.next();
        while (!(citizen.equalsIgnoreCase("yes") || citizen.equalsIgnoreCase("no"))){
            System.err.println("PLease enter a valid answer");
            citizen= scan.next();
        }
        if (age>=18 && citizen.equalsIgnoreCase("yes")){
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }


    }
}


package day17_BranchingStatementsWhileDo_WhileLoops;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z' ; i++) {
           if(i== 'G'){
               break;  // exits the loop
           }
            System.out.print(i + " ");
        }
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("Enter a number");
        int num =scan.nextInt();
while (num>0){
    System.out.println("enter a number");
    num= scan.nextInt();
}




    }
}

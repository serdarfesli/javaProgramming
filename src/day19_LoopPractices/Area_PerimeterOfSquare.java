package day19_LoopPractices;

import java.util.Scanner;

public class Area_PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the side of the square:");
            int side = scan.nextInt();
            if (side == 0 || side < 0) {
                System.err.println("Invalid Entry for the side of the square");
                System.exit(0);
            }
            int areaOfSquare = side * side;
            int perimeterOfSquare = 4 * side;
            System.out.println("areaOfSquare = " + areaOfSquare);
            System.out.println("perimeterOfSquare = " + perimeterOfSquare);

            System.out.println("Would you like to calculate another Square?");
            String answer = scan.next();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("invalid entry,please re-enter a valid answer");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Square Calculator APP");
                break;
            }
        }
    }
}

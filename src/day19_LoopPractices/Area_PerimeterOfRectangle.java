package day19_LoopPractices;

import java.util.Scanner;

public class Area_PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the length of the Rectangle:");
            int lenght = scan.nextInt();
            if (lenght == 0 || lenght < 0) {
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(0);
            }

            System.out.println("Enter the widht of the Rectangle:");
            int widht = scan.nextInt();
            if (widht == 0 || widht < 0) {
                System.err.println("Invalid Entry for the widht of the rectangle");
                System.exit(0);
            }

            int areaOfRectangle = widht * lenght;
            int perimeterOfRectangle = 2 * (widht + lenght);
            System.out.println("areaOfRectangle = " + areaOfRectangle);
            System.out.println("perimeterOfRectangle = " + perimeterOfRectangle);

            System.out.println("Would you like to calculate another Rectangle?");
            String answer = scan.next();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("invalid entry, please re-enter a valid entry -> yes/no");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
                break;
            }

        }
    }
}
/*
3. Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */
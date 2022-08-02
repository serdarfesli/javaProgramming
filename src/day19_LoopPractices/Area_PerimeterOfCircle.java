package day19_LoopPractices;

import java.util.Scanner;

public class Area_PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diameter = 0;
        int perimeter = 0;
        double area = 0.0;
        while (true) {
            System.out.println("Enter the radius of the circle");
            int radius = scan.nextInt();
            if (radius == 0 || radius < 0) {
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            diameter = 2 * radius;
            area = 3 * radius * radius;
            perimeter = 2 * 3 * radius;
            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("Would you like to calculate another circle?->yes/no");
            String answer = scan.next();
            while (!(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("yes"))) {
                System.err.println("invalid entry,please re-enter a valid answer");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Circle Calculator APP");
                break;
            }
        }
    }
}
/*
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */
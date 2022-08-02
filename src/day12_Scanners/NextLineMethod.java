package day12_Scanners;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Please enter your full name");
        String fullName = input.nextLine();
        System.out.println("Please enter your GPA");
        double gpa = input.nextDouble();
        input.nextLine();
        System.out.println("Please enter your School Name");
        String schoolName = input.nextLine();
        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("schoolName = " + schoolName);
        input.close();
    }
}

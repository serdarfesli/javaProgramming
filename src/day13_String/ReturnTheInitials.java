package day13_String;

import java.util.Scanner;

public class ReturnTheInitials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your First Name");
        String firstName = input.next();
        System.out.println("Please enter your Last Name");
        String lastName = input.next();
        char initial1 = firstName.charAt(0);
        char initial2 = lastName.charAt(0);
        String output = initial1 + "." + initial2;
        output = output.toUpperCase();
        System.out.println("output = " + output);

    }
}

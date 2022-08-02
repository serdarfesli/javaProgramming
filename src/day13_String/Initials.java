package day13_String;


import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your firstName");
        String firstName = input.next();
        System.out.println("Enter your lastName");
        String lastName = input.next();
        char first = firstName.charAt(0);
        char last = lastName.charAt(0);
        System.out.println(first + "," + last);
    }
}

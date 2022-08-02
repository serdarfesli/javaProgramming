package day13_String;

import java.util.Scanner;

public class LogInFunctionOfCybertek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = "";
        System.out.println("Username: ");
        String username = input.next();
        System.out.println("Password: ");
        String password = input.next();
        boolean loggedIn = username.equals("Cydeo") && password.equals("WoodenSpoon");
        if (loggedIn) {
            System.out.println("Logged in.");
        } else {
            System.err.println("Incorrect username or password");
        }
    }
}
/*
You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method
 */
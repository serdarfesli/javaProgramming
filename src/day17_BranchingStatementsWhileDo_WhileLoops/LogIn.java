package day17_BranchingStatementsWhileDo_WhileLoops;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        // username Cydeo
        // password : Cydeo123
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your username");
        String username = scan.next();
        System.out.println("enter your password");
        String password = scan.next();
        if (username.equals("Cydeo") && (password.equals("Cydeo123"))) {
            System.out.println("Logged in");
        } else {
            for (int i = 1; i <= 3; i++) {
                System.err.println(" Please re-enter your username");
                username = scan.next();
                System.err.println("Please re-enter your password");
                password = scan.next();
                if (username.equals("Cydeo") && (password.equals("Cydeo123"))) {
                    System.out.println("Logged in");
                    break;                                                      // exit loop
                }
                if(i==3 && !(username.equals("Cydeo") && (password.equals("Cydeo123")))){
                    System.err.println("Your account has been blocked");
                }
            }

        }
    }
}

        /*if (username.equals("Cydeo") && (password.equals("Cydeo123"))) {
            System.out.println("Logged in");
        } else {
            int times = 0;
            while (!(username.equals("Cydeo") && password.equals("Cydeo123")) && times < 3) {
                System.err.println(" Please re-enter your username");
                 username = scan.next();
                System.err.println("Please re-enter your password");
                 password = scan.next();
                times++;
            }
            if (username.equals("Cydeo") && (password.equals("Cydeo123"))) {
                System.out.println("Logged in");
            } else {
                System.err.println("Your account has been blocked");
            }
        }
        */




package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your age");
            int age = scan.nextInt();
            while (age < 0 || age > 120) {
                System.err.println("invalid age, please re-enter a valid age");
                age = scan.nextInt();
            }
            System.out.println("Would you like to continue?");
            String answer = scan.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("re - enter a valid entry");
                answer = scan.next().toLowerCase();
            }
            if (answer.equals("no")) {
                break;
            }
        }
    }
}

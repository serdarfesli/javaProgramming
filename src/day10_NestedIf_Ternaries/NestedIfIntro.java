package day10_NestedIf_Ternaries;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 95;
        if (score >= 0 && score <= 100) {
            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid Score");

        }

        System.out.println("----------------------------");

        int number = 7;
        if (number >= 1 && number <= 7) {//if the number is a valid number

            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thurday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }

        } else {   //if the number is invalid
            System.out.println("invalid number");
        }
    }
}




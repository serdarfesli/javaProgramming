package day23_CustomMethods_Void;

public class Day23TasksBetween01And05 {
    public static void main(String[] args) {
        printOdd1To100();
        System.out.println();
        printEven1To100();
        System.out.println();
        eligibleToBuyAlcohol(25);
        eligibleToVote(25, "England");
        calculateTheGrade(80);
    }

    public static void printOdd1To100() {
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }

    } //task1

    public static void printEven1To100() {
        for (int i = 2; i < 100; i += 2) {
            System.out.print(i + " ");
        }
    } //task2

    public static void eligibleToBuyAlcohol(int age) {
        if (age > 18) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("not eligible to buy alcohol");
        }
    }//task3

    public static void eligibleToVote(int age, String country) {
        if (age > 18 && country.equalsIgnoreCase("USA")) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("not eligible to Vote");
        }
    }//task4

    public static void calculateTheGrade(int score) {
        String grade = "";
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "FAILED";
        }
        System.out.println(grade);
    }//task5


}

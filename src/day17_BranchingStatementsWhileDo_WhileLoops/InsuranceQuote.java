package day17_BranchingStatementsWhileDo_WhileLoops;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double priceOfInsurance = 0.0;

        System.out.println("Enter your name"); //1
        String fullName = scan.nextLine();

        System.out.println("Enter your gender  female/male"); //2
        String gender = scan.next();
        while (!(gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male"))) {
            System.err.println("Re-enter a valid gender -> female/male");
            gender = scan.next();
        }

        System.out.println("Are you married -> Yes/No"); //3
        String marriedSituation = scan.next();
        while (!(marriedSituation.equalsIgnoreCase("yes") || marriedSituation.equalsIgnoreCase("no"))) {
            System.err.println("Re-enter a valid entry -> Yes/No");
            marriedSituation = scan.next();
        }

        System.out.println("How old are you?"); //4
        int age = scan.nextInt();
        while (!(age > 0 || age <= 120)) {
            System.err.println("Re-enter a valid entry -> Yes/No");
            age = scan.nextInt();
        }

        System.out.println("How many miles do you drive in a day?"); //5
        int mileDriven = scan.nextInt();
        while (mileDriven < 5) {
            System.err.println("Re-enter a valid entry -> Yes/No");
            mileDriven = scan.nextInt();
        }

        System.out.println("Do you want full coverage or liability insurance?"); //6 full coverage or liability
        scan.nextLine();
        String insuranceType = scan.nextLine();

        System.out.println("Did you have any accidents or claims in past 5 years -> yes/no"); //7
        String accidentOrClaims = scan.next().toLowerCase();
        while (!(accidentOrClaims.equals("yes") || accidentOrClaims.equals("no"))) {
            System.err.println("Re-enter a valid entry -> Yes/No");
            accidentOrClaims = scan.next();
        }

        System.out.println("Does your car have an anti-theft device-> yes/no"); //8
        String antiTheftAnswer = scan.next().toLowerCase();
        while (!(antiTheftAnswer.equals("yes") || antiTheftAnswer.equals("no"))) {
            System.err.println("Re-enter a valid entry -> Yes/No");
            antiTheftAnswer = scan.next().toLowerCase();
        }
        if (insuranceType.equals("liability")) {
            if (age >= 25) {
                priceOfInsurance += 50;
            } else {
                priceOfInsurance += 90;
            }

            if (mileDriven <= 10) {
                priceOfInsurance += 10;
            } else if (mileDriven > 10 && mileDriven <= 50) {
                priceOfInsurance += 30;
            } else {
                priceOfInsurance += 70;
            }
        } else if (insuranceType.equals("full coverage")) {
            if (age < 25) {
                priceOfInsurance += 160;
            } else if (insuranceType.equals("full coverage") && age >= 120) {
                priceOfInsurance += 120;
            }

            if (mileDriven <= 10) {
                priceOfInsurance += 20;
            } else if (mileDriven > 10 && mileDriven <= 50) {
                priceOfInsurance += 40;
            } else {
                priceOfInsurance += 70;
            }

        }
            if (antiTheftAnswer.equals("yes")){
                priceOfInsurance*= 0.95;
            }

            if (accidentOrClaims.equals("yes")){
                priceOfInsurance *= 1.15;
            } else{
                priceOfInsurance *= 0.90;
            }

            if (marriedSituation.equalsIgnoreCase("yes")){
                priceOfInsurance *= 0.95;
            }

        System.out.println("priceOfInsurance = " + priceOfInsurance);
        }
    }

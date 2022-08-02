package day13_String;

import java.util.Scanner;

public class calledTravel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int costOfTicket = 0;
        int totalCost = 0;
        int discount = 0;
        int costofPassportReneawal = 0;

        System.out.println("Valid Passport? Yes or No");
        String validPassportAnswer = input.next();

        if (validPassportAnswer.equals("Yes")) {
            System.out.println("Which country are you travelling");
            input.nextLine();
            String countryTraveling = input.nextLine();
            System.out.println("how many bags will you take with you");
            byte numberOfBags = input.nextByte();
            System.out.println("how many people will you travel with");
            short numberOfPeople = input.nextShort();
            System.out.println("Enter the name of the people you will travel with in one line, separating each name with a comma");
            input.nextLine();
            String nameOfPeople = input.nextLine();
            costOfTicket = 1000;
            if (numberOfPeople >= 3) {
                discount = 300;
            } else {
                discount = numberOfPeople * 100;
            }
            totalCost = costOfTicket + (numberOfBags * 50) - discount;
            System.out.println("Your ticket is booked to " + countryTraveling + ". We have charged extra for the " + numberOfBags +
                    " bags but you are traveling with " + numberOfPeople + " so we are giving a discount. Your total cost is " + totalCost);
        } else {
            costofPassportReneawal = 200;
            System.out.println("When did your passport expired");
            int expiryDateOfPassport = input.nextInt();
            int costExpiry = (2022 - expiryDateOfPassport) * 75;
            System.out.println("Which country are you travelling");
            input.nextLine();
            String countryTraveling = input.nextLine();
            totalCost = costofPassportReneawal + costExpiry;
            System.out.println("Will you plan to travel next year");
            String answerOfTravelPlan = input.next(); //Yes or No
            if (answerOfTravelPlan.equals("Yes")) {
                totalCost += 100;
            } else {
                totalCost -= 50;
            }
            System.out.println("Looks like your password has been expired for " + (2022 - expiryDateOfPassport) +
                    " years, but not to worry we will get it ready for you to travel to " + countryTraveling +
                    ". Your total cost has come out to " + totalCost + "$");

        }
    }
}

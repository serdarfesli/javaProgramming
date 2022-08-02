package day13_String;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalToPay, totalTip, totalPerPerson, tipPerPerson;
        totalToPay = 0;
        totalPerPerson = 0;
        tipPerPerson = 0;
        totalTip = 0;
        System.out.println("Split or No split (Yes or No)?");
        String splitOrNoSplit = input.next();
        System.out.println("Enter the number of people");
        int numberOfPeople = input.nextInt();
        System.out.println("Enter the check amount:");
        double checkAmount = input.nextDouble();
        System.out.println("How was the srvice quality? (Excellent/Great/Good/Fair/Poor)");
        String serviceQuality = input.next();
        System.out.println("Number of people entered: " + numberOfPeople);
        if (serviceQuality.equals("Excellent")) {
            totalToPay = checkAmount * 125 / 100;
        } else if (serviceQuality.equals("Great")) {
            totalToPay = checkAmount * 120 / 100;
        } else if (serviceQuality.equals("Good")) {
            totalToPay = checkAmount * 115 / 100;
        } else if (serviceQuality.equals("Fair")) {
            totalToPay = checkAmount * 110 / 100;
        } else {
            totalToPay = checkAmount * 105 / 100;
        }
        System.out.println("Total to pay: " + totalToPay);
        totalTip = totalToPay - checkAmount;
        System.out.println("Total tip: " + totalTip);
        if (splitOrNoSplit.equals("Yes")) {
            totalPerPerson = totalToPay / numberOfPeople;
            tipPerPerson = totalPerPerson - (checkAmount / numberOfPeople);
        } else if (splitOrNoSplit.equals("No")) {
            totalPerPerson = totalToPay;
            tipPerPerson = totalToPay - checkAmount;
        }
        System.out.println("Total per person: " + totalPerPerson);
        System.out.println("Tip per person: " + tipPerPerson);

    }
}
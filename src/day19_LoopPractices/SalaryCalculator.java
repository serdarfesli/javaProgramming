package day19_LoopPractices;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("How much you make an hour?");
            double hourlyRate = scan.nextDouble();
            if (hourlyRate <= 0) {
                System.err.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }
            System.out.println("How many hours do you work per week?");
            int weeklyHour = scan.nextInt();
            if (weeklyHour < 1 || weeklyHour > 144) {
                System.err.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }

            System.out.println("Enter your state tax rate");
            int stateTaxRate = scan.nextInt();
            if (stateTaxRate < 0 || stateTaxRate > 10) {
                System.err.println("Invalid Entry for state tax Rate");
                System.exit(0);
            }

            double grossSalary = hourlyRate * weeklyHour * 52;
            double federalTax = grossSalary * 26 / 100;
            double stateTax = grossSalary * stateTaxRate / 100;
            double totalTax = federalTax + stateTax;
            double netIncome = grossSalary - totalTax;

            System.out.println("grossSalary = " + grossSalary);
            System.out.println("federalTax = " + federalTax);
            System.out.println("stateTax = " + stateTax);
            System.out.println("totalTax = " + totalTax);
            System.out.println("netIncome = " + netIncome);

            System.out.println("Would you like to continue?");
            String answer = scan.next();
            if (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.err.println("Invalid Entry");
                System.exit(0);
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }
        }
    }
}

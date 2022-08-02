package day12_Scanners;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salary, stateTax, federalTax, totalTax, netIncome;
        System.out.println("Please enter your hourlyRate");
        double hourlyRate = scan.nextDouble();
        System.out.println("Please enter your weekly working hours");
        int weeklyWorkingHours = scan.nextInt();
        System.out.println("Please enter your State Tax Rate  % ");
        double stateTaxRate = scan.nextInt() / 100;
        System.out.println("Please enter your Federal Tax Rate  % ");
        double federalTaxRate = scan.nextInt() / 100;
        salary = hourlyRate * weeklyWorkingHours * 52;
        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        netIncome = salary - totalTax;
        System.out.println("netIncome = " + netIncome);
    }
}

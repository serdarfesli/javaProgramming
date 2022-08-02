package day09_IfElse;

public class CalculateTheSalary {
    public static void main(String[] args) {

        double salaryBeforeTax, salaryAfterTax, salaryMarriageIncluded;
        salaryBeforeTax = 130000;
        Boolean married = false;
        if (salaryBeforeTax >= 130000) {
            salaryAfterTax = salaryBeforeTax * 65 / 100;
        } else if (salaryBeforeTax >= 100000 && salaryBeforeTax < 130000) {
            salaryAfterTax = salaryBeforeTax * 70 / 100;
        } else if (salaryBeforeTax >= 80000 && salaryBeforeTax < 100000) {
            salaryAfterTax = salaryBeforeTax * 75 / 100;
        } else if (salaryBeforeTax >= 80000 && salaryBeforeTax < 100000) {
            salaryAfterTax = salaryBeforeTax * 75 / 100;
        } else {
            salaryAfterTax = salaryBeforeTax * 80 / 100;
        }

        if (married == true) {
            salaryMarriageIncluded = salaryAfterTax + salaryBeforeTax * 5 / 100;
        } else {
            salaryMarriageIncluded = salaryAfterTax;
        }
        System.out.println(salaryMarriageIncluded);
    }
}

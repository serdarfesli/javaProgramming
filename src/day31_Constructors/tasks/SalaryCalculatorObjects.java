package day31_Constructors.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class SalaryCalculatorObjects {
    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator(60,10,6,40);
        SalaryCalculator salary2 = new SalaryCalculator(40,4,6,40);
        SalaryCalculator salary3 = new SalaryCalculator(50,9,6,40);
        SalaryCalculator salary4 = new SalaryCalculator(30,5,6,40);
        SalaryCalculator salary5 = new SalaryCalculator(70,12,6,40);

        SalaryCalculator[] salaryArr = { salary1,salary2,salary3,salary4,salary5};
        ArrayList<SalaryCalculator> salaryList = new ArrayList<>(Arrays.asList(salaryArr));
        System.out.println("salaryList = " + salaryList);
        for (SalaryCalculator eachSalary : salaryArr) {
            System.out.println(eachSalary.salaryAfterTax());
        }


    }
}

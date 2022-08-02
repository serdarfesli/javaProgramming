package day31_Constructors.tasks;

public class SalaryCalculator {
    public double hourlyRate;
    public int stateTaxRate, federalTaxRate, weeklyHours;

    public SalaryCalculator(double hourlyRate, int stateTaxRate, int federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }
    public double salary(){
       double salary = hourlyRate * weeklyHours * 52;
       return salary;
    }
    public double stateTax(){
        double stateTax = salary()*stateTaxRate/100;
        return stateTax;
    }
    public double federalTax(){
        double federalTax = salary()*federalTaxRate/100;
        return federalTax;
    }

    public double salaryAfterTax(){
double salaryAfterTax = salary()-(stateTax()+federalTax());
return salaryAfterTax;
    }

    public String toString() {
        return "SalaryCalculator{" +
                "salary=" + salary() +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salaryAfterTax=" + salaryAfterTax() +
                '}';
    }
}

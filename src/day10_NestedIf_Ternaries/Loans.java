package day10_NestedIf_Ternaries;

public class Loans {
    public static void main(String[] args) {
        String result="";
        int salary = 70_000,
                credit_Score=1000;
        result= (salary>60_000 && credit_Score>650)? "Loan Approved" : "Loan Denied";

        System.out.println("result = " + result);
    }
}

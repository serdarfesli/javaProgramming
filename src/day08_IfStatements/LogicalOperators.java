package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
String name = "Steven";
        int age =19;
        String citizen ="North Korea";

        boolean isEligible = age >= 18 && citizen == "USA";
        System.out.println(name + " is elibile to vote: " + isEligible);

        System.out.println("--------------------------");

        String name2 = "Josh";
        int creditScore = 620;
        int age2 = 20;
        boolean isEligibleForLoan = creditScore >= 700 || age2 >=21;
        System.out.println(name2 + " is elibile for loan: " + isEligibleForLoan);


        System.out.println("-------------------------");
        String name4 ="James";
        String countryOfBirth ="USA";
        boolean marriedToUSCitizen = false;
        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
        System.out.println(name4 + " is eligible for US citizenship : " + isEligible4);


        System.out.println("----------------------------------------------------");

        String name5 ="Anna";
        double gpa =2.5;
        int familyIncome = 40000;
        boolean isEligibleForScholarship = gpa >= 3.5 || familyIncome <= 60000;
        System.out.println(name5 + " is eligible for scholarship: " + isEligibleForScholarship);

        boolean result5 = true;
        boolean result6 = !result5;
        System.out.println("result6 = " + result6);





        }

    }

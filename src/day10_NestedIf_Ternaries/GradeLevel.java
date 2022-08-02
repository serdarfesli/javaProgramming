package day10_NestedIf_Ternaries;

public class GradeLevel {
    public static void main(String[] args) {
        byte gradeLevel = 11;
        String result = "";

        if (gradeLevel >= 1 && gradeLevel <= 18) {
            if (gradeLevel >= 1 && gradeLevel <= 5) {
                result = "Elementary school";
            } else if (gradeLevel >= 6 && gradeLevel <= 8) {
                result = "Middle school";
            } else if (gradeLevel >= 9 && gradeLevel <= 12) {
                result = "High school";
            } else if (gradeLevel >= 13 && gradeLevel <= 16) {
                result = "College";
            } else {
                result = "Grad School";
            }

        } else {
            result = "Invalid Grade level Given";
        }

        System.out.println(result);
    }
}
/*
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
For Any Other grade: Invalid grade level given
NOTE: MUST USE NESTED IF.
DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */
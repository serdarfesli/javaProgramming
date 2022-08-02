package day10_NestedIf_Ternaries;

public class GradeReport {
    public static void main(String[] args) {
        int score = 200;
        String message = ""; //temporary value
        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                message = "Excellent";
            } else if (score >= 80) {
                message = "Great";
            } else if (score >= 70) {
                message = "Good";
            } else if (score >= 60) {
                message = "Passed";
            } else {
                message = "Failed";
            }
        } else {
            message = " invalid score";
        }
        System.out.println(message);

    }

}
/*
90~100:excellent
80-89: great
70-79  good
60-69 passed
0-59 failed
 */
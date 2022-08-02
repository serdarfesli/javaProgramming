package day10_NestedIf_Ternaries;

public class Grade {
    public static void main(String[] args) {
        char grade = 'F';
        String result = "";
        if ((grade >= 'A' && grade <= 'D') || grade=='F') {
            if (grade == 'A') {
                result = "excellent";
            } else if (grade == 'B') {
                result = "great job";
            } else if (grade == 'C') {
                result = "good";
            } else if (grade == 'D') {
                result = "passed";
            } else {
                result = "failed";
            }

        } else {
            result = "Invalid";

        }
        System.out.println("result = " + result);
    }
}

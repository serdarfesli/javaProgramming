package day24_CustomMethods_Return;

public class ReturnMethodPractice2 {
    public static void main(String[] args) {
String str = grade(70);
if (str.equals("A")){
    System.out.println("Excellent");
} else if (str.equals("B")) {
    System.out.println("Great");
}else if (str.equals("C")) {
    System.out.println("Good");
}else if (str.equals("D")) {
    System.out.println("Passed");
}else {
    System.out.println("Try again");
}


    }


    public static String grade(int score) {
        String grade = "";
        if (score <= 100 || score >= 0) {
            grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        } else {
                System.out.println("Invalid score");
            }
        return grade;
        }
    }



/*calculate the grade

check the grade
'A'-excellent
'B' - Great

*/

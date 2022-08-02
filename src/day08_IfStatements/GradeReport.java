package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {

int score =85;
 if(score >= 90 ){
     System.out.println("The score " + score + " is excellent");
 }
 if(90 > score && score >=80) {
            System.out.println("The score " + score + " is Great");



    }
}
}
/*
90-100    excellent
80-89  Great
70-79 Good
60-69 Passed
0-59 Failed


 */
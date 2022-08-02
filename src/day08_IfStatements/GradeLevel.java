package day08_IfStatements;

public class GradeLevel {
    public static void main(String[] args) {
        byte gradeLevel = 13;
        boolean elementary = gradeLevel >= 1 && gradeLevel <= 5;
        boolean middleSchool = gradeLevel >= 6 && gradeLevel <= 8;
        boolean highSchool = gradeLevel >= 9 && gradeLevel <= 12;
        boolean college = gradeLevel >= 13 && gradeLevel <= 16;
        boolean gradSchool = gradeLevel >= 17 && gradeLevel <= 18;

        if (elementary) {
            System.out.println("Elementary school ");
        }
        if (middleSchool) {
            System.out.println("Middle School");
        }
        if (highSchool) {
            System.out.println("High school");
        }
        if (college) {
            System.out.println("college");
        }
        if (gradSchool) {
            System.out.println("Grad School");
        }
    }


}

package day09_IfElse;

public class AgeGroups {
    public static void main(String[] args) {
        int ageRange = 90;
        String Message;
        if (ageRange >= 1 && ageRange <= 2) {
            Message = "Infant";
        } else if (ageRange >= 3 && ageRange <= 5) {
            Message = "Toddler";
        } else if (ageRange >= 6 && ageRange <= 9) {
            Message = "Kid";
        } else if (ageRange >= 10 && ageRange <= 12) {
            Message = "Pre-Teen";
        } else if (ageRange >= 13 && ageRange <= 17) {
            Message = "Teenager";
        } else if (ageRange >= 18 && ageRange <= 20) {
            Message = "Young Adult";
        } else if (ageRange >= 21 && ageRange <= 39) {
            Message = "Adult";
        } else if (ageRange >= 40 && ageRange <= 49) {
            Message = "Young Middle-Aged Adult";
        } else if (ageRange >= 50 && ageRange <= 54) {
            Message = "Middle-Aged Adult";
        } else if (ageRange >= 55 && ageRange <= 64) {
            Message = "Very Young Senior Citizen";
        } else if (ageRange >= 65 && ageRange <= 74) {
            Message = "Young Senior Citizen";
        } else if (ageRange >= 75 && ageRange <= 84) {
            Message = "Senior Citizen";
        } else {
            Message = "Old Senior Citizen";
        }
        System.out.println(Message);
    }
}




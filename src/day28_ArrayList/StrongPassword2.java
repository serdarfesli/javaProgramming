package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

        String password = "cydaslş1990**";
        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;
        int countSpecial = 0;

        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each) == true) {
                countUpper++;
            } else if (Character.isLowerCase(each)) {
                countLower++;
            } else if (Character.isDigit(each)) {
                countDigit++;
            } else {
                countSpecial++;
            }
        }
        boolean hasUpper = countUpper > 0;
        boolean hasLower = countLower > 0;
        boolean hasDigit = countDigit > 0;
        boolean hasSpecial = countSpecial > 0;

        if (hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Strong Password");
        }else{
            System.out.println("weak password");
        }
    }
}






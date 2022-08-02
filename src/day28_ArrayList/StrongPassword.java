package day28_ArrayList;

public class StrongPassword {
    public static void main(String[] args) {

        String password = "1A2*34abcd";
        char[] arr = password.toCharArray();
        boolean containUpperCase = false;
        boolean containLowercase = false;
        boolean containSpecialChar = false;
        boolean containDigit = false;

        for (char eachchar : arr) {
            if (Character.isUpperCase(eachchar)){
                containUpperCase=true;
            }
            if (Character.isLowerCase(eachchar)){
                containLowercase=true;
            }
            if (!Character.isLetterOrDigit(eachchar)){
                containSpecialChar=true;
            }
             if (Character.isDigit(eachchar)){
                containDigit=true;
            }
        }
        if (containDigit == true && containLowercase == true &&
                containUpperCase == true && containSpecialChar == true && password.length() >= 8) {
            System.out.println("strong password");
        } else {
            System.out.println("please enter a strong password");
        }
    }
}

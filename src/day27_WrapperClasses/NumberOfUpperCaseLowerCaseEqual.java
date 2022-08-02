package day27_WrapperClasses;

public class NumberOfUpperCaseLowerCaseEqual {
    public static void main(String[] args) {
        String str = "JAVAj Jjava";
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each) == true) {
                upperCaseCount++;
            } else if (Character.isLowerCase(each) == true) {
                lowerCaseCount++;
            }
        }
        if (upperCaseCount == lowerCaseCount) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

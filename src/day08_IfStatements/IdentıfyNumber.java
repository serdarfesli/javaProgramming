package day08_IfStatements;

public class IdentıfyNumber {

    public static void main(String[] args) {
        int number = -282;
        boolean positiveNumber = number > 0;
        boolean negativeNumber = number < 0;
        boolean zero = number == 0;
        System.out.println( number + " is positive number: " + positiveNumber);
        System.out.println(number + " is negative number: " + negativeNumber);
        System.out.println(number + " is zero: " + zero);
    }
}

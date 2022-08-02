package day09_IfElse;

public class PosNegZero {
    public static void main(String[] args) {
        int n = -20;
        if (n > 0) {
            System.out.println(n + " is a positive number");
        } else if (n == 0) {
            System.out.println(n + " is zero");
        } else {
            System.out.println(n + " is a negative number");
        }
    }
}

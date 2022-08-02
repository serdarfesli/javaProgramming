package day09_IfElse;

public class FINRA {
    public static void main(String[] args) {
        int number = 31;

        if (number % 3 == 0 && number % 15 != 0) {
            System.out.println("FIN");
        } else if (number % 5 == 0 && number % 15 != 0) {
            System.out.println("RA");
        } else if (number % 15 == 0) {
            System.out.println("FINRA");
        } else {
            System.out.println(number);
        }
    }
}


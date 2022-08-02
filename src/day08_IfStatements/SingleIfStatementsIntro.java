package day08_IfStatements;

public class SingleIfStatementsIntro {
    public static void main(String[] args) {

        int number = 301;
        boolean evenNumber = number % 2 == 0;
        if (evenNumber) {
            System.out.println(number + " is Even Number");
        }
        if (!evenNumber) {
            System.out.println(number + " is Odd Number");
        }
    }
}

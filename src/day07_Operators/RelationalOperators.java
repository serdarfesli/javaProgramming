package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
// > , >= , <, <=
        boolean result1 = 20 <= 40;
        System.out.println("result1 = " + result1);

//credit score of 720
        int score = 745;
        boolean eligible = score >= 720;
        System.out.println("eligible = " + eligible);

        boolean check1 = 100 != 150;
        System.out.println("check1 = " + check1);
        boolean check2 = 100 == 150;
        System.out.println("check2 = " + check2);




    }
}

package day07_Operators;

public class SwipeVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = b;
        System.out.println("a = " + a);
        a = 10;
        b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }


}

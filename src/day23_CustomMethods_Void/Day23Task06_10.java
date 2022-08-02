package day23_CustomMethods_Void;

public class Day23Task06_10 {
    public static void main(String[] args) {
        areaOfCircle(3.5);
        areaOfSquare(4);
        dollarToEuro(10);
        liraToDollar(100);
    }

    public static void areaOfCircle(double radius) {
        double areaOfCircle = 3.14 * radius * radius;
        System.out.println("areaOfCircle = " + areaOfCircle);
    } //task6

    public static void areaOfSquare(int side) {
        int areaOfSquare = side * side;
        System.out.println("areaOfSquare = " + areaOfSquare);
    } //task7

    public static void dollarToEuro(int numberOfDollars) {
        double euro = numberOfDollars * 1.04;
        System.out.println("euro = " + euro);
    } //task9

    public static void liraToDollar(int numberOfLira) {
        double dollar = numberOfLira / 16.68;
        System.out.println("dollar = " + dollar);
    } // task10


}

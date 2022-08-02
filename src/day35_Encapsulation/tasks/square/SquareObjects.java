package day35_Encapsulation.tasks.square;

import day35_Encapsulation.tasks.square.Square;

public class SquareObjects {
    public static void main(String[] args) {
        Square square1 = new Square(-1);
        System.out.println(square1);
        square1.setSide(4);
        System.out.println(square1);
        System.out.println(square1.calcPerimeter());
    }
}
